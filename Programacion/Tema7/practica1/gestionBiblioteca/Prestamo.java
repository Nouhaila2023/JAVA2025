package Tema7.practica1.gestionBiblioteca;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    /**
     * Atributos
     */
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaDePrestamo;
    private LocalDate fechaDeDevolucion;

    /**
     * Constructor
     */
    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaDePrestamo) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = null;
    }

    /**
     *
     */

    /**
     * Getter Setter
     */
    public Usuario getUsuario() {
        return usuario;
    }

    public Prestamo setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public Libro getLibro() {
        return libro;
    }

    public Prestamo setLibro(Libro libro) {
        this.libro = libro;
        return this;
    }

    public LocalDate getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public Prestamo setFechaDePrestamo(LocalDate fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
        return this;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public Prestamo setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
        return this;
    }

    /**
     * toSting
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prestamo{");
        sb.append("usuario=").append(usuario);
        sb.append(", libro=").append(libro);
        sb.append(", fechaDePrestamo=").append(fechaDePrestamo);
        sb.append(", fechaDeDevolucion=").append(fechaDeDevolucion);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals(usuario libro)
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(usuario, prestamo.usuario) && Objects.equals(libro, prestamo.libro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, libro);
    }
}
