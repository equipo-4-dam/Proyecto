package Paquete;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    public static Connection Con() {

        // Conectar a la base de datos
        System.out.println("--- Conexión a Oracle --------------------------");

        Connection conn = null;
        try {
            // Cargar el driver Oracle JDBC Thin (ojdbc7.jar)
            // REF: Descarga: http://www.oracle.com/technetwork/database/features/jdbc/default-2280470.html
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            // Cadena de conexión: driver@machineName:port:SID, userid, password
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "irune", "egibide");
            System.out.println("INFO: Conexión abierta");

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("------------------------------------------------");

        return  conn;

    }

}
