package Tema6.practicaCasa.servicios;

import Tema6.practicaCasa.entidades.interfaces.Producto;
import Tema6.practicaCasa.excepciones.StockInsuficienteException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Tienda {

    private List<Producto> inventario = new ArrayList<>();
    private List<Compra> historialCompra = new ArrayList<>();

    /*constructor
    public Tienda() {
        this.inventario = new ArrayList<>();
        this.historialCompra = new ArrayList<>();
    }*/

    /**
     * Añadir Producto
     * @param producto
     */
    public void añadirProducto(Producto producto) {
       for(Producto p : inventario) {
           if (!(p.getCodigo().equals(producto.getCodigo()))) {
               inventario.add(producto);
           }else {
               System.out.println("No puedes añadir este producto: {YA EXISTE}");
           }
       }
    }

    /**
     * Eliminar Producto
     * @return
     */

    public void eliminarProducto(String codigo){
        Producto producto = buscarProducto(codigo);
        inventario.remove(producto);
    }

    /**
     * Actualizar(modificar) Producto
     */

    public void actualizarProducto(String codigo, double nuevoPrecio, int nuevoStock){
        Producto producto = buscarProducto(codigo);
        producto.setPrecio(nuevoPrecio);
        producto.setStock(nuevoStock);
        System.out.println("Producto modificado: " + producto);
    }

    /**
     * realizar compra
     */

    public void realizarCompra(String codigo, int cantidad) throws StockInsuficienteException {
        Producto producto = buscarProducto(codigo);
       if (producto.getStock() < cantidad) {
           throw new StockInsuficienteException("No hay productos en la tienda.");
       }
       producto.descontarStock(cantidad);
       historialCompra.add(new Compra( producto, cantidad ));
    }

    /**
     * Metodo para buscar el codigo
     * @param codigo
     * @return
     */
    public Producto buscarProducto(String codigo){
        for(Producto p : inventario) {
            if(p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    /**
     * mostrar Inventario
     * @return
     */

    public void mostrarInventario(){
        for (Producto p : inventario) {
            System.out.println(p.getInfo());
        }
    }

    public void mostrarHistorialCompras(){
        for (Compra c : historialCompra) {
            System.out.printf(c.toString());
        }
    }


    /*getter*/
    public List<Producto> getInventario() {
        return inventario;
    }

    public List<Compra> getHistorialCompra() {
        return historialCompra;
    }
}
