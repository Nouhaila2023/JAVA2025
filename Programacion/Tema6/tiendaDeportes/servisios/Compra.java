package Tema6.tiendaDeportes.servisios;

import Tema6.tiendaDeportes.entidades.LineaCompra;
import Tema6.tiendaDeportes.entidades.interfaz.Enviable;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra implements Enviable {

    /**
     * Atributos
     * @return
     */
    private ArrayList<LineaCompra> lineasCompras;
    private LocalDate fecha;
    private double precioTotal;

    /**
     * Constructor solo por fecha
     * @return
     */

    public Compra() {
        lineasCompras = new ArrayList<>();
        this.fecha = LocalDate.now();
        precioTotal = 0.0;
    }

    /**
     * Metodos
     * @return
     */

    @Override
    public String crearEmail() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("lineaCompra=").append(lineasCompras);
        sb.append(", fecha=").append(fecha);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }

    private void actualizarPrecioTotal() {
        precioTotal = 0.0;
        for (LineaCompra lineaCompra : lineasCompras) {
            precioTotal += lineaCompra.subtotal();
        }
    }

    /**
     * Añadir Line
     */

    public void addLineaCompra(LineaCompra lineaCompra) {
       if (!lineasCompras.contains(lineaCompra)) {
           lineasCompras.add(lineaCompra);
       }
       actualizarPrecioTotal();
    }

    /**
     * Eliminar Line
     */

    public void delLineaCompra(LineaCompra lineaCompra) {
        if (lineasCompras.contains(lineaCompra)) {
            lineasCompras.remove(lineaCompra);
            actualizarPrecioTotal();
        }
    }

    /**
     * Getter
     */
    public ArrayList<LineaCompra> getLineaCompra() {
        return lineasCompras;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Setter solo por fecha
     */
    public Compra setFecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("lineaCompra=").append(lineasCompras);
        sb.append(", fecha=").append(fecha);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }
}
