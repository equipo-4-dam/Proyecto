package Paquete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoActividadDB {

    public static List<TipoActividad> recogidaTipoActividad() {

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<TipoActividad> tipoActividades = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            ResultSet resultado = statement.executeQuery("SELECT * FROM TIPO_ACTIVIDADES");


            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                TipoActividad tipoActividad = new TipoActividad(
                        resultado.getInt("ID_TIPO"),
                        resultado.getString("TIPO")
                );

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                tipoActividades.add(tipoActividad);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoActividades;
    }
}
