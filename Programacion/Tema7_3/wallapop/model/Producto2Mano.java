package Tema7_3.wallapop.model;

import Tema7_3.wallapop.enumes.Categoria;
import Tema7_3.wallapop.enumes.Estado;

import java.util.UUID;

public class Producto2Mano {

    private UUID id;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private Estado estado;
    private boolean envio;
    private double precio;
    private Usuario usuario;

    public Producto2Mano(UUID id, String nombre, String descripcion, Categoria categoria, Estado estado, boolean envio, double precio, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.envio = envio;
        this.precio = precio;
        this.usuario = usuario;
    }

    public UUID getId() {
        return id;
    }

    public Producto2Mano setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto2Mano setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Producto2Mano setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Producto2Mano setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Producto2Mano setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public boolean isEnvio() {
        return envio;
    }

    public Producto2Mano setEnvio(boolean envio) {
        this.envio = envio;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto2Mano setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Producto2Mano setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto2Mano{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", estado=").append(estado);
        sb.append(", envio=").append(envio);
        sb.append(", precio=").append(precio);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }
}
