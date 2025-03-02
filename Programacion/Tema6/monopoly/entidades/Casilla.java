package Tema6.monopoly.entidades;

public abstract class Casilla {

    /**
     * Atributos:
     */
    protected String nombre;

    /**
     * Constructor
     */
    public Casilla(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter Setter
     */
    public String getNombre() {
        return nombre;
    }

    public Casilla setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Casilla{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
