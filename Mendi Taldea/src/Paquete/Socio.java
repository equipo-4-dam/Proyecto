package Paquete;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Socio {

    //atributos
    private int idSocio;
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private String dni;
    private int telefono;
    private String email;
    private String perfil;
    private Date fechaAlta;
    private Date fechaBaja;

    //relaciones
    private final List<Actividad> actividades = new ArrayList<>();
    private final List<Cuota> cuotas = new ArrayList<>();
    private Login login;
    private List<Cargo> cargos = new ArrayList<>();


    //constructores
    public Socio(int idSocio, String nombre, String apellidos, Date fechaNac, String dni, int telefono, String email, String perfil, Date fechaAlta, Date fechaBaja, Login login) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.perfil = perfil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.login = login;
    }

    //getters y setteres

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
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

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    //metodos
}
