package tema7_2.ejercicioClaseStreams.pedidos;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        // Crear clientes
        Cliente c1 = new Cliente(1L, "Manuel García", 2);
        Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
        Cliente c3 = new Cliente(3L, "Goyo Jiménez", 2);

        // Crear productos
        Producto prod1 = new Producto(1L, "Libro1", Categoria.LIBROS, 19.95);
        Producto prod2 = new Producto(2L, "Libro2", Categoria.LIBROS, 27.95);
        Producto prod3 = new Producto(3L, "Libro3", Categoria.LIBROS, 22.95);
        Producto prod4 = new Producto(4L, "Libro4", Categoria.LIBROS, 15.95);
        Producto prod5 = new Producto(5L, "Libro5", Categoria.LIBROS, 19.95);

        Producto prod6 = new Producto(6L, "Juego1", Categoria.JUEGOS, 59.95);
        Producto prod7 = new Producto(7L, "Juego2", Categoria.JUEGOS, 67.95);
        Producto prod8 = new Producto(8L, "Juego3", Categoria.JUEGOS, 52.95);
        Producto prod9 = new Producto(9L, "Juego4", Categoria.JUEGOS, 55.95);
        Producto prod10 = new Producto(10L, "Juego5", Categoria.JUEGOS, 69.95);

        Producto prod11 = new Producto(11L, "Periferico1", Categoria.PERIFERICOS, 19.95);
        Producto prod12 = new Producto(12L, "Periferico2", Categoria.PERIFERICOS, 27.95);
        Producto prod13 = new Producto(13L, "Periferico3", Categoria.PERIFERICOS, 32.95);
        Producto prod14 = new Producto(14L, "Periferico4", Categoria.PERIFERICOS, 45.95);
        Producto prod15 = new Producto(15L, "Periferico5", Categoria.PERIFERICOS, 59.95);

        // Crear pedidos
        Pedido ped1 = new Pedido(1L, c1, Estado.RECIBIDO, LocalDate.now().plusDays(5), null);
        Pedido ped2 = new Pedido(2L, c2, Estado.RECIBIDO, LocalDate.now().plusDays(20), null);
        Pedido ped3 = new Pedido(3L, c3, Estado.RECIBIDO, LocalDate.now().plusDays(7), null);
        Pedido ped4 = new Pedido(4L, c1, Estado.RECIBIDO, LocalDate.now().plusDays(2), null);


        ped1.setProductos(new HashSet<>(List.of(prod1, prod3, prod5, prod10)));
        ped2.setProductos(new HashSet<>(List.of(prod2, prod4, prod8, prod12)));
        ped3.setProductos(new HashSet<>(List.of(prod11, prod13, prod14, prod15)));
        ped4.setProductos(new HashSet<>(List.of(prod6, prod7, prod9, prod1, prod2, prod10)));

        List<Pedido> pedidos = new ArrayList<>(List.of(ped1, ped2, ped3, ped4));

        // Ejercicio 1: Libros cuyo precio sea mayor a 20€

        pedidos.stream()
                .flatMap(p -> p.getProductos().stream())
                .filter(p -> p.getCategoria() == Categoria.LIBROS && p.getPrecio() > 20)
                .forEach(System.out::println);




        // Ejercicio 2: Pedidos con al menos un producto de la categoría JUEGOS
        System.out.println("*************************************************************************************************************************************");


        pedidos.stream()
                .flatMap(p -> p.getProductos().stream())
                .filter(p -> p.getCategoria() == Categoria.JUEGOS)
                .forEach(System.out::println);



         /*3. Genera una lista con todos los Productos, pero cambia su precio para que lleven un 10%
                de descuento*/
        System.out.println("*************************************************************************************************************************************");

        List<Producto> productos = pedidos.stream()
                .flatMap( p -> p.getProductos().stream())
                .map(p -> new Producto(
                        p.getId(),
                        p.getNombre(),
                        p.getCategoria(),
                        p.getPrecio()*0.9
                ))
                .toList();

        productos.forEach(System.out::println);


        /*4. Saca los productos que aparecen en los pedidos de clientes de nivel 2, realizados entre
        el 01-04-2025 y el 01-05-2025. Hay que usar flatmap para unir todos los productos de
        todos los pedidos: .flatMap(p -> p.getProductos().stream())*/

        System.out.println("*************************************************************************************************************************************");
        //pedido = fechas, cliente = nevel


        LocalDate desde = LocalDate.of(2025, 4, 1);
        LocalDate hasta = LocalDate.of(2025, 5, 1);

        List<Producto> productosClientesNivel2 = pedidos.stream()
                .filter(p -> p.getCliente().getNivel() == 2)
                .filter(p -> p.getFechaPedido().isAfter(desde.minusDays(1)) && p.getFechaPedido().isBefore(hasta.plusDays(1)))
                .flatMap(p -> p.getProductos().stream())
                .distinct()
                .toList();

        productosClientesNivel2.forEach(System.out::println);


        /*5. Muestra el producto más caro de la categoría Juegos*/
        System.out.println("*************************************************************************************************************************************");

        pedidos.stream()
                .flatMap(p -> p.getProductos().stream())
                .filter(p -> p.getCategoria() == Categoria.JUEGOS)
                .max(Comparator.comparing(Producto::getPrecio))
                .ifPresent(System.out::println);


        /*6. Devuelve los dos pedidos más recientes*/
        System.out.println("*************************************************************************************************************************************");

        pedidos.stream()
                .sorted(Comparator.comparing(Pedido::getFechaPedido).reversed())  // ترتيب الطلبات حسب التاريخ من الأحدث
                .limit(2)
                .forEach(System.out::println);



        /*7. Muestra los pedidos hechos hoy, debe aparecer el pedido y debajo la lista de productos
        de ese pedido (peek y flatmap)*/
        System.out.println("*************************************************************************************************************************************");

        pedidos.stream()
                .filter( f -> f.getFechaPedido().isEqual(LocalDate.now()))
                .peek(p -> {
                    System.out.println("Pedido ID: " + p.getId() + ", Cliente: " + p.getCliente().getNombre());
                })
                .flatMap(p -> p.getProductos().stream())
                .forEach(System.out::println);





        /*8. Calcula el total de todos los pedidos de abril de 2025*/
        System.out.println("*************************************************************************************************************************************");


        LocalDate inicioAbril = LocalDate.of(2025, 4, 1);
        LocalDate finAbril = LocalDate.of(2025, 4, 30);

        double totalAbril = pedidos.stream()
                .filter(p -> !p.getFechaPedido().isBefore(inicioAbril) && !p.getFechaPedido().isAfter(finAbril))
                .flatMap(p -> p.getProductos().stream())
                .mapToDouble(Producto::getPrecio)
                .sum();

        System.out.println(totalAbril );








    }
}
