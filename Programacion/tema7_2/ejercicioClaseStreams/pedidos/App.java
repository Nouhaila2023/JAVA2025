package tema7_2.ejercicioClaseStreams.pedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Cliente c1 = new Cliente(1L, "Manuel García", 2);
        Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
        Cliente c3 = new Cliente(3L, "Goyo Jiménez", 2);
        Producto prod1 = new Producto(1L, "Libro1", Categoria.c, 19.95);
        Producto prod2 = new Producto(2L, "Libro2", Categoria.b, 27.95);
        Producto prod3 = new Producto(3L, "Libro3", Categoria.c, 22.95);
        Producto prod4 = new Producto(4L, "Libro4", Categoria.c, 15.95);
        Producto prod5 = new Producto(5L, "Libro5", Categoria.c, 19.95);
        Producto prod6 = new Producto(6L, "Juego1", Categoria.a, 59.95);
        Producto prod7 = new Producto(7L, "Juego2", Categoria.b, 67.95);
        Producto prod8 = new Producto(8L, "Juego3", Categoria.c, 52.95);
        Producto prod9 = new Producto(9L, "Juego4", Categoria.b, 55.95);
        Producto prod10 = new Producto(10L, "Juego5", Categoria.a, 69.95);
        Producto prod11 = new Producto(11L, "Periferico1", Categoria.a, 19.95);
        Producto prod12 = new Producto(12L, "Periferico2", Categoria.b, 27.95);
        Producto prod13 = new Producto(13L, "Periferico3", Categoria.c, 32.95);
        Producto prod14 = new Producto(14L, "Periferico4", Categoria.a, 45.95);
        Producto prod15 = new Producto(15L, "Periferico5", Categoria.a, 59.95);
        Pedido ped1 = new Pedido(1L, LocalDate.now().plusDays(5), null ,Estado.RECIBIDO,c1);
        Pedido ped2 = new Pedido(2L, LocalDate.now().plusDays(20), null, Estado.RECIBIDO, c2);
        Pedido ped3 = new Pedido(3L, LocalDate.now().plusDays(7),null, Estado.RECIBIDO, c3);
        Pedido ped4 = new Pedido(4L,  LocalDate.now().plusDays(2),null, Estado.RECIBIDO, c1);

        ped1.setProductos(new HashSet<>( List.of(prod1, prod3, prod5, prod10)));
        ped2.setProductos(new HashSet<>( List.of(prod2, prod4, prod8, prod12)));
        ped3.setProductos(new HashSet<>( List.of(prod11, prod13, prod14, prod15)));
        ped4.setProductos(new HashSet<>( List.of(prod6, prod7, prod9, prod1, prod2, prod10)));
        ArrayList<Pedido> pedidos = new ArrayList<>(List.of(ped1, ped2, ped3, ped4));


        /*1. Muestra los libros cuyo precio sea mayor de 20€*/

        pedidos.stream()
                .flatMap(p -> p.getProductos().stream())
                .filter(producto -> producto.getNombre().toLowerCase().contains("libro"))
                .filter(producto -> producto.getPrecio() > 20.0)
                .forEach(System.out::println);


        /*2. Muestra los pedidos que tengan algún pedido de "Juegos"*/

        /*3. Genera una lista con todos los Productos, pero cambia su precio para que lleven un 10%
                de descuento*/

        /*4. Saca los productos que aparecen en los pedidos de clientes de nivel 2, realizados entre
        el 01-04-2025 y el 01-05-2025. Hay que usar flatmap para unir todos los productos de
        todos los pedidos: .flatMap(p -> p.getProductos().stream())*/

        /*5. Muestra el producto más caro de la categoría Juegos*/

        /*6. Devuelve los dos pedidos más recientes*/

        /*7. Muestra los pedidos hechos hoy, debe aparecer el pedido y debajo la lista de productos
        de ese pedido (peek y flatmap)*/

        /*8. Calcula el total de todos los pedidos de abril de 2025*/










    }
}
