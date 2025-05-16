package Tema7_3.ticketsSoporteTecnico.models;

import Tema7_3.ticketsSoporteTecnico.enumerado.Especialidad;

import java.time.LocalDate;

public class Usuario extends Persona {

    /**
     * Atributos
     */
    private LocalDate fechaAlta;


    /**
     * Constructor
     *
     * @param nombre
     * @param apellido
     * @param email
     * @param telefono
     */
    public Usuario(int id, String nombre, String apellido, String email, String telefono, LocalDate fechaAlta) {
        super(id, nombre, apellido, email, telefono);
        this.fechaAlta = fechaAlta;
    }

    /**
     * Getter and Setter
     */
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public Usuario setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        super.toString();
        sb.append("fechaAlta=").append(fechaAlta);
        sb.append('}');
        return sb.toString();
    }
}
