package Tema3.EstructurasSelección;

import java.util.Scanner;

public class Ejercicio1 {

    /*Escribe un programa que pida por teclado un día de la semana y que
imprima por pantalla qué asignatura toca a primera hora ese día*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dias[] = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        System.out.println("¿Qué día es?");
        String diaIngresado = sc.nextLine().toLowerCase();

        if (dias[0].equals(diaIngresado)) {
            System.out.println("El día es " + dias[0] + ": Primera hora - Asignatura A");
        } else if (dias[1].equals(diaIngresado)) {
            System.out.println("El día es " + dias[1] + ": Primera hora - Asignatura B");
        } else if (dias[2].equals(diaIngresado)) {
            System.out.println("El día es " + dias[2] + ": Primera hora - Asignatura C");
        } else if (dias[3].equals(diaIngresado)) {
            System.out.println("El día es " + dias[3] + ": Primera hora - Asignatura D");
        } else if (dias[4].equals(diaIngresado)) {
            System.out.println("El día es " + dias[4] + ": Primera hora - Asignatura E");
        } else if (dias[5].equals(diaIngresado)) {
            System.out.println("El día es " + dias[5] + ": Primera hora - Educación Física");
        } else if (dias[6].equals(diaIngresado)) {
            System.out.println("El día es " + dias[6] + ": No hay clases hoy");
        } else {
            System.out.println("Día no válido. Por favor, introduce un día de la semana correcto.");
        }

        sc.close();


    }
}
