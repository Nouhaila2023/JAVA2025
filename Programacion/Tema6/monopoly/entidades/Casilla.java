package Tema6.monopoly.entidades;

public  class Casilla {

    /**
     * Atributos:
     */
    protected String nombre;
    protected Integer posicion;


    /**
     * Constructor
     */
    public Casilla(String nombre, Integer posicion) {
        this.posicion = posicion;
        this.nombre = nombre;
    }

    /**
     * Getter Setter
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Casilla{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", posicion=").append(posicion);
        sb.append('}');
        return sb.toString();
    }
}
