package Paquete;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TipoCuota {

    //Atributos
    private int id_cuota;
    private int cantidad;
    private int edad_limite;
    private String nombre;

    //Relaciones
   // private static final List<Cuota> cuotas = new ArrayList<>();
    private List<Socio> socios = new ArrayList<>();


    //Constructores
    public TipoCuota(int id_cuota, int cantidad, int edad_limite, String nombre) {
        this.id_cuota = id_cuota;
        this.cantidad = cantidad;
        this.edad_limite = edad_limite;
        this.nombre = nombre;
    }

    public TipoCuota(int cantidad, int edad_limite, String nombre) {
        this.cantidad = cantidad;
        this.edad_limite = edad_limite;
        this.nombre = nombre;
    }



    public int getId_cuota() {
        return id_cuota;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getEdad_limite() {
        return edad_limite;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public void setId_cuota(int id_cuota) {
        this.id_cuota = id_cuota;
    }
}
