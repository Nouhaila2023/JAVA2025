package Tema7_3.tickets.models;

import Tema7_3.tickets.emu.Especialidad;

public class Tecnico extends Persona {

    /**
     * Atributos
     */
    private Especialidad especialidad;
    private int valoracion;


    /**
     * Constructor
     * @param id
     * @param nombre
     * @param apellido
     * @param email
     * @param movil
     * @param especialidad
     * @param valoracion
     */
    public Tecnico(int id, String nombre, String apellido, String email, String movil, Especialidad especialidad, int valoracion) {
        super(id, nombre, apellido, email, movil);
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
        if (valoracion < 1 || valoracion > 5){
            throw new RuntimeException("Valoracion en corecta:) ");
        }
        this.valoracion = valoracion;
        return this;
    }

    /**
     * toStirng
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tecnico{");
        sb.append(super.toString());
        sb.append("especialidad=").append(especialidad);
        sb.append(", valoracion=").append(valoracion);
        sb.append('}');
        return sb.toString();
    }
}
