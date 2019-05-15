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

            ResultSet resultado = statement.executeQuery("SELECT * FROM SOCIOS");


            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                Socio socio = new Socio(
                        resultado.getInt("ID_SOCIO"),
                        resultado.getString("NOMBRE"),
                        resultado.getString("APELLIDOS"),
                        LocalDate.parse(resultado.getString("FECHA_NAC").substring(0,10)),
                        resultado.getString("DNI"),
                        resultado.getInt("TELEFONO"),
                        resultado.getString("EMAIL"),
                        resultado.getInt("RESPONSABLE"),
                        resultado.getString("PERFIL"),
                        LocalDate.parse(resultado.getString("FECHA_ALTA").substring(0,10)),
                        LocalDate.parse(resultado.getString("FECHA_BAJA").substring(0,10))
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
