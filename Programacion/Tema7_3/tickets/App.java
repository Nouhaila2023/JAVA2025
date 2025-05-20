package Tema7_3.tickets;

import Tema7_3.tickets.io.DaOTicketSoporte;
import Tema7_3.tickets.services.ServicioSoporte;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2024");



        ServicioSoporte ss = DaOTicketSoporte.loadCSV();

        //ss.getTickets().forEach(System.out::println);
        //ss.removeTecnico(2L);

        //Menú
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("1. Ver tickets abiertos");
            System.out.println("2. Ver tecnicos por especialidad");
            System.out.println("3. Ver total de tickets resueltos");
            System.out.println("4. Ver media de resolucion de tickets");
            System.out.println("5. Crear nuevo ticket");
            System.out.println("6. Eliminar ticket");
            System.out.println("7. Guardar y salir");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    ss.getTicketsAbiertos().forEach(System.out::println);
                    break;
                case 2:
                    ss.getTecnicosGroupByEspecialidad()
                            .forEach((k,v) -> System.out.println(k + " " + v));
                    break;
                case 3:
                    System.out.println(ss.getTotalTicketsResueltos(1));
                    break;
                case 4:
                    Integer prioridad = Integer.parseInt(sc.nextLine());
                    System.out.println(ss.getMediaResolucionTickets(prioridad));
                    break;
                case 5:
                    //Pedir información y crear el ticket
                    break;
                case 6:
                    Integer idTicket = Integer.parseInt(sc.nextLine());
                    ss.deleteTicketSoporte(idTicket);
                    break;
                case 7:
                    DaOTicketSoporte.saveCSV(ss);
                    break;
            }

        } while(opcion != 7);

    }
}
