package Paquete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CuotaDB {

    public static List<Cuota> recogidaCuotas() {

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<Cuota> cuotas = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            ResultSet resultado = statement.executeQuery("SELECT * FROM CUOTAS");


            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                Cuota cuota = new Cuota(
                        resultado.getInt("ID_SOCIO"),
                        resultado.getInt("ID_CUOTA"),
                        LocalDate.parse(resultado.getString("FECHA_PAGO").substring(0,10)),
                        resultado.getInt("PAGADO")
                );

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                cuotas.add(cuota);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cuotas;
    }
}
