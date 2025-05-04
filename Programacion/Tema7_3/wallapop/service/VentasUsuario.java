package Tema7_3.wallapop.service;

import Tema7_3.wallapop.model.Compra;
import Tema7_3.wallapop.model.Producto2Mano;
import Tema7_3.wallapop.model.Usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class VentasUsuario {

    private Usuario usuario;
    //Los productos que tiene el usuario
    private Set<Producto2Mano> productosDisponible;
    //Las vendas que tiene
    private ArrayList<Compra> ventas;
    //Las compras que tiene
    private ArrayList<Compra> compras;


    public VentasUsuario(Usuario usuario) {
        this.usuario = usuario;
        productosDisponible = new HashSet<>();
        ventas = new ArrayList<>();
        compras = new ArrayList<>();
    }

    public void addProdocto(Producto2Mano producto) {
        productosDisponible.add(producto);
    }

    public void removeProdocto(Producto2Mano producto) {
        productosDisponible.remove(producto);
    }

    public void addVenta(Compra venta) {
        if (!ventas.contains(venta)) {
            ventas.add(venta);
        }
    }

    public void addCompra(Compra compra) {
        if (!compras.contains(compra)) {
            compras.add(compra);
        }
    }

    public void mostrarVentas() {
        for (Compra compra : ventas) {
            System.out.println(compra);
        }
    }

    public void mostrarCompras() {
        for (Compra compra : compras) {
            System.out.println(compra);
        }
    }


    public VentasUsuario setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Set<Producto2Mano> getProductosDisponible() {
        return productosDisponible;
    }

    public ArrayList<Compra> getVentas() {
        return ventas;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VentasUsuario{");
        sb.append("usuario=").append(usuario);
        sb.append(", productosDisponible=").append(productosDisponible);
        sb.append(", ventas=").append(ventas);
        sb.append(", compras=").append(compras);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VentasUsuario that = (VentasUsuario) o;
        return Objects.equals(usuario, that.usuario) && Objects.equals(productosDisponible, that.productosDisponible) && Objects.equals(ventas, that.ventas) && Objects.equals(compras, that.compras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, productosDisponible, ventas, compras);
    }
}
