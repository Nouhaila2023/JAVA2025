package Tema3.ArraysMatrices.Matrices;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        /*. Crear una tabla bidimensional de tamaño 3x4 de números enteros (leídos desde teclado).
         Mostrar la matriz y la suma de los valores de cada fila.*/

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma ;

        int tabla[][] = new int[3][4];
        System.out.println("Introduzca un numero");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                numero = sc.nextInt();
                tabla[i][j] = numero;
            }
        }

        System.out.println("\nMostrar la tabla ");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < tabla.length; i++) {
            suma = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                suma += tabla[i][j];
            }
            System.out.print("\nLa suma de cada fila " + (i+1) + ": " + suma);
        }


        sc.close();

    }
}
