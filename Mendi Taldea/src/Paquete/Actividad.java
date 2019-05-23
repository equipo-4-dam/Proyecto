package Paquete;

import java.time.LocalDate;

public class Actividad {

    //todo:relacionar clases

    //Atributos
    private int id_actividad;
    private LocalDate fecha;
    private String descripcion;
    private String dificultad;
    private int precio;
    private String motivoCancelacion;
    private boolean realizacion;
    private int id_tipo;
    private int organizador;

    //Relaciones
    private TipoActividad tipoActividad;

    //ConstructoreS
    public Actividad(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Actividad(int id_actividad, LocalDate fecha) {
        this.id_actividad = id_actividad;
        this.fecha = fecha;
    }

    public Actividad(int id_actividad, LocalDate fecha, String descripcion, String dificultad, int precio,
                     String motivoCancelacion, boolean realizacion, int id_tipo, int organizador) {
        this.id_actividad = id_actividad;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.precio = precio;
        this.motivoCancelacion = motivoCancelacion;
        this.realizacion = realizacion;
        this.id_tipo = id_tipo;
        this.organizador = organizador;
    }

    public Actividad(LocalDate fecha, String descripcion, String dificultad, int precio, int organizador,
                     TipoActividad tipoActividad) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.precio = precio;
        this.organizador = organizador;
        this.tipoActividad = tipoActividad;
    }

    //Getters & Setters
    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    public boolean isRealizacion() {
        return realizacion;
    }

    public void setRealizacion(boolean realizacion) {
        this.realizacion = realizacion;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getOrganizador() {
        return organizador;
    }

    public void setOrganizador(int organizador) {
        this.organizador = organizador;
    }

    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
}
