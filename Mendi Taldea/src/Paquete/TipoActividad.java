package Paquete;

import java.util.ArrayList;
import java.util.List;

public class TipoActividad {

    //Atributos
    private int id_tipo;
    private String tipo;

    //Relaciones
    private static final List<Actividad> actividades = new ArrayList<>();

    //Constructores
    public TipoActividad(int id_tipo, String tipo) {
        this.id_tipo = id_tipo;
        this.tipo = tipo;
    }

    public TipoActividad(String tipo) {
        this.tipo = tipo;
    }

    //Getters & Setters
    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
