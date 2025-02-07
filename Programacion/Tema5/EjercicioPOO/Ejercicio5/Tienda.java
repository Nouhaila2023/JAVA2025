package Tema5.EjercicioPOO.Ejercicio5;

import Tema5.EjercicioPOO.Ejercicio4.Producto;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;
    private double ventas;
    private double total;

    //Constructor
    public Tienda(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    //Getter and Setter
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    //Metodo adquirirProd(Producto unProducto) para añadir un Producto a la tienda.

    private void adquirirProd(Producto unProducto){
        productos.add(unProducto);
    }

    /**
     * Método venderProd(int identificador) para vender un Producto de la tienda. Este método
     * recorrerá todos los productos de la tienda para ver si lo tenemos en el ArrayList. Si lo tenemos y
     * hay stock suficiente llamaremos a su método vender, actualizaremos sumando en la propiedad
     * ‘ventas’ de la clase Tienda con el precio del producto vendido (quitando el descuento). Por último,
     * si al vender el stock del producto se queda a cero, eliminaremos ese Producto del ArrayList.
     */

    public void venderProd(int identificador){



    }



}