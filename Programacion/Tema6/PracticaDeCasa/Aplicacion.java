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
                       tienda.mostrarInventario();
                       break;
                   case 2:
                       System.out.println("Agrega los informaciones");
                       System.out.println("Codigo");
                       String codigo = sc.nextLine();
                       System.out.println("Nombre");
                       String nombre = sc.nextLine();
                       System.out.println("Precio");
                       double precio = sc.nextDouble();

                       Tema6.PracticaDeClase.Equipamiento equipamiento = new Tema6.PracticaDeClase.Equipamiento(codigo, nombre, precio, 50, "mde", "marca");
                       break;

                   case 3:
                       System.out.println("Entrega el codigo del prodocto que quieres eleminar:)");
                       String codigoEntregado = sc.nextLine();
                       tienda.eliminarProducto(codigoEntregado);
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

                       /*if (tienda.actualizarProducto(codigo1, precio1, stock1)){
                           System.out.println("Corecto");
                       }else {
                           System.out.println("Incorecto");
                       }*/
                        break;
                   case 5:
                       System.out.println("Codigo");
                       String codigo2 = sc.nextLine();
                       int conti = Integer.parseInt(sc.nextLine());
                       System.out.println("Cantidad");
                       try {
                           tienda.realizarCompra(codigo2,conti);
                       }catch (Tema6.PracticaDeClase.StockInsuficienteException e){
                           System.out.println(e.getMessage());
                       }
                        break;
                   case 6:
                        tienda.mostrarHistorialCompras();
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
