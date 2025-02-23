package Tema6.practicaCasa.entidades;

import Tema6.practicaCasa.entidades.interfaces.Producto;

public abstract class ProductoBase implements Producto {

    /**
     * Atributos comunes:
     */
    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int stock;

    /**
     * Getters de producto
     * @return
     */
    public String getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void descontarStock(int cantidad){
        if (stock >= cantidad){
            this.stock -= cantidad;
        }else {
            System.out.println("La cantidad no es suficiente.");
        }
    }

    /**
     * Metodo abstracto
     */
    public abstract String getInfo();



}
