package Tema6.PracticaDeCasa;

import java.time.LocalDate;

public class Compra {

    /**
     * Atributos
     */

    private LocalDate fecha;
    private Producto producto;
    private int cantidad;
    private double precioTotal;

    /**
     * Métodos
     */


    /**
     * Constructor
     */
    public Compra(LocalDate fecha, Producto producto, int cantidad, double precioTotal) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    /**
     * getter
     */
    public LocalDate getFecha() {
        return fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("fecha=").append(fecha);
        sb.append(", producto=").append(producto);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }
}
