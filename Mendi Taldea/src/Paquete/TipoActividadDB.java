package Paquete;

import java.sql.*;
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

    public static boolean guardarTipoActividad(TipoActividad tipo) {

        Connection conn = Conexion.conecta();

        try {

            PreparedStatement st = conn.prepareStatement("INSERT INTO TIPO_ACTIVIDADES(TIPO) VALUES (?)");

            //prepara la insert
            st.setString(1, tipo.getTipo());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }


    }

    public static boolean editarTipoActividad(TipoActividad tipoActividad) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "UPDATE TIPO_ACTIVIDAD SET TIPO = ?";

            sql += "WHERE ID_TIPO = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setString(1, tipoActividad.getTipo());
            st.setInt(2, tipoActividad.getId_tipo());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean borrarTipoActividad(int id_tipo) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "DELETE FROM TIPO_ACTIVIDADES WHERE ID_TIPO = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setInt(1, id_tipo);

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


