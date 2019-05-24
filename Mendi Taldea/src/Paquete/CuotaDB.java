package Paquete;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CuotaDB {

    /*public static List<Socio> recogidaCuotas() {
        List<Socio> socios = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            String sql = "SELECT S.NOMBRE, S.APELLIDOS, T.NOMBRE, T.CANTIDAD, C.FECHA_PAGO, C.PAGADO\n" +
                    "FROM SOCIOS S, TIPO_CUOTAS T, CUOTAS C\n" +
                    "WHERE S.ID_SOCIO = C.ID_SOCIO AND C.ID_CUOTA = T.ID_CUOTA;";

            ResultSet resultado = statement.executeQuery(sql);

            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                LocalDate fechaPago = null;

                if (resultado.getString("FECHA_PAGO") != null)
                    fechaPago = LocalDate.parse(resultado.getString("FECHA_PAGO").substring(0, 10));

                Socio socio = new Socio();



                socio.setTipoCargo(new Cargo(resultado.getString("TIPO")));
                socio.setNombre(resultado.getString("NOMBRE"));
                socio.setApellidos(resultado.getString("APELLIDOS"));
                socio.setDni(resultado.getString("DNI"));
                socio.setTelefono(resultado.getInt("TELEFONO"));
                //socio.setFechaAlta(fechaAlta);
                //socio.setFechaInicioNombramiento(fechaInicioNombramiento);

                socios.add(socio);
            }

            return socios;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return socios;
    }

     */

    public static boolean guardarCuotas(Socio socio) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "INSERT INTO CUOTAS(FECHA_PAGO) VALUES (?)";

            PreparedStatement st = conn.prepareStatement(sql);

            st.setObject(1, socio.getFechaPago());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean editarCuotas(Socio socio) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "UPDATE CUOTAS SET FECHA_PAGO = ? WHERE ID_SOCIO = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            st.setObject(1, socio.getFechaPago());
            st.setInt(2, socio.getId_socio());
            //st.setInt(3, socio.getTipoCuota().getId_cuota());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean borrarCuotas(int id_socio) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "DELETE FROM CUOTAS WHERE ID_SOCIO = ?";

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
