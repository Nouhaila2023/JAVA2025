package Tema5.Ejercicio;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Equipo equipo = new Equipo("Equipo1" , "España");

        int opcion;

        do {
            System.out.println("++++++++++++++++Menú++++++++++++++++++");
            System.out.println("1. Imprimir datos del equipo.");
            System.out.println("2. Añadir un ciclista al equipo");
            System.out.println("3. Calcular el total de tiempos de los ciclistas del equipo");
            System.out.println("4. Listar nombres de los ciclistas");
            System.out.println("5. Buscar ciclista");
            System.out.println("6. Salir");

            opcion = Integer.parseInt(sc.nextLine());

            switch(opcion){
                case 1:
                    System.out.println(equipo);
                    break;
                case 2:
                    System.out.println("Intrega el id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Intrega el nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Intrega el tiempo (1= Velocista, 2= Escalador, 3= Contrarrelojista)");
                    int tiempo = Integer.parseInt(sc.nextLine());
                    Ciclista ciclista = null;
                    if (tiempo == 1){
                        System.out.println("Intrega la potencia");
                        int potencia = Integer.parseInt(sc.nextLine());
                        System.out.println("Intrega el velocidad");
                        int velocidad = Integer.parseInt(sc.nextLine());
                        ciclista = new Velocista(id, nombre, tiempo, potencia, velocidad);
                    }else if (tiempo == 2){
                        System.out.println("Ingrese aceleración");
                        float aceleracion = sc.nextFloat();
                        System.out.println("Ingrese grado de rampa");
                        float grado = sc.nextFloat();
                        ciclista = new Escalador(id, nombre, tiempo, aceleracion, grado);
                    }else {
                        System.out.println("Intrega la velocidad");
                        double velocidad = sc.nextDouble();
                        ciclista = new Contrarrelojista(id, nombre, tiempo, velocidad);
                    }
                    if (ciclista != null){
                        equipo.addCiclista(ciclista);
                        System.out.println("Ciclista agregada al equipo");
                    }
                    break;
                case 3:
                    System.out.println(equipo.totalTiempo());
                    break;
                case 4:
                    equipo.listarNombre();
                    break;
                case 5:
                    System.out.println("Intrega el id del ciclista");
                    int ide = Integer.parseInt(sc.nextLine());
                    equipo.byscarCiclista(ide);
                    break;
                case 6:
                    System.out.println("Salir....");
                    sc.close();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion != 6);
    }
}
