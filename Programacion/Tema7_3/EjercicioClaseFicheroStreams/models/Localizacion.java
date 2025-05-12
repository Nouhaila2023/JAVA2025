package Tema7_3.EjercicioClaseFicheroStreams.models;

import java.util.UUID;

public class Localizacion {
    /**
     * Atributos
     */
    private UUID id;
    private String nombre;
    private String detalle;

    /**
     * Constructor
     * @param id
     * @param nombre
     * @param detalle
     */
    public Localizacion(UUID id, String nombre, String detalle) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
    }

    /**
     * Getter and Setter
     */
    public UUID getId() {
        return id;
    }

    public Localizacion setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Localizacion setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDetalle() {
        return detalle;
    }

    public Localizacion setDetalle(String detalle) {
        this.detalle = detalle;
        return this;
    }

    /**
     * toStirng
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Localizacion{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", detalle='").append(detalle).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
