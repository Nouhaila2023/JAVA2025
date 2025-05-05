package Tema7_3.wallapop.service;

import Tema7_3.wallapop.enumes.Categoria;
import Tema7_3.wallapop.model.Compra;
import Tema7_3.wallapop.model.Producto2Mano;
import Tema7_3.wallapop.model.Usuario;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

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

    public void removeVentasUsuario(VentasUsuario ventasUsuario) {
        this.ventasUsuarioSet.remove(ventasUsuario);
    }

    //Metodo para buscar el objeto VentasUsuario correspondient a un usuario

    public VentasUsuario buscarVentasUsuario(Usuario usuario) {
        return ventasUsuarioSet.stream()
                .filter(p -> p.getUsuario().equals(usuario))
                .findFirst().orElse(null);
    }


    public void realizarCompra(Producto2Mano prudocto, Usuario comprador, double precio) {

        if(prudocto.getPrecio() > precio) {
            System.out.println("EL presio no valido");
            return;
        }
        Usuario vendedor = prudocto.getUsuario();

        if (comprador.equals(vendedor)){
            System.out.println("El usuario no puede comprar");
            return;
        }

        Compra compra = new Compra(vendedor, comprador,prudocto,LocalDate.now(), precio);

        VentasUsuario vv = buscarVentasUsuario(vendedor);
        VentasUsuario vu = buscarVentasUsuario(comprador);


    }

    public double CalcularPreciototal() {
        return compraList.stream()
                .mapToDouble(Compra::getPrecioCompra)
                .sum();
    }


    public Map<Usuario, List<Compra>> obtenerComprasAgrupadasPorUsuario() {
        Map<Usuario, List<Compra>> comprasAgrupadas = compraList.stream()
                .collect(Collectors.groupingBy(Compra::getComprador));
        comprasAgrupadas.forEach((usuario, compras) ->
                compras.sort(Comparator.comparing(Compra::getFecha))
        );
        return comprasAgrupadas;
    }

    /*public Map<Categoria, List<Compra>> comprasAgrupadasPorCateguria(){
       Map<Categoria, List<Compra>> comprasDeCateguria = compraList.stream()

        );

        return comprasDeCateguria;
    }*/


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
