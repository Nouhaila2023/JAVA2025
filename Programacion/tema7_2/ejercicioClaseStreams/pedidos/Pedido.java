package tema7_2.ejercicioClaseStreams.pedidos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private Long id;
    private LocalDate fechaPedido;
    private LocalDate fechaEnvio;
    private Estado estado;
    private Cliente cliente;
    private Set<Producto> productos;

    public Pedido(Long id, LocalDate fechaPedido, LocalDate fechaEnvio, Estado estado, Cliente cliente) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.cliente = cliente;
        this.productos = new HashSet<>();
    }

    //addProducto

    private void addProducto(Producto producto) {
        if (!productos.contains(producto)) {
            productos.add(producto);
        }

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pedido{");
        sb.append("id=").append(id);
        sb.append(", fechaPedido=").append(fechaPedido);
        sb.append(", fechaEnvio=").append(fechaEnvio);
        sb.append(", estado=").append(estado);
        sb.append(", cliente=").append(cliente);
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public Long getId() {
        return id;
    }

    public Pedido setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public Pedido setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
        return this;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public Pedido setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Pedido setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pedido setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }


    public Pedido setProductos(Set<Producto> productos) {
        this.productos = productos;
        return this;
    }


}
