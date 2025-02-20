package Tema6.PracticaDeClase;

import java.time.LocalDate;

public class Compra {
    private LocalDate fecha;
    private Producto producto;
    private int cantidad;
    private double precioTptal;


    //Constructor

    public Compra(LocalDate fecha,  int cantidad, double precioTptal) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTptal = precioTptal;
    }


    //Getter and Setter

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTptal() {
        return precioTptal;
    }

    public void setPrecioTptal(double precioTptal) {
        this.precioTptal = precioTptal;
    }


    //toString


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("fecha=").append(fecha);
        sb.append(", producto=").append(producto);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precioTptal=").append(precioTptal);
        sb.append('}');
        return sb.toString();
    }
}
