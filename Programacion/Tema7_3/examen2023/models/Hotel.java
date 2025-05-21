package Tema7_3.examen2023.models;

import java.util.Objects;

public class Hotel implements Comparable<Hotel>{

    /**
     * Atributos
     */
    protected Long id;
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String prvincia;
    protected Integer numHabitaciones;
    protected Double precioNoche;
    protected Integer calificacion;

    /**
     * Con
     * @param id
     * @param nombre
     * @param direccion
     * @param localidad
     * @param prvincia
     * @param numHabitaciones
     * @param precioNoche
     * @param calificacion
     */
    public Hotel(Long id, String nombre, String direccion, String localidad, String prvincia, Integer numHabitaciones, Double precioNoche, int calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.prvincia = prvincia;
        this.numHabitaciones = numHabitaciones;
        this.precioNoche = precioNoche;
        this.calificacion = calificacion;
    }

    /**
     * Getter snd Setter
     */
    public Long getId() {
        return id;
    }

    public Hotel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Hotel setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Hotel setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Hotel setLocalidad(String localidad) {
        this.localidad = localidad;
        return this;
    }

    public String getPrvincia() {
        return prvincia;
    }

    public Hotel setPrvincia(String prvincia) {
        this.prvincia = prvincia;
        return this;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public Hotel setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
        return this;
    }

    public  Double getPrecioNoche() {
        return precioNoche;
    }

    public Hotel setPrecioNoche(Double precioNoche) {
        this.precioNoche = precioNoche;
        return this;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public Hotel setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
        return this;
    }

    /**
     * toStirng
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hotel{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", prvincia='").append(prvincia).append('\'');
        sb.append(", numHabitaciones=").append(numHabitaciones);
        sb.append(", precioNoche=").append(precioNoche);
        sb.append(", calificacion=").append(calificacion);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public int compareTo(Hotel o) {
        return this.getCalificacion().compareTo(o.getCalificacion());
    }
}
