package Tema7_3.tipoExamen.service;

import Tema7_3.tipoExamen.model.Compra;
import Tema7_3.tipoExamen.model.Producto;
import Tema7_3.tipoExamen.model.Usuario;
import Tema7_3.tipoExamen.model.enumes.Categoria;
import Tema7_3.tipoExamen.model.enumes.Estado;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Collectors;

public class GestionComprasVentas {
    /**
     * Atributos
     */
    private Set<VentasUsuario> ventasUsuario;
    private List<Compra> compras;

    /**
     * Constructor
     */
    public GestionComprasVentas() {
        this.ventasUsuario = new HashSet<>();
        this.compras = new ArrayList<>();
    }

    /**
     * Metodo para añadir ventas
     * @param ventas
     */
    public void addVentasUsuario(VentasUsuario ventas) {
        ventasUsuario.add(ventas);
    }

    /**
     * Metodo para eliminar ventas
     * @param ventas
     */
    public void removeVentasUsuario(VentasUsuario ventas) {
        ventasUsuario.remove(ventas);
    }

    /**
     *  Metodo fundamental -> realizarCompra(Usuario comprasor, Producto producto)
     *      * que Creara un objeto compra
     *      * Lo añadira a la lista de compras de esta clase
     *      * añadira a la lista de ventas del usuario que lo vende y a la lista de compras del usuario
     * @param comprador
     * @param producto
     * @param precio
     */

    /**Nesicitamos un metodo buscar si hay o no  ---> buscarUsuario**/
    public void realizarCompra(Usuario comprador, Producto producto,double precio){

        Usuario vendedor = producto.getUsuario();
        Compra compra = new Compra(comprador, vendedor, producto, LocalDate.now(), precio);

        this.compras.add(compra);

        /*Si el comprador es el mismo, lo añadimos a la compra*/
        this.buscarUsuario(comprador).addCompra(compra);
        /*Si el vendedor es el mismo, lo añadimos a la venta*/
        this.buscarUsuario(vendedor).addVenta(compra);

    }

    public VentasUsuario buscarUsuario(Usuario usuario){
        return this.ventasUsuario.stream()
                .filter( u -> u.getUsuario().equals(usuario))
                .findFirst().orElse(null);
    }


    /**
     * Metodos de Streams
     */

    /**
     * 1. Calcular el importe total de compra
     */
    public Double importeTotalDeCompras(){
         return compras.stream()
                .mapToDouble(Compra::getPrecio)
                .sum();
    }

    /**
     * Sacar las compras agrupadas por usuario (Map)
     * Ordenadas por fecha.
     * {Map<Usuario, Lista<Compra>>}
     */

    public Map<Usuario, List<Compra>> UsuarioOrdenadoPorFecha(){
         Map<Usuario, List<Compra>> usuarioOrdenado = this.compras.stream()
                 .collect(Collectors.groupingBy(Compra::getComprador));
         usuarioOrdenado.forEach( (u, c) ->
                 c.sort(Comparator.comparing(Compra::getFecha)));

         return usuarioOrdenado;
    }

    /**
     * Sacar todos las compras agrupadas por categoria
     * {Map<Categoria, List<Compra>}
     */

    public Map<Categoria, List<Compra>> comprasAgrupadasPorCategoria(){
        Map<Categoria, List<Compra>> comprasDeCategoria = compras.stream()
                .collect(Collectors.groupingBy(c -> c.getProducto().getCategoria()));
        return comprasDeCategoria;
    }

    /**
     * Sacar numero total de compras agrupada por estado
     * Map<Estado, Long>
     */

    public Map<Estado, Long> totalComprasDeEstado(){
        return compras.stream()
                .collect(Collectors.groupingBy(e -> e.getProducto().getEstado(), Collectors.counting()));
    }

    /**
     * Scara numero total de compras por categoria para usuario de menos de 30 años
     */

    public Map<Categoria, List<Compra>> comprasDeCategoriaUsuarioMenos30(){
        Map<Categoria, List<Compra>> comprasDeCategoria = compras.stream()
                .filter(u -> (LocalDate.now().getYear() - u.getProducto().getUsuario().getFechaNacimiento().getYear()) < 30 )
                .collect(Collectors.groupingBy(c -> c.getProducto().getCategoria()));

        return comprasDeCategoria;
    }


    /**
     * Sacar el numeor total de compras agrupadas por dia de la semana
     */

    public Map<String, Long> comprasPorDiaSemana(){
        return this.compras.stream()
                .collect(Collectors.groupingBy(f -> f.getFecha().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("es", "ES")),
                        Collectors.counting()));
    }


    /**
     * Getter
     */
    public Set<VentasUsuario> getVentasUsuario() {
        return ventasUsuario;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    /**
     * toStirng
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GestionComprasVentas{");
        sb.append("ventasUsuario=").append(ventasUsuario);
        sb.append(", compras=").append(compras);
        sb.append('}');
        return sb.toString();
    }
}
