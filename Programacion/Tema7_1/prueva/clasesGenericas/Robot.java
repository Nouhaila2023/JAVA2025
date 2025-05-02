package Tema7_1.prueva.clasesGenericas;

public class Robot {
    /**
     * Atributos
     */

    protected String nombre;
    protected Integer energia;

    /**
     * Constructor
     */
    public Robot(String nombre, Integer energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    /**
     * Getter Setter
     */
    public String getNombre() {
        return nombre;
    }

    public Robot setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Integer getEnergia() {
        return energia;
    }

    public Robot setEnergia(Integer energia) {
        this.energia = energia;
        return this;
    }
    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Robot{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append('}');
        return sb.toString();
    }
}
