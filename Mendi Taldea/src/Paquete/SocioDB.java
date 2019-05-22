package Paquete;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SocioDB {

    public static List<Socio> recogidaSocios() {

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<Socio> socios = new ArrayList<>();

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            String sql = "SELECT S.ID_SOCIO, S.NOMBRE, S.APELLIDOS, S.FECHA_NAC, S.DNI, S.TELEFONO, S.EMAIL, " +
                    "S.RESPONSABLE, S.PERFIL, S.FECHA_ALTA, S.FECHA_BAJA, C.FECHA_PAGO, C.PAGADO " +
                    "FROM SOCIOS S LEFT JOIN CUOTAS C ON S.ID_SOCIO = C.ID_SOCIO ORDER BY ID_SOCIO ";

            ResultSet resultado = statement.executeQuery(sql);

            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                LocalDate fechaBaja = null;
                LocalDate fechaPago = null;


                if (resultado.getString("FECHA_BAJA") != null)
                    fechaBaja = LocalDate.parse(resultado.getString("FECHA_BAJA").substring(0, 10));

                if (resultado.getString("FECHA_PAGO") != null)
                    fechaPago = LocalDate.parse(resultado.getString("FECHA_PAGO").substring(0, 10));

                Socio socio = new Socio(
                        resultado.getInt("ID_SOCIO"),
                        resultado.getString("NOMBRE"),
                        resultado.getString("APELLIDOS"),
                        LocalDate.parse(resultado.getString("FECHA_NAC").substring(0, 10)),
                        resultado.getString("DNI"),
                        resultado.getInt("TELEFONO"),
                        resultado.getString("EMAIL"),
                        new Socio(resultado.getInt("RESPONSABLE")),
                        resultado.getString("PERFIL"),
                        LocalDate.parse(resultado.getString("FECHA_ALTA").substring(0, 10)),
                        fechaBaja,
                        fechaPago,
                        resultado.getInt("PAGADO")

                );

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                socios.add(socio);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return socios;
    }

    public static boolean guardarSocio(Socio socio) {

        //todo: poner comrpobacion de edad y asignar un responsable. Poner en otro panel boton de eliminar al usuario

        Connection conn = Conexion.conecta();

        try {

            String sql = "INSERT INTO SOCIOS(NOMBRE, APELLIDOS, FECHA_NAC, DNI, " +
                    "TELEFONO, EMAIL, FECHA_ALTA, FECHA_BAJA";

            if (socio.getResponsable() != null)
                sql += ", RESPONSABLE) ";
            else
                sql += ")";

            if (socio.getResponsable() != null)
                sql += "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            else
                sql += "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";


            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setString(1, socio.getNombre());
            st.setString(2, socio.getApellidos());
            st.setObject(3, socio.getFecha());
            st.setString(4, socio.getDni());
            st.setInt(5, socio.getTelefono());
            st.setString(6, socio.getEmail());
            st.setObject(7, socio.getFechaAlta());
            st.setObject(8, socio.getFechaBaja());

            if (socio.getResponsable() != null)
                st.setInt(9, socio.getResponsable().getId_socio());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public static boolean editarSocio(Socio socio) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "UPDATE SOCIOS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NAC = ?, DNI = ?, " +
                    "TELEFONO = ?, EMAIL = ?, FECHA_ALTA = ?, FECHA_BAJA = ?";

            if (socio.getResponsable() != null)
                sql += ", RESPONSABLE = ? ";

            sql += "WHERE ID_SOCIO = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setString(1, socio.getNombre());
            st.setString(2, socio.getApellidos());
            st.setObject(3, socio.getFecha());
            st.setString(4, socio.getDni());
            st.setInt(5, socio.getTelefono());
            st.setString(6, socio.getEmail());
            st.setObject(7, socio.getFechaAlta());
            st.setObject(8, socio.getFechaBaja());

            if (socio.getResponsable() != null) {
                st.setInt(9, socio.getResponsable().getId_socio());
                st.setInt(10, socio.getId_socio());

            } else
                st.setInt(9, socio.getId_socio());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }

    }

    public static boolean borrarSocio(int id_socio) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "DELETE FROM SOCIOS WHERE ID_SOCIO = ?";

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
