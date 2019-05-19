package Paquete;

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
