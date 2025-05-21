package Tema7_3.examen2023;

import Tema7_3.examen2023.io.ReservasFile;
import Tema7_3.examen2023.services.Buking;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Buking buking = ReservasFile.loadCSV();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Listar hoteles");
            System.out.println("2. Añadir hotel");
            System.out.println("3. Eliminar hotel");
            System.out.println("4. Listar reservas");
            System.out.println("5. Añadir reserva");
            System.out.println("6. Eliminar reserva");
            System.out.println("7. Guardar y salir");
            System.out.println("8. Salir sin guardar");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Introduce un número.");
                continue;
            }

            switch (opcion) {
                case 1:
                    // Listar hoteles
                    buking.getHoteles().forEach(System.out::println);
                    break;
                case 2:
                    // Añadir hotel (deberías pedir los datos por consola)
                    // Aquí ejemplo simplificado:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    // Pide el resto de datos...
                    // Hotel hotel = new Hotel(...);
                    // buking.addHotel(hotel);
                    break;
                case 3:
                    // Eliminar hotel
                    System.out.print("ID del hotel a eliminar: ");
                    Long idHotel = Long.parseLong(sc.nextLine());
                    buking.deleteHotel(idHotel);
                    break;
                case 4:
                    // Listar reservas
                    buking.getReservas().forEach(System.out::println);
                    break;
                case 5:
                    // Añadir reserva (pide los datos necesarios)
                    break;
                case 6:
                    // Eliminar reserva
                    System.out.print("ID de la reserva a eliminar: ");
                    Long idReserva = Long.parseLong(sc.nextLine());
                    buking.deleteReserva(idReserva);
                    break;
                case 7:
                    // Guardar y salir
                    ReservasFile.saveCSV(buking);
                    System.out.println("Datos guardados. Saliendo...");
                    opcion = 8; // Para salir del bucle
                    break;
                case 8:
                    System.out.println("Saliendo sin guardar...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 8);

        sc.close();


    }
}
