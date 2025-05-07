package Tema7_3.tipoExamen.service;

import Tema7_3.tipoExamen.model.Compra;
import Tema7_3.tipoExamen.model.Producto;
import Tema7_3.tipoExamen.model.Usuario;

import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VentasUsuario {
    /**
     * Atributos
     */
    private Usuario usuario;
    private Set<Producto> productos;
    private ArrayList<Compra> ventas;
    private ArrayList<Compra> compras;

    /**
     * Constructor
     */
    public VentasUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.productos = new HashSet<>();
        this.ventas = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    /**
     * Metodo para añadir un producto a los disponibles de ese usuario
     * @param producto
     */
    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Metodo para eliminar de la lista disponible
     * @param producto
     */
    public void removeProducto(Producto producto) {
        productos.remove(producto);
    }

    /**
     * Añadir una venta
     * @param venta
     */
    public void addVenta(Compra venta) {
        ventas.add(venta);
        productos.remove(venta.getProducto());
    }

    /**
     * Añadir una compra
     * @param compra
     */
    public void addCompra(Compra compra) {
        compras.add(compra);
    }

    /**
     * Mostrar vendas
     */

    /*public List<Compra> printVenta() {
        return new ArrayList<>(ventas);
    }*/

    public void mostrarVentas() {
        for(Compra venta : ventas) {
            System.out.println(venta);
        }
    }

    /**
     * Mostrar compras
     */
    public void mostrarCompras() {
        for(Compra compra : compras) {
            System.out.println(compra);
        }
    }

    /* public List<Compra> printCompra() {
        return new ArrayList<>(compras);
    }*/


    /**
     * Getter
     */
    public Usuario getUsuario() {
        return usuario;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Compra> getVentas() {
        return ventas;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    /**
     * Setter
     */
    public VentasUsuario setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }


    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VentasUsuario{");
        sb.append("usuario=").append(usuario);
        sb.append(", productos=").append(productos);
        sb.append(", ventas=").append(ventas);
        sb.append(", compras=").append(compras);
        sb.append('}');
        return sb.toString();
    }
}

