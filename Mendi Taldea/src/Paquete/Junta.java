package Paquete;

import java.util.ArrayList;
import java.util.List;

public class Junta {

    //atributos
    List<String> cargos = new ArrayList<>();


    public Junta(List<String> puestos) {

        cargos.addAll(puestos);
    }
}
