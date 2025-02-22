package Tema6.PracticaDeCasa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tienda {

    /**
     * Atributos
     */

    ArrayList<Producto> inventario;
    ArrayList<Compra> historialCompras;

    /**
     * Constructor
     */
    public Tienda() {
        inventario = new ArrayList<>();
        historialCompras = new ArrayList<>();
    }
    /**
     * Getter
     */
    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public ArrayList<Compra> getHistorialCompras() {
        return historialCompras;
    }

    /**
     * Metodos principales
     */


    /**
     * Añadir Prodocto
     * @param producto
     */
    void añadirProducto(Producto producto) {
        inventario.add(producto);
    }

    /**
     * Eliminar Producto
     */
    void  eliminarProducto(String Codigo) {
        for (Producto producto : inventario) {
            if (producto.getCodigo().equals(Codigo)) {
                inventario.remove(producto);
            }
        }
    }

    /**
     * Actualizar Producto
     */

    void actualizarProducto(String codigo, double
            nuevoPrecio, int nuevoStock){
        for (Producto producto : inventario) {
            if (producto.getCodigo().equals(codigo)) {
                producto.setPrecio(nuevoPrecio);
                producto.setStock(nuevoStock);
                System.out.println("Producto actualizado");
                return;
            }
        }
        System.out.println("Productos no encontrados");

    }
    /**
     * Realizar Compra
     */

    void realizarCompra(String codigo, int cantidad){
        for (Producto producto : inventario) {
            //Buscar el producto por codigo
            if (producto.getCodigo().equals(codigo)) {
                //Verificar que el stock sea suficiente
               if (producto.getStock() >= cantidad) {
                   producto.descontarStock(cantidad);
                   historialCompras.add(new Compra(LocalDate.now(), producto, cantidad, producto.getPrecio() * cantidad));
                   System.out.println("Compra realizada con éxito.");
                   return;
               }else {
                    throw new StockInsuficienteException("Cantidad insuficiente");
               }

            }
        }

    }

    /**
     * Mostrar Inventario
     */

    void mostrarInventario(){
        for (Producto producto : inventario) {
            System.out.println(producto.getInfo());
        }
    }

    /**
     * Mostrar Historia de compra
     */
    void mostrarHistorialCompras(){
        for (Compra compra : historialCompras) {
            System.out.println(compra);
        }
    }
















}
