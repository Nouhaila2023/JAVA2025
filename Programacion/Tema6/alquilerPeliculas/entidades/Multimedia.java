package Tema6.alquilerPeliculas.entidades;

import Tema6.alquilerPeliculas.entidades.enum_.Genero;

import java.util.Objects;

public class Multimedia {

    /**
     * Atributos
     */

    protected Long codigo;
    protected String titulo;
    protected boolean plus;
    protected double precio;
    protected Genero genero;
    protected static int autoincremento;

    /**
     * Constructos por defecto
     */
    public Multimedia() {
    }

    public Multimedia(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
        this.plus = isPlus();
        this.autoincremento++;
    }

    /**
     * Getter and Setter
     */
    public Long getCodigo() {
        return codigo;
    }

    public Multimedia setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Multimedia setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public boolean isPlus() {
        return plus;
    }

    public Multimedia setPlus(boolean plus) {
        this.plus = plus;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Multimedia setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public Genero getGenero() {
        return genero;
    }

    public Multimedia setGenero(Genero genero) {
        this.genero = genero;
        return this;
    }


    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Multimedia{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals por codigo
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}

