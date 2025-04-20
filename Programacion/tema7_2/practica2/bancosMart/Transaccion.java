package tema7_2.practica2.bancosMart;

import java.time.LocalDate;

public class Transaccion {

    private Long id;
    private Cuenta cuenta;
    private double importe;
    private LocalDate fecha;
    private TipoTransaccion tipoTransaccion;
    private String descripcion;

    public Transaccion(Cuenta cuenta, double importe, LocalDate fecha, TipoTransaccion tipoTransaccion, String descripcion) {
        this.cuenta = cuenta;
        this.importe = importe;
        this.fecha = fecha;
        this.tipoTransaccion = tipoTransaccion;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public Transaccion setId(Long id) {
        this.id = id;
        return this;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Transaccion setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
        return this;
    }

    public double getImporte() {
        return importe;
    }

    public Transaccion setImporte(double importe) {
        this.importe = importe;
        return this;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Transaccion setFecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public Transaccion setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Transaccion setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Transaccion{");
        sb.append("id=").append(id);
        sb.append(", cuenta=").append(cuenta);
        sb.append(", fecha=").append(fecha);
        sb.append(", tipoTransaccion=").append(tipoTransaccion);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
