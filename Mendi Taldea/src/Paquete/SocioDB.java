package Paquete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SocioDB {

    public static List<Socio> recogidaSocios() {

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<Socio> socios = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            String sql = "SELECT S.ID_SOCIO, S.NOMBRE, S.APELLIDOS, S.FECHA_NAC, S.DNI, S.TELEFONO, S.EMAIL, " +
                    "S.RESPONSABLE, S.PERFIL, S.FECHA_ALTA, S.FECHA_BAJA, C.FECHA_PAGO, C.PAGADO " +
                    "FROM SOCIOS S LEFT JOIN CUOTAS C ON S.ID_SOCIO = C.ID_SOCIO";
            ResultSet resultado = statement.executeQuery(sql);


            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                LocalDate fechaBaja = null;
                LocalDate fechaPago = null;

                if (resultado.getString("FECHA_BAJA") != null)
                    fechaBaja = LocalDate.parse(resultado.getString("FECHA_BAJA").substring(0, 10));

                if (resultado.getString("FECHA_PAGO") != null)
                    fechaPago = LocalDate.parse(resultado.getString("FECHA_PAGO").substring(0, 10));

                Socio socio = new Socio(
                        resultado.getInt("ID_SOCIO"),
                        resultado.getString("NOMBRE"),
                        resultado.getString("APELLIDOS"),
                        LocalDate.parse(resultado.getString("FECHA_NAC").substring(0, 10)),
                        resultado.getString("DNI"),
                        resultado.getInt("TELEFONO"),
                        resultado.getString("EMAIL"),
                        new Socio(resultado.getInt("RESPONSABLE")),
                        resultado.getString("PERFIL"),
                        LocalDate.parse(resultado.getString("FECHA_ALTA").substring(0, 10)),
                        fechaBaja,
                        fechaPago,
                        resultado.getInt("PAGADO")

                );

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                socios.add(socio);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return socios;
    }

}
