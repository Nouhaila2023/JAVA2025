package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio 6
Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la
semana (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá
por las horas trabajadas.*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {


        int dia1, dia2, dia3, dia4, dia5, dia6;
        int totas_hora;
        int presio;
        int sueldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas por día:");

        System.out.print("Día 1: ");
        dia1 = sc.nextInt();

        System.out.print("Día 2: ");
        dia2 = sc.nextInt();

        System.out.print("Día 3: ");
        dia3 = sc.nextInt();

        System.out.print("Día 4: ");
        dia4 = sc.nextInt();

        System.out.print("Día 5: ");
        dia5 = sc.nextInt();

        System.out.print("Día 6: ");
        dia6 = sc.nextInt();

        System.out.println("Intrega el precio:");
        presio = sc.nextInt();

        totas_hora = dia1 + dia2 + dia3 + dia4 + dia5 + dia6;
        System.out.println("El total del horas: " + totas_hora);

        sueldo = totas_hora * presio;

        System.out.println("El sueldo de una semana es: " + sueldo);

        sc.close();

    }
}
