package Paquete;

import java.time.LocalDate;

public class Socio {

    //atributos
    private int id_socio;
    private String nombre;
    private String apellidos;
    private LocalDate fecha;
    private String dni;
    private int telefono;
    private String email;
    private int responsable;
    private String perfil;
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;

    //constructores
    public Socio(int id_socio, String nombre, String apellidos, LocalDate fecha, String dni, int telefono, String email, int responsable, String perfil, LocalDate fechaAlta, LocalDate fechaBaja) {
        this.id_socio = id_socio;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.responsable = responsable;
        this.perfil = perfil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public Socio(int id_socio, String nombre, String apellidos, LocalDate fecha, String dni, int telefono, String email, int responsable, String perfil, LocalDate fechaAlta) {
        this.id_socio = id_socio;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.responsable = responsable;
        this.perfil = perfil;
        this.fechaAlta = fechaAlta;
    }

    //Getters y Setters
    public int getId_socio() {
        return id_socio;
    }

    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
