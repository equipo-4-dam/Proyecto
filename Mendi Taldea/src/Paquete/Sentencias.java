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

    /////////////////////////////VENTANA TIPO_CUOTA/////////////////////////////

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

            PreparedStatement st = conn.prepareStatement("INSERT INTO SOCIOS(NOMBRE, APELLIDOS, FECHA_NAC, DNI, " +
                    "TELEFONO, EMAIL, RESPONSABLE, FECHA_ALTA, FECHA_BAJA) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

            //prepara la insert
            st.setString(1, socio.getNombre());
            st.setString(2, socio.getApellidos());
            st.setObject(3, socio.getFecha());
            st.setString(4, socio.getDni());
            st.setInt(5, socio.getTelefono());
            st.setString(6, socio.getEmail());
            st.setInt(7, socio.getResponsable());
            st.setObject(8, socio.getFechaAlta());
            st.setObject(9, socio.getFechaBaja());


            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            PreparedStatement st1 = conn.prepareStatement("INSERT INTO CUOTAS(ID_SOCIO, ID_CUOTA," +
                    "FECHA_PAGO, FECHA_VENCIMIENTO, PAGADO) VALUES(?, ?, ?, ?, ?)");

            //TODO: hacer una funcion para obtener la ultima id del socio que se ha insertado
            st1.setInt(1, 1);
            st1.setInt(2, 22);
            st1.setObject(3, LocalDate.parse("1980-01-10"));
            st1.setObject(4, LocalDate.parse("1980-02-15"));
            st1.setInt(5, 0);

            filas = st1.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }


    //TODO:update
    public static boolean guardarCuota(Cuota cuota) {

        //todo: poner comrpobacion de edad y asignar un responsable. Poner en otro panel boton de eliminar al usuario

        Connection conn = Conexion.conecta();

        try {

            PreparedStatement st = conn.prepareStatement("INSERT INTO CUOTAS(ID_SOCIO, ID_CUOTA, FECHA_PAGO, PAGADO) " +
                    "VALUES (?, ?, ?, ?)");

            //prepara la insert
            //todo: cuando el socio se carga de la tabla tenemos el id, pero cuando le das a guardar no hay id
            st.setInt(1, cuota.getId_socio());
            st.setInt(2, cuota.getId_cuota());
            st.setObject(3, cuota.getFecha_pago());
            st.setInt(4, cuota.isPagado());

            //aqui se inserta la fila
            int filas = st.executeUpdate();
            System.out.println("Filas afectadas: " + filas);
            return true;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    /////////////////////////////VENTANA ACTIVIDADES/////////////////////////////
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



