package Tema6.PracticaDeCasa;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tienda tienda = new Tienda();

        tienda.añadirProducto(new Equipamiento("E01", "Raqueta de tenis", 100.0, 10, "Tenis", "Wilson"));
        tienda.añadirProducto(new RopaDeportiva("R01", "Camiseta deportiva", 25.0, 50, "M", "Algodón"));


        int opcion;

        try {
            do {
                System.out.println("*************************************:)");
                System.out.println("* 1. Mostrar inventario.*************:)");
                System.out.println("* 2. Agregar producto.***************:)");
                System.out.println("* 3. Eliminar producto.**************:)");
                System.out.println("* 4. Actualizar producto.************:)");
                System.out.println("* 5. Realizar compra.****************:)");
                System.out.println("* 6. Mostrar historial de compras.***:)");
                System.out.println("* 7. Salir.**************************:)");
                System.out.println("*************************************:)");
                System.out.println("Introduzca una opcion");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                   case 1:

                       break;
                   case 2:

                       break;

                   case 3:

                        break;
                   case 4:

                        break;
                   case 5:

                        break;
                   case 6:

                        break;
                   case 7:
                       System.out.println("Gracias para usar nuestro Aplicacion:)");
                        break;
                   default:

                        break;
                }

            }while (opcion != 6);

        }catch (StockInsuficienteException ste){
            System.out.println(ste);
        }










    }
}
