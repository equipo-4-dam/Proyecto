package Paquete;

import java.sql.*;
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

    public static boolean guardarTipoCuota(TipoCuota tipoCuota) {

        Connection conn = Conexion.conecta();

        try {

            PreparedStatement st = conn.prepareStatement(
                    "INSERT INTO TIPO_CUOTAS (CANTIDAD, EDAD_LIMITE, NOMBRE) VALUES (?, ?, ?)");

            st.setInt(1, tipoCuota.getCantidad());
            st.setInt(2, tipoCuota.getEdad_limite());
            st.setString(3, tipoCuota.getNombre());

            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean editarTipoCuota(TipoCuota tipoCuota) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "UPDATE TIPO_CUOTAS SET CANTIDAD = ?, EDAD_LIMITE = ?, NOMBRE = ? WHERE ID_CUOTA = ?";

           // sql += "WHERE ID_CUOTA = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setInt(1, tipoCuota.getCantidad());
            st.setInt(2, tipoCuota.getEdad_limite());
            st.setString(3,tipoCuota.getNombre());
            st.setInt(4, tipoCuota.getId_cuota());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean borrarTipoCuota(int id_cuota) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "DELETE FROM TIPO_CUOTAS WHERE ID_CUOTA = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setInt(1, id_cuota);

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
