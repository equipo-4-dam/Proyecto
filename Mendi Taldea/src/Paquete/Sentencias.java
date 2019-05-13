package Paquete;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sentencias {

    public static boolean guardarCargo(Cargo cargo) {

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conn = Conexion.Con();

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

    public static List<Cargo> recogidaCargos() {

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.Con();

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

    public static boolean guardarTipoActividad(TipoActividad tipo) {

        Connection conn = Conexion.Con();

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

    public static List<TipoActividad> recogidaTipoActividad() {

        //me conecto a la base de datos para obeter los datos para el modelo
        Connection conectionBD = Conexion.Con();

        //creo un arraylist para pasar los datos del resulset al arraylist
        List<TipoActividad> actividades = new ArrayList<>();

        try {
            //Consulta simple
            Statement statement = conectionBD.createStatement();

            ResultSet resultado = statement.executeQuery("SELECT * FROM TIPO_ACTIVIDADES");


            //Bucle para guardar en la lista el resultado para la tabla
            while (resultado.next()) {

                TipoActividad actividad = new TipoActividad(
                        resultado.getInt("ID_TIPO"),
                        resultado.getString("TIPO")
                );

                //Al recorrer el resulset se va cargando la lista de objetos cargo que iran en la tabla
                actividades.add(actividad);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return actividades;
    }


}
