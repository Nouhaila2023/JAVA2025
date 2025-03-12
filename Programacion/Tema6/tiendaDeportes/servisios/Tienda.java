package Tema6.tiendaDeportes.servisios;

import Tema6.tiendaDeportes.entidades.LineaCompra;
import Tema6.tiendaDeportes.entidades.Producto;

import java.util.ArrayList;

public class Tienda {

    /**
     * Atributos
     */
    private ArrayList<Producto> productos;
    private ArrayList<Compra> compas;

    /**
     * Metodos basicos
     */

    /**
     * Constructor
     */
    public Tienda() {
        this.productos = new ArrayList<>();
        this.compas = new ArrayList<>();
    }

    /**
     * mostrarInventario
     */

    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println(producto.getUnidadesStock());
        }
    }

    public void mostrarCompras(){
        double total = 0;
        for (Compra compra : compas) {
            System.out.println(compra);
            total += compra.getPrecioTotal();
        }
    }

    public void addProducto(Producto producto) {
        if (!productos.contains(producto)) {
            productos.add(producto);
        }
    }

    public void delProducto(Producto producto) {
        if (productos.contains(producto)) {
            productos.remove(producto);
        }
    }

    public double addCompra(Compra compra) {

        for (LineaCompra l : compra.getLineaCompra()){
            Producto podoctoCompra = l.getProducto();
            boolean existe = false;

            for (Producto producto : productos){
               if (producto.equals(podoctoCompra)){
                   if (producto.getUnidadesStock() >= l.getProducto().getUnidadesStock()){
                       return producto.getUnidadesStock() - l.getCantidad();
                   }
               }
            }
        }
        return 0;
    }



    /**
     * Getter
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Compra> getCompas() {
        return compas;
    }


}
