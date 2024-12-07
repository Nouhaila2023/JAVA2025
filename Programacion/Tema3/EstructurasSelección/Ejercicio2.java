package Tema3.EstructurasSelección;

import java.util.Scanner;

public class Ejercicio2 {

    /*Realiza un programa que pida una hora por teclado y que muestre luego
buenos días, buenas tardes o buenas noches según la hora. Se utilizarán
los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se
tienen en cuenta las horas, los minutos no se deben introducir por
teclado.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String saludos[] = {"buenos días" , "buenas tardes" , "buenas noches"};

        int hora;

        System.out.println("Introduce la hora : ");
        hora = sc.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Introduce una hora válida entre 0 y 23.");
        } else if (hora >= 6 && hora <= 12) {
            System.out.println(saludos[0]);  // buenos días
        } else if (hora >= 13 && hora <= 20) {
            System.out.println(saludos[1]);  // buenas tardes
        } else {
            System.out.println(saludos[2]);  // buenas noches (for 21-23 and 0-5)
        }


        sc.close();

    }
}
