package Tema7.practica1.gestionBiblioteca;

import java.time.LocalDate;
import java.util.Objects;

public class Libro {
    /**
     * Atributos
     */
    private String ISBN;
    private String titulo;
    private String autor;
    private String genero;
    private Integer añoDePublicacion;

    /**
     * Constructor
     */
    public Libro(String ISBN, String titulo, String autor, String genero, Integer añoDePublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.añoDePublicacion = añoDePublicacion;
    }

    /**
     * Getter Setter
     */
    public String getISBN() {
        return ISBN;
    }

    public Libro setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Libro setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Libro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Libro setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public Integer getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public Libro setAñoDePublicacion(Integer añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
        return this;
    }

    /**
     * toStinrg
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libro{");
        sb.append("ISBN='").append(ISBN).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", añoDePublicacion=").append(añoDePublicacion);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals con ISBN
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(ISBN, libro.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ISBN);
    }
}
