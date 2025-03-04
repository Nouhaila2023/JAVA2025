package Tema6.ejercicioClasePoo_2ev.entidades;

import Tema6.ejercicioClasePoo_2ev.servicios.TiendaComics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    /**
     * Atributos
     */
    private Cliente cliente;
    private Comic comic;
    private LocalDate fecha;

    /**
     * Constructor
     */
    public Venta(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter Setter
     */
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Comic getComic() {
        return comic;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Venta{");
        sb.append("cliente=").append(cliente);
        sb.append(", comic=").append(comic);
        sb.append(", fecha=").append(fecha);
        sb.append('}');
        return sb.toString();
    }

    public void setVenta(TiendaComics tiendaComics) {
    }
}
