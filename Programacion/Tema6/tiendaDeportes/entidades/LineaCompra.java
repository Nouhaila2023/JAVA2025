package Tema6.tiendaDeportes.entidades;

import java.util.Objects;

public class LineaCompra {
    /**
     * Atributos
     */
    private int orden;
    private Producto producto;
    private int cantidad;


    /**
     * Constructor
     */
    public LineaCompra(int orden, Producto producto, int cantidad) {
        this.orden = orden;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * Constructor copia
     */
    public LineaCompra(LineaCompra otro) {
        this.orden = otro.orden;
        this.producto = otro.producto;
        this.cantidad = otro.cantidad;
    }

    /**
     * Metodos ampliados
     */

    public double subtotal() {
        double descuentoTotal = getProducto().descuento() * this.cantidad;
        return this.producto.precio * this.cantidad - descuentoTotal ;
    }

    /**
     * Getter Setter
     */
    public int getOrden() {
        return orden;
    }

    public LineaCompra setOrden(int orden) {
        this.orden = orden;
        return this;
    }

    public Producto getProducto() {
        return producto;
    }

    public LineaCompra setProducto(Producto producto) {
        this.producto = producto;
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LineaCompra setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LineaCompra{");
        sb.append("orden=").append(orden);
        sb.append(", producto=").append(producto);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals por Producto
     * (no se puede repetir en un pedido dos líneas con el mismo producto).
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LineaCompra that = (LineaCompra) o;
        return Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(producto);
    }
}
