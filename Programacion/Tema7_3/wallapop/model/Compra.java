package Tema7_3.wallapop.model;

import java.time.LocalDate;
import java.util.Objects;

public class Compra {

    private Usuario vendedor;
    private Usuario comprador;
    private LocalDate fecha;
    private double precioCompra;
    private Producto2Mano producto; // FALTABA


    public Compra(Usuario vende, Usuario compra, Producto2Mano producto, LocalDate fecha, double precioCompra) {
        this.vendedor = vende;
        this.comprador = compra;
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

    public Usuario getVendedor() {
        return vendedor;
    }

    public Compra setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public Compra setComprador(Usuario comprador) {
        this.comprador = comprador;
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
        sb.append("vende=").append(vendedor);
        sb.append(", compra=").append(comprador);
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
        return Double.compare(precioCompra, compra1.precioCompra) == 0 && Objects.equals(vendedor, compra1.vendedor) && Objects.equals(comprador, compra1.comprador) && Objects.equals(fecha, compra1.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendedor, comprador, fecha, precioCompra);
    }
}
