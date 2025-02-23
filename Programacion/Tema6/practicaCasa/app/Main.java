package Tema6.practicaCasa.app;
import Tema6.practicaCasa.entidades.Equipamiento;
import Tema6.practicaCasa.entidades.RopaDeportiva;
import Tema6.practicaCasa.servicios.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // Creamos la tienda
        Tienda tienda = new Tienda();

        // Agregamos los productos a la tienda
        tienda.añadirProducto(new Equipamiento("001", "Raqueta de Tenis", 120.50, 10, "Tenis", "Wilson"));
        tienda.añadirProducto(new RopaDeportiva("002", "Camiseta Deportiva", 25.75, 20, "M", "Poliéster"));
        tienda.añadirProducto(new Equipamiento("003", "Pelota de Futbol", 15.99, 50, "Fútbol", "Adidas"));

        do {
            System.out.println("\n--- Menú de la Tienda ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Realizar compra");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: \n");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea residual después de nextInt()
            } catch (Exception e) {
                System.out.println("Debes ingresar un número válido.");
                sc.nextLine(); // Consumir la entrada incorrecta para evitar bucles infinitos
                continue;
            }

            switch (opcion) {

                case 1:
                    // Agregar un producto a la tienda
                    System.out.println("\n--- Agregar producto ---\n");
                    System.out.print("Código del producto: ");
                    String codigo = sc.nextLine();

                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio del producto: ");
                    double precio = sc.nextDouble();

                    System.out.print("Stock del producto: ");
                    int stock = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer después de nextInt()

                    System.out.print("Tipo (Equipamiento / RopaDeportiva): ");
                    String tipo = sc.nextLine();

                    if ("Equipamiento".equalsIgnoreCase(tipo)) {
                        System.out.print("Deporte: ");
                        String deporte = sc.nextLine();
                        System.out.print("Marca: ");
                        String marca = sc.nextLine();
                        tienda.añadirProducto(new Equipamiento(codigo, nombre, precio, stock, deporte, marca));

                    } else if ("RopaDeportiva".equalsIgnoreCase(tipo)) {
                        System.out.print("Talla: ");
                        String talla = sc.nextLine();
                        System.out.print("Material: ");
                        String material = sc.nextLine();
                        tienda.añadirProducto(new RopaDeportiva(codigo, nombre, precio, stock, talla, material));
                    } else {
                        System.out.println("Tipo de producto no válido.");
                    }
                    break;

                case 2:
                    // Eliminar producto
                    System.out.println("\n--- Eliminar producto ---\n");
                    System.out.println("Introduce el codigo del producto a eliminar: ");
                    String codigoProducto = sc.nextLine();
                    tienda.eliminarProducto(codigoProducto);
                    break;

                case 3:
                    // Actualizar producto
                    System.out.print("Código del producto a actualizar: ");
                    String codigoActualizar = sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    System.out.print("Nuevo stock: ");
                    int nuevoStock = sc.nextInt();
                    tienda.actualizarProducto(codigoActualizar, nuevoPrecio, nuevoStock);
                    break;
                case 4:
                    try {

                        // Mostrar inventario
                        System.out.println("Alejandro el malito");
                        tienda.mostrarInventario();
                        System.out.println("Nouhaila la buena");

                        break;
                    }catch (Exception e){
                        System.out.println("Error");
                    }


                case 5:
                    // Realizar compra
                    System.out.println("\n--- Realizar Compra ---\n");
                    System.out.println("Introduce el codigo del producto a comprar: ");
                    String codigoCompra = sc.nextLine();
                    System.out.println("Introduce la cantidad: ");
                    int cantidad = sc.nextInt();
                    tienda.realizarCompra(codigoCompra, cantidad);
                    break;

                case 6:
                    System.out.println("¡Tienda Cerrada!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 6);

        sc.close(); // Cerrar el scanner


    }
}
