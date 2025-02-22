package Tema6.PracticaDeClase;

import java.util.ArrayList;

public class Tienda {
    ///Atributos
    private ArrayList<Producto> productos;
    private ArrayList<Compra> compras;

    //Constructur

    public Tienda() {
        this.productos = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    //get
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    //void añadirProducto(Producto p)
    public void añadirProducto(Producto p){
        productos.add(p);
    }

    //void eliminarProducto(String codigo)
    public void eliminarProducto(String codigo){
        Producto pto = null;

        productos.remove(codigo);
    }


    public boolean actualizarProducto(String codigo, double
            nuevoPrecio, int nuevoStock){

        for (Producto producto : productos){
            if (producto.getCodigo().equalsIgnoreCase(codigo)){
                producto.getPrecio();
                producto.getStock();

            }

        }

        return false;
    }

    boolean realizarCompra(String codigo, int cantidad){
        for (Producto producto : productos){

            if (producto.getCodigo().equalsIgnoreCase(codigo)){
                if (producto.getStock() >= cantidad){
                    System.out.println("El stock es suficiente");
                }else {
                    System.out.println("StockInsuficienteException");
                }
            }else {

            }




        }
        return false;
    }


    public void mpostrarInventario(){
        for (Producto producto : productos){
            System.out.println(producto.getInfo());
        }
    }

    public void mostrarHistorialCompras(){
        for (Compra compra : compras){
            System.out.println(compra);
        }
    }


    public void actualizarProducto(Producto producto) {
    }
}
