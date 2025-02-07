package Tema5.EjercicioPOO.Ejercicio4;

import java.util.Objects;

public class Producto {
    //Propiedades
    private int id;
    private String descripcion;
    private double precio_unitario;
    private int unidades_disponibles;
    private int stok_maximo;
    private double descuento;


    //Constructor por defecto
    public Producto() {

    }

    //Constructor con parametros
    public Producto(int id, String descripcion, double precio_unitario, int unidades_disponibles, int stok_maximo, double descuento) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio_unitario = precio_unitario;
        this.unidades_disponibles = unidades_disponibles;
        this.stok_maximo = stok_maximo;
        this.descuento = 0.25;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getUnidades_disponibles() {
        return unidades_disponibles;
    }

    public void setUnidades_disponibles(int unidades_disponibles) {
        this.unidades_disponibles = unidades_disponibles;
    }

    public int getStok_maximo() {
        return stok_maximo;
    }

    public void setStok_maximo(int stok_maximo) {
        this.stok_maximo = stok_maximo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("id=").append(id);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio_unitario=").append(precio_unitario);
        sb.append(", unidades_disponibles=").append(unidades_disponibles);
        sb.append(", stok_maximo=").append(stok_maximo);
        sb.append(", descuento=").append(descuento);
        sb.append('}');
        return sb.toString();
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /*Metodo public boolean vender(int cantidad) que decrementa el atributo unidades disponibles.
    No se puede vender una cantidad negativa de un producto. Si no existe producto suficiente
    significa que no se ha podido realizar la operación y se devolverá false. En caso de existir
    suficiente producto se restará de las unidades disponibles y sedevolverá true para indicar que
    se realizó correctamente la operación*/








}
