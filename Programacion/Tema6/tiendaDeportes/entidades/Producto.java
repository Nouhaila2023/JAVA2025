package Tema6.tiendaDeportes.entidades;
import Tema6.tiendaDeportes.entidades.interfaz.Descontable;
import java.util.Objects;

public class Producto implements Descontable {

    /**
     *Implementa el interfaz Descontable
     * @return
     */
    @Override
    public double descuento() {
        return 0;
    }

    /**
     * Atributos
     */
    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected int unidadesStock;
    protected static int contadorCodigo = 1;

    /**
     * Metodos basicos
     */

    /**
     * Constructor
     */
    public Producto(String nombre, String descripcion, double precio, int unidadesStock) {
        this.codigo = String.valueOf(contadorCodigo++);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadesStock = unidadesStock;
    }

    /**
     * Constructor copia
     */
    public Producto(Producto otro) {
        this.codigo = otro.codigo;
        this.nombre = otro.nombre;
        this.descripcion = otro.descripcion;
        this.precio = otro.precio;
        this.unidadesStock = otro.unidadesStock;
    }

    /**
     * Getters Setter
     */
    public String getCodigo() {
        return codigo;
    }

    public Producto setCodigo(String codigo) {
        this.codigo = codigo;
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

    public double getPrecio() {
        return precio;
    }

    public Producto setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public Producto setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", unidadesStock=").append(unidadesStock);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals por codigo
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
