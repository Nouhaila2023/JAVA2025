package Tema6.PracticaDeCasa;

public abstract class ProductoBase implements Producto {

    /**
     * Atributos comunes:
     */

    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int stock;

    /**
     * Constructor
     */

    public ProductoBase(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Implementa la interfaz Producto:
     * Provee métodos comunes como getters, setters y
     * descontarStock().
     * @return
     */

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getStock(int cantidad) {
        this.stock -= cantidad;
        return this.stock;
    }

    @Override
    public void descontarStock(int cantidad) {
        this.stock -= cantidad;
    }

    /**
     * setter
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Metodo abstracto:
     * @return
     */
    @Override
    public abstract String getInfo();



}
