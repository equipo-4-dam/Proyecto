package Paquete;

import java.sql.*;
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

            ResultSet resultado = statement.executeQuery("SELECT A.ORGANIZADOR, A.FECHA, A.DIFICULTAD, A.PRECIO, " +
                    "A.DESCRIPCION, T.TIPO FROM ACTIVIDADES A, TIPO_ACTIVIDADES T WHERE A.ID_TIPO = T.ID_TIPO");

            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

              /*  Actividad actividad = new Actividad(
                        resultado.getInt("ID_ACTIVIDAD"),
                        LocalDate.parse(resultado.getString("FECHA").substring(0,10)),
                        resultado.getString("DESCRIPCION"),
                        resultado.getString("DIFICULTAD"),
                        resultado.getInt("PRECIO"),
                        resultado.getString("MOTIVO_CANCELACION"),
                        resultado.getBoolean("REALIZACION"),
                        resultado.getInt("ID_TIPO"),
                        resultado.getInt("ORGANIZADOR"),
                        resultado.getInt("ID_TIPO")
                );

               */

              Actividad actividad = new Actividad(
                      LocalDate.parse(resultado.getString("FECHA").substring(0,10)),
                      resultado.getString("DESCRIPCION"),
                      resultado.getString("DIFICULTAD"),
                      resultado.getInt("PRECIO"),
                      resultado.getInt("ORGANIZADOR"),
                      new TipoActividad(resultado.getString("TIPO")
                      ));

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                actividades.add(actividad);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return actividades;
    }

    public static boolean guardarActividad(Actividad actividad) {

        Connection conn = Conexion.conecta();

        try {

            PreparedStatement st = conn.prepareStatement("INSERT INTO ACTIVIDADES(FECHA, DESCRIPCION, DIFICULTAD, " +
                    "PRECIO) VALUES (?, ?, ?, ?)");

            st.setObject(1, actividad.getFecha());
            st.setString(2, actividad.getDescripcion());
            st.setString(3, actividad.getDificultad());
            st.setInt(4, actividad.getPrecio());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }
}
