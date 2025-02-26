package Tema6.alquilerPeliculas.entidades;

import Tema6.alquilerPeliculas.entidades.enum_.Genero;

public class Pelicula extends Multimedia {

    /**
     * Atributos
     */

    private int duracion;

    /**
     * Constructor
     */

    public Pelicula(Long codigo, String titulo, double precio, boolean plus, Genero genero, int duracion) {
        super(codigo, titulo, precio, plus, genero);
        this.duracion = duracion;
    }

    /**
     * Getter and Setter
     */
    public int getDuracion() {
        return duracion;
    }

    public Pelicula setDuracion(int duracion) {
        this.duracion = duracion;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pelicula{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }
}
