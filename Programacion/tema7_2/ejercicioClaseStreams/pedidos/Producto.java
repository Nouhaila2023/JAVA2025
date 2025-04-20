package tema7_2.ejercicioClaseStreams.pedidos;

public class Producto {
    private Long id;
    private String nombre;
    private Categoria categoria;
    private double precio;

    public Producto(Long id, String nombre, Categoria categoria, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public Producto setId(Long id) {
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

    public Categoria getCategoria() {
        return categoria;
    }

    public Producto setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

}
