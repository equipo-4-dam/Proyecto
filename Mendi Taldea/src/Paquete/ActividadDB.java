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

                Actividad actividad = new Actividad(
                        LocalDate.parse(resultado.getString("FECHA").substring(0, 10)),
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

            PreparedStatement st = conn.prepareStatement("UPDATE ACTIVIDADES SET DESCRIPCION = ?, " +
                    "DIFICULTAD = ?, PRECIO = ?, ORGANIZADOR = ?, ID_TIPO = ? WHERE ID_ACTIVIDAD = ?");

            st.setString(1, actividad.getDescripcion());
            st.setString(2, actividad.getDificultad());
            st.setInt(3, actividad.getPrecio());
            st.setInt(4, actividad.getOrganizador());
            st.setInt(5, actividad.getTipoActividad().getId_tipo());
            st.setInt(6, actividad.getId_actividad());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static List<Actividad> recogidaFechas() {

        Connection conn = Conexion.conecta();

        List<Actividad> actividades = new ArrayList<>();
        try {

            PreparedStatement st = conn.prepareStatement("SELECT ID_ACTIVIDAD, FECHA FROM ACTIVIDADES WHERE ORGANIZADOR IS NULL");


            ResultSet rs = st.executeQuery();

            LocalDate fechaPropuesta = null;

            while (rs.next()) {

                if (rs.getString("FECHA") != null)
                    fechaPropuesta = LocalDate.parse(rs.getString("FECHA").substring(0, 10));

                actividades.add(new Actividad(rs.getInt("ID_ACTIVIDAD"), fechaPropuesta));

            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());

        }

        return actividades;

    }

    public static boolean guardarActVacia(Actividad actividad) {

        Connection conn = Conexion.conecta();

        try {

            PreparedStatement st = conn.prepareStatement("INSERT INTO ACTIVIDADES (FECHA) VALUES (?)");


            st.setObject(1, actividad.getFecha());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }

    }

    public static boolean apuntarse(int idSociologeado, Actividad actividad) {

        Connection conn = Conexion.conecta();

        try {

            PreparedStatement st = conn.prepareStatement(
                    "INSERT INTO PARTICIPANTES VALUES (ID_SOCIO = " + idSociologeado +
                            ", ID_ACTIVIDAD = " + actividad.getId_actividad()+");");

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }

    }

    public static List<Actividad> recogidaActividadPersonal() {

        List<Actividad> actividades = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            ResultSet resultado = statement.executeQuery("SELECT A.ORGANIZADOR, A.FECHA, A.DIFICULTAD, A.PRECIO, \n" +
                    "A.DESCRIPCION, T.TIPO, P.ID_SOCIO \n" +
                    "FROM ACTIVIDADES A JOIN TIPO_ACTIVIDADES T ON A.ID_TIPO = T.ID_TIPO\n" +
                    "JOIN PARTICIPANTES P ON A.ID_ACTIVIDAD = P.ID_ACTIVIDAD");

            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                Actividad actividad = new Actividad(
                        LocalDate.parse(resultado.getString("FECHA").substring(0, 10)),
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
}
