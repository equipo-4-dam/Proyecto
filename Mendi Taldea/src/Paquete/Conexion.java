package Paquete;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    private static Connection conn;

    public static Connection Con() {

        // Conectar a la base de datos
        System.out.println("--- Conexión a Oracle --------------------------");

        conn = null;
        try {
            // Cargar el driver Oracle JDBC Thin (ojdbc7.jar)
            // REF: Descarga: http://www.oracle.com/technetwork/database/features/jdbc/default-2280470.html
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            // Cadena de conexión: driver@machineName:port:SID, userid, password
            //conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "irune", "egibide");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");
            System.out.println("INFO: Conexión abierta");

            //para que guarde automaticamente los datos
            conn.setAutoCommit(true);

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("------------------------------------------------");

        return conn;

    }

    public static Connection conecta() {

        if (conn == null)
            Conexion.Con();

        return conn;
    }

    //todo esto nos lo vamos a cargar
    /*public static void desconectar(Connection conexion) {

        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    */


}
