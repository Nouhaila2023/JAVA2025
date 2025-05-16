package Tema7_3.ticketsSoporteTecnico.models;

import Tema7_3.ticketsSoporteTecnico.enumerado.Especialidad;

public class Tecnico extends Persona {

    /**
     * Atributos
     */
    private Especialidad especialidad;
    private int valoracion;


    /**
     * Constructor
     *
     * @param nombre
     * @param apellido
     * @param email
     * @param telefono
     */
    public Tecnico(int id, String nombre, String apellido, String email, String telefono, Especialidad especialidad, int valoracion) {
        super(id, nombre, apellido, email, telefono);
        this.especialidad = especialidad;
        this.valoracion = valoracion;
    }

    /**
     * Getter and Setter
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public Tecnico setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
        return this;
    }

    public int getValoracion() {
        return valoracion;
    }

    public Tecnico setValoracion(int valoracion) {
        if (valoracion < 1 || valoracion > 5) {
            throw new IllegalArgumentException("Valoración invalida -> debe estar entre 1 y 5");
        }
        this.valoracion = valoracion;
        return this;
    }


    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tecnico{");
        super.toString();
        sb.append("especialidad=").append(especialidad);
        sb.append(", valoracion=").append(valoracion);
        sb.append('}');
        return sb.toString();
    }
}
