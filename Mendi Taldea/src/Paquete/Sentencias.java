package Paquete;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sentencias {

    /////////////////////////////VENTANA CARGO/////////////////////////////

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
/*
    public static List<Cargo> recogidaCargos() {

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.conecta();

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<Cargo> cargos = new ArrayList<>();

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
    */


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

    /////////////////////////////VENTANA TIPO_ACTIVIDAD/////////////////////////////

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

    /////////////////////////////VENTANA Socios/////////////////////////////
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


    //////////////////////////////////////MARCAR CUOTA COMO PAGADA////////////////////////////////////////
    //TODO:update
    public static boolean guardarCuota(Socio socio) {

        //todo: poner comrpobacion de edad y asignar un responsable. Poner en otro panel boton de eliminar al usuario

        Connection conn = Conexion.conecta();

        try {

            PreparedStatement st = conn.prepareStatement("INSERT INTO CUOTAS(ID_SOCIO, ID_CUOTA, FECHA_PAGO, PAGADO) " +
                    "VALUES (?, ?, ?, ?)");

            //prepara la insert
            //todo: cuando el socio se carga de la tabla tenemos el id, pero cuando le das a guardar no hay id
            /*st.setInt(1, cuota.getId_socio());
            st.setInt(2,cuota.getId_cuota());
            st.setObject(3,cuota.getFecha_pago());
            st.setInt(4, cuota.isPagado());*/

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



