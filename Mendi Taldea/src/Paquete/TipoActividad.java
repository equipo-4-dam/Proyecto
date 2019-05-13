package Paquete;

public class TipoActividad {

    //atributos
    private int id;
    private String tipo;

    //Constructores
    public TipoActividad(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public TipoActividad(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
