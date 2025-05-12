package Tema7_3.EjercicioClaseFicheroStreams.models;

import Tema7_3.EjercicioClaseFicheroStreams.enumes.Departamento;
import Tema7_3.EjercicioClaseFicheroStreams.enumes.Estado;
import Tema7_3.EjercicioClaseFicheroStreams.enumes.Tipo;

import java.util.UUID;

public class Material {

    /**
     * Atributos
     */
    private UUID id;
    private String nombre;
    private String descripcion;
    private Estado estado;
    private Tipo tipo;
    private Departamento departamento;
    private Localizacion localizacion;

    /**
     * Constructor
     * @param id
     * @param nombre
     * @param descripcion
     * @param estado
     * @param tipo
     * @param departamento
     * @param localizacion
     */
    public Material(UUID id, String nombre, String descripcion, Estado estado, Tipo tipo, Departamento departamento, Localizacion localizacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipo = tipo;
        this.departamento = departamento;
        this.localizacion = localizacion;
    }

    /**
     * Getter And Setter
     */
    public UUID getId() {
        return id;
    }

    public Material setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Material setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Material setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Material setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Material setTipo(Tipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Material setDepartamento(Departamento departamento) {
        this.departamento = departamento;
        return this;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public Material setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Material{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", tipo=").append(tipo);
        sb.append(", departamento=").append(departamento);
        sb.append(", localizacion=").append(localizacion);
        sb.append('}');
        return sb.toString();
    }
}
