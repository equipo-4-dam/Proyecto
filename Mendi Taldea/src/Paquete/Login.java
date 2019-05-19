package Paquete;

public class Login {

    //atributos
    private String usuario;
    private String pass="pass";

    //relaciones
    private Socio socio;

    //constructores
    public Login(String usuario, Socio socio) {
        this.usuario = usuario;
        this.socio = socio;
    }
}
