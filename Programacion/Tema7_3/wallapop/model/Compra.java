package Tema7_3.wallapop.model;

import java.time.LocalDate;
import java.util.Objects;

public class Compra {

    private Usuario vende;
    private Usuario compra;
    private LocalDate fecha;
    private double precioCompra;
    private Producto2Mano producto; // FALTABA


    public Compra(Usuario vende, Usuario compra, Producto2Mano producto, LocalDate fecha, double precioCompra) {
        this.vende = vende;
        this.compra = compra;
        this.producto = producto;
        this.fecha = fecha;
        this.precioCompra = precioCompra;
    }


    public Producto2Mano getProducto() {
        return producto;
    }

    public Compra setProducto(Producto2Mano producto) {
        this.producto = producto;
        return this;
    }

    public Usuario getVende() {
        return vende;
    }

    public Compra setVende(Usuario vende) {
        this.vende = vende;
        return this;
    }

    public Usuario getCompra() {
        return compra;
    }

    public Compra setCompra(Usuario compra) {
        this.compra = compra;
        return this;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Compra setFecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public Compra setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("vende=").append(vende);
        sb.append(", compra=").append(compra);
        sb.append(", fecha=").append(fecha);
        sb.append(", precioCompra=").append(precioCompra);
        sb.append(", producto=").append(producto);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Compra compra1 = (Compra) o;
        return Double.compare(precioCompra, compra1.precioCompra) == 0 && Objects.equals(vende, compra1.vende) && Objects.equals(compra, compra1.compra) && Objects.equals(fecha, compra1.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vende, compra, fecha, precioCompra);
    }
}
