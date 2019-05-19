package Paquete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ActividadDB {

    public static List<Actividad> recogidaActividad() {

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<Actividad> actividades = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            ResultSet resultado = statement.executeQuery("SELECT * FROM ACTIVIDADES");


            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                Actividad actividad = new Actividad(
                        resultado.getInt("ID_ACTIVIDAD"),
                        LocalDate.parse(resultado.getString("FECHA")),
                        resultado.getString("DESCRIPCION"),
                        resultado.getString("DIFICULTAD"),
                        resultado.getInt("PRECIO"),
                        resultado.getString("MOTIVO_CANCELACION"),
                        resultado.getBoolean("REALIZACION"),
                        resultado.getInt("ID_TIPO"),
                        resultado.getInt("ORGANIZADOR")
                );

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                actividades.add(actividad);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return actividades;
    }
}
