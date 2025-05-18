package Tema7_3.tickets.models;

import java.time.LocalDate;

public class Usuario extends Persona {

    /**
     * Atributos
     */
    private LocalDate fechaAlta;


    /**
     * Constructor
     * @param id
     * @param nombre
     * @param apellido
     * @param email
     * @param movil
     * @param fechaAlta
     */
    public Usuario(int id, String nombre, String apellido, String email, String movil, LocalDate fechaAlta) {
        super(id, nombre, apellido, email, movil);
        this.fechaAlta = fechaAlta;
    }

    /**
     * Getter Setter
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
        sb.append(super.toString());
        sb.append("fechaAlta=").append(fechaAlta);
        sb.append('}');
        return sb.toString();
    }

}
