package Paquete;

import java.util.ArrayList;
import java.util.List;

public class Cargo {

    //atributos
    private int idCargo;
    private String tipo;

    //relaciones
    private final List<Socio> socios = new ArrayList<>();

    public Cargo(int idCargo, String tipo) {
        this.idCargo = idCargo;
        this.tipo = tipo;
    }

    public Cargo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdCargo() {
        return idCargo;
    }
}
