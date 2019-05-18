package Paquete;

import java.time.LocalDate;

public class Cuota {

    //Atributos
    private int id_socio;
    private int id_cuota;
    private LocalDate fecha_pago;
    private LocalDate fecha_vencimiento;
    private int pagado;

    //Relaciones
    //private final  List<Socio> socios = new ArrayList<>();
    //private final  List<TipoCuota> tipoCuotas = new ArrayList<>();
    private Socio socio;

    //Constructores
    public Cuota(int id_socio, int id_cuota, LocalDate fecha_pago, int pagado) {
        this.id_socio = id_socio;
        this.id_cuota = id_cuota;
        this.fecha_pago = fecha_pago;
        this.pagado = pagado;
    }

    /*
    public Cuota(int id_socio, Socio socio, LocalDate fecha_nac) {
        this.id_socio = id_socio;
        socios.add(socio);
        //tipoCuotas.add(new TipoCuota(fecha_nac));
    }

     */

    public Cuota(Socio socio) {
        this.id_socio = socio.getId_socio();
        this.id_cuota = 1;
    }

    public Cuota(int id_socio, int id_cuota, LocalDate fecha_pago, LocalDate fecha_vencimiento, int pagado) {
        this.id_socio = id_socio;
        this.id_cuota = id_cuota;
        this.fecha_pago = fecha_pago;
        this.fecha_vencimiento = fecha_vencimiento;
        this.pagado = pagado;
    }

    //Getters & Setters
    public int getId_socio() {
        return id_socio;
    }

    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }

    public int getId_cuota() {
        return id_cuota;
    }

    public void setId_cuota(int id_cuota) {
        this.id_cuota = id_cuota;
    }

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int isPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

}
