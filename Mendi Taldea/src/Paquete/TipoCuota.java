package Paquete;

public class TipoCuota {

    //Atributos
    private int id_cuota;
    private int cantidad;
    private int edad_limite;
    private String nombre;

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
}
