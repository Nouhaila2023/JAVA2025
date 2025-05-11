package Tema7_3.practica3Fincas.model;

import java.util.Objects;
import java.util.UUID;

public class Finca {

    /**
     * Atributos
     */
    private int id;
    private String nombre;
    private double longitud;
    private double latitud;
    private double superficie;
    private String localidad;
    private String provincia;


    /**
     * Constructor
     */

    public Finca(int id, String nombre, double longitud, double latitud, double superficie, String localidad, String provincia) {
        this.id = id;
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;
        this.superficie = superficie;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    /**
     * Getter Setter
     */
    public int getId() {
        return id;
    }

    public Finca setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Finca setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public double getLongitud() {
        return longitud;
    }

    public Finca setLongitud(double longitud) {
        this.longitud = longitud;
        return this;
    }

    public double getLatitud() {
        return latitud;
    }

    public Finca setLatitud(double latitud) {
        this.latitud = latitud;
        return this;
    }

    public double getSuperficie() {
        return superficie;
    }

    public Finca setSuperficie(double superficie) {
        this.superficie = superficie;
        return this;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Finca setLocalidad(String localidad) {
        this.localidad = localidad;
        return this;
    }

    public String getProvincia() {
        return provincia;
    }

    public Finca setProvincia(String provincia) {
        this.provincia = provincia;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Finca{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", longitud=").append(longitud);
        sb.append(", latitud=").append(latitud);
        sb.append(", superficie=").append(superficie);
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", provincia='").append(provincia).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals con id
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Finca finca = (Finca) o;
        return id == finca.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
