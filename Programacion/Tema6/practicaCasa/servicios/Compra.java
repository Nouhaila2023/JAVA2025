package Tema6.practicaCasa.servicios;

import Tema6.practicaCasa.entidades.interfaces.Producto;

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
     * constructor
     */

    public Compra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = LocalDate.now();
        this.precioTotal = producto.getPrecio() * cantidad;
    }

    /**
     * Getter
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
