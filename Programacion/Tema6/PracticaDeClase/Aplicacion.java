package Tema6.PracticaDeClase;

import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tienda tienda = new Tienda();

        tienda.añadirProducto((Producto) new RopaDeportiva("RD1", "ropo", 22.0, 100,"S, M, L", "algudon"));
        tienda.actualizarProducto((Producto) new Equipamiento("EP1", "equipo", 12.0, 50, "deporte", "AD"));



        int opcion = 0;

        do {

            System.out.println("+++++++++++MENÚ++++++++++++");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Realizar compra");
            System.out.println("6. Mostrar historial de compras.");
            System.out.println("7. Salir :)");
            opcion = Integer.parseInt(sc.nextLine());
            try {

                switch (opcion){
                    case 1:
                        tienda.añadirProducto((Producto)new RopaDeportiva("RD1", "ropo", 22.0, 100,"S, M, L", "algudon") );
                    case 2:
                        System.out.println("Agrega los informaciones");
                        System.out.println("Codigo");
                        String codigo = sc.nextLine();
                        System.out.println("Nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Precio");
                        double precio = sc.nextDouble();

                        Equipamiento equipamiento = new Equipamiento(codigo, nombre, precio, 50, "mde", "marca");

                        break;
                    case 3:
                        String code = sc.nextLine();
                        tienda.eliminarProducto(code);
                        break;
                    case 4:
                        System.out.println("Agrega los informaciones");
                        System.out.println("Codigo");
                        String codigo1 = sc.nextLine();
                        System.out.println("Precio");
                        double precio1 = sc.nextDouble();
                        System.out.println("Stock");
                        int stock1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Stock");
                        if (tienda.actualizarProducto(codigo1,precio1, stock1)){
                            System.out.println("Corecto");
                        }else {
                            System.out.println("Incorecto");
                        }
                        break;
                    case 5:
                        System.out.println("Codigo");
                        String codigo2 = sc.nextLine();
                        int conti = Integer.parseInt(sc.nextLine());
                        System.out.println("Cantidad");
                        if (tienda.realizarCompra(codigo2,conti)){
                            System.out.println("Compra realizada");
                        }

                        break;
                    case 6:
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("Ha terminado la programa. Gracia");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }

            }catch (Exception es){
                System.out.println("Error");
            }

        }while (opcion != 7);







    }
}
