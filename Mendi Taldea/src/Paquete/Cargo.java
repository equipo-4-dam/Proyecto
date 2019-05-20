package Paquete;

public class Cargo {

    //atributos
    private int idCargo;
    private String tipo;

    //relaciones


    public Cargo(int idCargo, String tipo) {
        this.idCargo = idCargo;
        this.tipo = tipo;
    }

    public Cargo(String tipo) {
        this.tipo = tipo;
    }

    String getTipo() {
        return tipo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
