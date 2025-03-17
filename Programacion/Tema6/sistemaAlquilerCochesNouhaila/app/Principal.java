package Tema6.sistemaAlquilerCochesNouhaila.app;

import Tema6.sistemaAlquilerCochesNouhaila.entidades.Cliente;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.CocheEstandar;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.CochePremium;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCoche;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCombustible;
import Tema6.sistemaAlquilerCochesNouhaila.servicios.Agencia;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            Agencia agencia = new Agencia();

            for (int i = 0; i < 4; i++) {
                agencia.addCoche(new CocheEstandar(1L, "marca1", "modelo1", "1", 2001,
                        TipoCombustible.ELECTRICO, TipoCoche.DEPORTIVO, 100.0,true));
            }
            for (int i = 0; i < 6; i++) {
                agencia.addCoche(new CocheEstandar(3L, "marca3", "modelo3", "3", 2003,
                        TipoCombustible.ELECTRICO, TipoCoche.DEPORTIVO, 100.0,false));
            }

            for (int i = 0; i < 5; i++) {
                agencia.addCoche(new CochePremium(2L, "marca2", "modelo2", "2", 2002,
                        TipoCombustible.ELECTRICO, TipoCoche.DEPORTIVO, 100.0, true, true));
            }

            for (int i = 0; i < 5; i++) {
                agencia.addCoche(new CochePremium(4L, "marca4", "modelo4", "4", 2004,
                        TipoCombustible.ELECTRICO, TipoCoche.DEPORTIVO, 100.0, false, false));
            }

            /**
             * Crear el menu
             */
            System.out.println("\n--- Menú de la Alquiler Coches ---");
            System.out.println("1. Listar Coches Disponibles");
            System.out.println("2. Listar Alquileres Activos");
            System.out.println("3. Realizar Alquiler");
            System.out.println("4. Mostrar Ingresos");
            System.out.println("5. Salir");
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
                    agencia.listarCochesDesponibles();
                    break;

                case 2:
                   agencia.listarAlquileresActuales();
                    break;

                case 3:
                    try {
                        System.out.println("Entrega tatos del cliente:)");
                        System.out.println("Nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Apellidos");
                        String apellidos = sc.nextLine();
                        System.out.println("DNI");
                        String dni = sc.nextLine();
                        System.out.println("Email");
                        String email = sc.nextLine();
                        System.out.println("Direccion");
                        String direccoin = sc.nextLine();
                        System.out.println("Telefono");
                        String telefono = sc.nextLine();
                        System.out.println("Licencia de Conducir");
                        String licencia = sc.nextLine();
                        System.out.println("Fecha obtencion licencia");
                        LocalDate fecha = LocalDate.parse(sc.nextLine());
                        System.out.println("Coche---------------------------");
                        System.out.println("Que tipo de coche quieres");
                        String tipoCoche = String.valueOf(TipoCoche.valueOf(sc.nextLine()));
                        System.out.println("Fechas--------------------------");
                        System.out.println("Fecha Inicia");
                        LocalDate fechaIni = LocalDate.parse(sc.nextLine());
                        System.out.println("Fecha Final");
                        LocalDate fechaFin = LocalDate.parse(sc.nextLine());
                        Cliente cliente = new Cliente(nombre, apellidos, dni, email, direccoin, telefono,licencia, fecha);

                        agencia.relalizarAlquiler(cliente, TipoCoche.valueOf(tipoCoche), fechaIni, fechaFin);

                    } catch (Exception e) {
                        System.out.println("Error");
                    }

                    break;
                case 4:
                    agencia.mostrarIngreso();
                    break;

                case 5:
                    System.out.println("¡Tienda de Alquiler Coches Cerrada!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 5);

        //serar sc
        sc.close();
    }
}
