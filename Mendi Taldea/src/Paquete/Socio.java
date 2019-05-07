package Paquete;

import java.util.ArrayList;

import java.util.List;

public class Socio {

    //atributos
    private int idSocio;
    private String nombre;
    private String apellidos;
    private String fechaNac;
    private String dni;
    private int telefono;
    private String email;
    private String perfil;
    private String fechaAlta;
    private String fechaBaja;

    //relaciones
    private final List<Actividad> actividades = new ArrayList<>();
    private final List<Cuota> cuotas = new ArrayList<>();
    private Login login;
    private List<Cargo> cargos = new ArrayList<>();


    //constructores
    public Socio(String nombre, String apellidos, String fechaNac, String dni, int telefono, String email, String perfil, String fechaAlta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.perfil = perfil;
        this.fechaAlta = fechaAlta;

        this.login = new Login(nombre,this);

    }

    //getters y setteres
    //metodos
}
