package Tema5.EjercicioPOO.Ejercicio5;

import Tema5.EjercicioPOO.Ejercicio4.Producto;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;
    private double ventas;
    private double total;

    //Constructor

    public Tienda() {
    }

    public Tienda(ArrayList<Producto> productos) {
        this.productos = productos;
        this.ventas = 0;
        this.total = 0;
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

    public void adquirirProd(Producto unProducto){
        productos.add(unProducto);
    }

    /**
     * Método venderProd(int identificador) para vender un Producto de la tienda. Este método
     * recorrerá todos los productos de la tienda para ver si lo tenemos en el ArrayList. Si lo tenemos y
     * hay stock suficiente llamaremos a su método vender, actualizaremos sumando en la propiedad
     * ‘ventas’ de la clase Tienda con el precio del producto vendido (quitando el descuento). Por último,
     * si al vender el stock del producto se queda a cero, eliminaremos ese Producto del ArrayList.
     */

    public void venderProd(int identificador, int cantidad){
        for (Producto producto: productos){
            if (producto.getId() == identificador){
                System.out.println("El prodocto " + producto.getDescripcion() + " exeste en la tienda.Grecias");
                if (producto.vender(cantidad)){
                    double precioFinal;
                    precioFinal = producto.getPrecio_unitario() * (1 - producto.getDescuento());
                    this.ventas += precioFinal;
                    this.total += cantidad;
                }
                if (producto.getUnidades_disponibles() == 0){
                    System.out.println("Pruducto " + producto.getDescripcion() + " no existe en la tienda.Grecias");
                }
            }else {
                System.out.println("Esta producto no existe en la tienda:)");
            }
        }


    }



}