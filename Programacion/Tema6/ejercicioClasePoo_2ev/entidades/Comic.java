package Tema6.ejercicioClasePoo_2ev.entidades;

import Tema6.ejercicioClasePoo_2ev.servicios.TiendaComics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comic {
    /**
     * Atributos
     */

    protected String titulo;
    protected LocalDate fecha;
    protected  Integer numPaginas;
    protected Integer numeroEjemplares;
    protected ArrayList<Autor> autors;

    /**
     * Constructor
     */
    public Comic(String titulo, LocalDate fecha, Integer numPaginas) {
        this.numeroEjemplares++;
        this.titulo = String.valueOf(numeroEjemplares);
        this.fecha = fecha;
        this.numPaginas = numPaginas;
        this.autors = new ArrayList<>();
    }

    /**
     * Getter And Setter
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public ArrayList<Autor> getAutors() {
        return autors;
    }

    public void setAutors(ArrayList<Autor> autors) {
        this.autors = autors;
    }
    public TiendaComics setTiendaComics(TiendaComics tiendaComics) {
        return tiendaComics;
    }
    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comic{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autors=").append(autors);
        sb.append('}');
        return sb.toString();
    }



}
