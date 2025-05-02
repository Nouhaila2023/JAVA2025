package Tema7_1.EjercicioProgrogramacion.Ejercicio2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita implements Comparable<Cita>{


    @Override
    public int compareTo(Cita o) {
        return this.getPacienta().getNombre().compareTo(o.getPacienta().getNombre()) +
        this.getPacienta().getApellidos().compareTo(o.getPacienta().getApellidos())+
                this.getFecha().compareTo(o.getFecha())+
                this.getHora().compareTo(o.getHora());
    }


    /**
     * Atributos
     */

    private Pacienta pacienta;
    private LocalDate fecha;
    private LocalTime hora;
    private Tipo tipo;

    /**
     * Constructor
     */
    public Cita(Pacienta pacienta, LocalDate fecha, LocalTime hora, Tipo tipo) {
        this.pacienta = pacienta;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
    }

    public Pacienta getPacienta() {
        return pacienta;
    }

    public void setPacienta(Pacienta pacienta) {
        this.pacienta = pacienta;
    }

    /**
     * Getter Setter
     */

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cita{");
        sb.append("pacienta=").append(pacienta);
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }



}
