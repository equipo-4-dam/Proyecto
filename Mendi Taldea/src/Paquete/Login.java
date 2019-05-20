package Paquete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    //atributos
    private String usuario;
    private String pass = "pass";

    //relaciones
    private Socio socio;

    //constructores
    public Login(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    public static int hacerLogin(Login login) {

        Connection conn = Conexion.conecta();

        try {

            String sql = "SELECT ID_SOCIO FROM LOGIN WHERE USUARIO = ? AND PASS = ?";

            PreparedStatement st = conn.prepareStatement(sql);

            //prepara la insert
            st.setString(1, login.getUsuario());
            st.setString(2, login.getPass());

            //aqui se inserta la fila
            ResultSet resultado = st.executeQuery();

            if (resultado.next())
                return resultado.getInt("ID_SOCIO");
            else
                return -2;

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return -1;
        }
    }

    //getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
