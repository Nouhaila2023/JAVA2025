package Tema7_3.examen2023.models;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva implements Comparable<Reserva>{

    /**
     * Atributos
     */
    private Long id;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Integer cantidadHabitaciones;
    private Integer numPersonasPorHabitacion;
    private String dni;
    private String nacionalidad;
    private Hotel hotel;
    private static Long countId = 1L;

    /**
     * Constructor
     * @param fechaEntrada
     * @param fechaSalida
     * @param cantidadHabitaciones
     * @param numPersonasPorHabitacion
     * @param dni
     * @param nacionalidad
     * @param hotel
     */
    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, Integer cantidadHabitaciones,
                   Integer numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel) {
        this.id = countId++;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numPersonasPorHabitacion = numPersonasPorHabitacion;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.hotel = hotel;
    }

    /**
     * Getter and Setter
     */
    public Long getId() {
        return id;
    }

    public Reserva setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public Reserva setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
        return this;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public Reserva setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public Reserva setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        return this;
    }

    public Integer getNumPersonasPorHabitacion() {
        return numPersonasPorHabitacion;
    }

    public Reserva setNumPersonasPorHabitacion(Integer numPersonasPorHabitacion) {
        this.numPersonasPorHabitacion = numPersonasPorHabitacion;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Reserva setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Reserva setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
        return this;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Reserva setHotel(Hotel hotel) {
        this.hotel = hotel;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reserva{");
        sb.append("id=").append(id);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", cantidadHabitaciones=").append(cantidadHabitaciones);
        sb.append(", numPersonasPorHabitacion=").append(numPersonasPorHabitacion);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append(", hotel=").append(hotel);
        sb.append('}');
        return sb.toString();
    }

    /**
     * el equals con id
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(id, reserva.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * Implementa comparable por fechaEntrada
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Reserva o) {
        return this.getFechaEntrada().compareTo(o.getFechaEntrada());
    }
}
