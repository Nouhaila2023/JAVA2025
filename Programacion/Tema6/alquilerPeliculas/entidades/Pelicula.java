package Tema6.alquilerPeliculas.entidades;

public class Pelicula extends Multimedia {

    /**
     * Atributos
     */

    private int duracion;

    /**
     * Constructor
     * @param titulo
     * @param precio
     */
    public Pelicula(String titulo, double precio) {
        super(titulo, precio);
        this.duracion = 0;
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
