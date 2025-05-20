package Tema7_3.tickets.models;

import Tema7_3.tickets.emu.Estado;

import java.time.LocalDate;
import java.util.Objects;

public class TicketSoporte implements Comparable<TicketSoporte> {

    /**
     * Atributos
     */

    private int id;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private Estado estado;
    private int prioridad;
    private Usuario solicitante;
    private Tecnico asignado;
    private String comentation;

    /**
     * Constructor con id
     * @param id
     * @param fechaCreacion
     * @param fechaFinalizacion
     * @param estado
     * @param prioridad
     * @param solicitante
     * @param asignado
     * @param comentation
     */
    public TicketSoporte(int id, LocalDate fechaCreacion, LocalDate fechaFinalizacion, Estado estado, int prioridad, Usuario solicitante, Tecnico asignado, String comentation) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.solicitante = solicitante;
        this.asignado = asignado;
        this.comentation = comentation;
    }

    /**
     * Constructor sin id
     * @param fechaCreacion
     * @param fechaFinalizacion
     * @param estado
     * @param prioridad
     * @param solicitante
     * @param asignado
     * @param comentation
     */
    public TicketSoporte(LocalDate fechaCreacion, LocalDate fechaFinalizacion, Estado estado, int prioridad, Usuario solicitante, Tecnico asignado, String comentation) {
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.solicitante = solicitante;
        this.asignado = asignado;
        this.comentation = comentation;
    }

    /**
     * Getter and Setter
     */
    public int getId() {
        return id;
    }

    public TicketSoporte setId(int id) {
        this.id = id;
        return this;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public TicketSoporte setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
        return this;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public TicketSoporte setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public TicketSoporte setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public TicketSoporte setPrioridad(int prioridad) {
        if (prioridad > 0 || prioridad < 3){
            throw new RuntimeException("Priosidad en corecta");
        }
        this.prioridad = prioridad;
        return this;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public TicketSoporte setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
        return this;
    }

    public Tecnico getAsignado() {
        return asignado;
    }

    public TicketSoporte setAsignado(Tecnico asignado) {
        this.asignado = asignado;
        return this;
    }

    public String getComentation() {
        return comentation;
    }

    public TicketSoporte setComentation(String comentation) {
        this.comentation = comentation;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TicketSoporte{");
        sb.append("id=").append(id);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaFinalizacion=").append(fechaFinalizacion);
        sb.append(", estado=").append(estado);
        sb.append(", prioridad=").append(prioridad);
        sb.append(", solicitante=").append(solicitante);
        sb.append(", asignado=").append(asignado);
        sb.append(", comentation='").append(comentation).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TicketSoporte that = (TicketSoporte) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * IMplementa Comparable por fechaCreacin
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(TicketSoporte o) {
        return this.fechaCreacion.compareTo(o.fechaCreacion);
    }


}
