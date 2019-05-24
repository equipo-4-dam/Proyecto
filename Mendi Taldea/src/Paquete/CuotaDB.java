package Paquete;

import java.sql.*;


public class CuotaDB {

    public static boolean guardarCuotas(Socio socio) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "INSERT INTO CUOTAS (ID_SOCIO,ID_CUOTA,FECHA_PAGO,PAGADO) VALUES (?,?,?,1)";

            PreparedStatement st = conn.prepareStatement(sql);

            st.setObject(1, socio.getId_socio());
            st.setObject(2, socio.getTipoCuota().getId_cuota());
            st.setObject(3, socio.getFechaPago());

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
