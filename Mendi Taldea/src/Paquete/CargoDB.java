package Paquete;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CargoDB {

    public static List<Cargo> recogidaCargos() {

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<Cargo> cargos = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            ResultSet resultado = statement.executeQuery("SELECT * FROM CARGOS");


            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                Cargo cargo = new Cargo(
                        resultado.getInt("ID_CARGO"),
                        resultado.getString("TIPO")
                );

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                cargos.add(cargo);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cargos;
    }

    public static boolean guardarCargo(Cargo cargo) {

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conn = Conexion.conecta();

        try {

            PreparedStatement st = conn.prepareStatement("INSERT INTO CARGOS(TIPO) VALUES (?)");

            //prepara la insert
            st.setString(1, cargo.getTipo());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean editarCargo(Cargo cargo) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "UPDATE CARGOS SET TIPO = ?";

            sql += "WHERE ID_SOCIO = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setString(1, cargo.getTipo());
            st.setInt(2, cargo.getIdCargo());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }

    }

    public static boolean borrarCargos(int idCargo) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "DELETE FROM CARGOS WHERE ID_CARGO = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setInt(1, idCargo);

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

