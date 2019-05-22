package Paquete;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JuntaDB {

    public static List<Socio> recogidaSociosVentanaJunta() {
        List<Socio> socios = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            String sql = "SELECT S.ID_SOCIO, P.TIPO, S.NOMBRE, S.APELLIDOS, S.DNI, S.TELEFONO, S.FECHA_ALTA,N.FECHA_INI \n" +
                    "FROM SOCIOS S RIGHT JOIN NOMBRAMIENTOS N ON N.ID_SOCIO = S.ID_SOCIO\n" +
                    "LEFT JOIN CARGOS P ON P.ID_CARGO = N.ID_CARGO";

            ResultSet resultado = statement.executeQuery(sql);

            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                LocalDate fechaInicioNombramiento = null;
                LocalDate fechaAlta = null;

                if (resultado.getString("FECHA_INI") != null)
                    fechaInicioNombramiento = LocalDate.parse(resultado.getString("FECHA_INI").substring(0, 10));

                if (resultado.getString("FECHA_ALTA") != null)
                    fechaAlta = LocalDate.parse(resultado.getString("FECHA_ALTA").substring(0, 10));

                Socio socio = new Socio();

                socio.setId_socio(resultado.getInt("ID_SOCIO"));
                socio.setTipoCargo(new Cargo(resultado.getString("TIPO")));
                socio.setNombre(resultado.getString("NOMBRE"));
                socio.setApellidos(resultado.getString("APELLIDOS"));
                socio.setDni(resultado.getString("DNI"));
                socio.setTelefono(resultado.getInt("TELEFONO"));
                socio.setFechaAlta(fechaAlta);
                socio.setFechaInicioNombramiento(fechaInicioNombramiento);

                socios.add(socio);
            }

            return socios;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return socios;
    }

    public static boolean guardarCargosJunta(Socio socio) {

        //todo: poner comrpobacion de edad y asignar un responsable. Poner en otro panel boton de eliminar al usuario

        Connection conn = Conexion.conecta();

        try {

            String sql = "INSERT INTO NOMBRAMIENTOS(ID_CARGO, ID_SOCIO, FECHA_INI, FECHA_FIN) VALUES (?, ?, ?, ?)";

            PreparedStatement st = conn.prepareStatement(sql);

            st.setInt(1, socio.getTipoCargo().getIdCargo());
            st.setInt(2, socio.getId_socio());
            st.setObject(3, socio.getFechaInicioNombramiento());
            st.setObject(4, socio.getFechaFinNombramiento());


            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean editarCargosJunta(Socio socio) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "UPDATE NOMBRAMIENTOS SET FECHA_FIN = ? " +
                    "WHERE ID_SOCIO = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            st.setObject(1, socio.getFechaFinNombramiento());
            st.setInt(2, socio.getId_socio());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean borrarCargoJunta(int id_socio) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "DELETE FROM NOMBRAMIENTOS WHERE ID_SOCIO = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setInt(1, id_socio);

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
