package Paquete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
}
