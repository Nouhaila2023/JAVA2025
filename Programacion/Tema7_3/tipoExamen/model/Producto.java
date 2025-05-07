package Tema7_3.tipoExamen.model;

import Tema7_3.tipoExamen.model.enumes.Categoria;
import Tema7_3.tipoExamen.model.enumes.Estado;

import java.util.Objects;
import java.util.UUID;

public class Producto {

    /**
     * Atributos
     */
    private UUID id;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private Estado estado;
    private boolean envio;
    private double precio;
    private Usuario usuario;

    /**
     * Constructor
     */
    public Producto(UUID id, String nombre, String descripcion, Categoria categoria, Estado estado, boolean envio, double precio, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.envio = envio;
        this.precio = precio;
        this.usuario = usuario;
    }

    /**
     * Getter and Setter
     */
    public UUID getId() {
        return id;
    }

    public Producto setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Producto setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Producto setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Producto setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public boolean isEnvio() {
        return envio;
    }

    public Producto setEnvio(boolean envio) {
        this.envio = envio;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Producto setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", calendario=").append(categoria);
        sb.append(", estado=").append(estado);
        sb.append(", envio=").append(envio);
        sb.append(", precio=").append(precio);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals con id
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
