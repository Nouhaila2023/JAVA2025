package Tema6.alquilarPelículas.entidades;

import Tema6.alquilarPelículas.entidades.enum_.Genero;

import java.util.Objects;

public class Multimedia {
    /**
     * Atributos
     */
    protected Long codigo;
    protected String titulo;
    protected boolean plus;
    protected double precio;//se aplica si no es cliente plus
    protected Genero genero;
    private Long autoincremento;

    /**
     * Constructor por defecto
     */
    public Multimedia() {

    }

    /**
     * Constructor con el autoincremento del codigo
     */
    public Multimedia(Long codigo, String titulo, double precio, boolean plus,Genero genero) {
        this.codigo = autoincremento++;
        this.titulo = titulo;
        this.plus = plus;
        this.precio = precio;
        this.genero = genero;
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

    public Long getAutoincremento() {
        return autoincremento;
    }

    public Multimedia setAutoincremento(Long autoincremento) {
        this.autoincremento = autoincremento;
        return this;
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
        sb.append(", autoincremento=").append(autoincremento);
        sb.append('}');
        return sb.toString();
    }
}
