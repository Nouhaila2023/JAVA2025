package Tema7_3.tipoExamen.model;

import java.time.LocalDate;

public class Compra {
    /**
     * Atributos
     */
    private Usuario comprador;
    private Usuario vendedor;
    private Producto producto;
    private LocalDate fecha;
    private double precio;


    /**
     *Constructor
     */
    public Compra(Usuario comprador, Usuario vendedor, Producto producto, LocalDate fecha, double precio) {
        if (precio > this.producto.getPrecio()){
            System.out.println("El precio de compra no valide");
        }
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.producto = producto;
        this.fecha = fecha;
        this.precio = precio;
    }

    /**
     * Getter and Setter
     */
    public Usuario getComprador() {
        return comprador;
    }

    public Compra setComprador(Usuario comprador) {
        this.comprador = comprador;
        return this;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public Compra setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Producto getProducto() {
        return producto;
    }

    public Compra setProducto(Producto producto) {
        this.producto = producto;
        return this;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Compra setFecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Compra setPrecio(double precio) throws IllegalAccessException {
        if (this.producto != null && precio > this.producto.getPrecio()){
            throw new IllegalAccessException("El precio de compra no valide");
        }
        this.precio = precio;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("comprador=").append(comprador);
        sb.append(", vendedor=").append(vendedor);
        sb.append(", producto=").append(producto);
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
