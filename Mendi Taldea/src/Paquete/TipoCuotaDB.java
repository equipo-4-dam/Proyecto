package Paquete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoCuotaDB {

    public static List<TipoCuota> recogidaTipoCuota() {

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<TipoCuota> tipoCuotas = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            ResultSet resultado = statement.executeQuery("SELECT * FROM TIPO_CUOTAS");


            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                TipoCuota tipoCuota = new TipoCuota(
                        resultado.getInt("ID_CUOTA"),
                        resultado.getInt("CANTIDAD"),
                        resultado.getInt("EDAD_LIMITE"),
                        resultado.getString("NOMBRE")
                );

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                tipoCuotas.add(tipoCuota);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoCuotas;
    }
}
