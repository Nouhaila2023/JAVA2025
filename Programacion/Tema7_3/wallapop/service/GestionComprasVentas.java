package Tema7_3.wallapop.service;

import Tema7_3.wallapop.model.Compra;
import Tema7_3.wallapop.model.Producto2Mano;
import Tema7_3.wallapop.model.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestionComprasVentas {

    private Set<VentasUsuario> ventasUsuarioSet;
    private List<Compra> compraList;

    public GestionComprasVentas() {
        this.ventasUsuarioSet = new HashSet<>();
        this.compraList = new ArrayList<>();
    }

    public void addVentasUsuario(VentasUsuario ventasUsuario) {
        this.ventasUsuarioSet.add(ventasUsuario);
    }

    private void removeVentasUsuario(VentasUsuario ventasUsuario) {
        this.ventasUsuarioSet.remove(ventasUsuario);
    }

    public void realizarCompra(Producto2Mano prudocto, Usuario comprador, double precio) {

        Usuario vendedor = prudocto.getUsuario();

        Compra compra = new Compra(vendedor, comprador, prudocto, LocalDate.now(), precio);
        this.compraList.add(compra);
    }


    public Set<VentasUsuario> getVentasUsuarioSet() {
        return ventasUsuarioSet;
    }

    public List<Compra> getCompraList() {
        return compraList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GestionComprasVentas{");
        sb.append("ventasUsuarioSet=").append(ventasUsuarioSet);
        sb.append(", compraList=").append(compraList);
        sb.append('}');
        return sb.toString();
    }
}
