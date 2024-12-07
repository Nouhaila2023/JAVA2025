package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio 12
Realizar un programa que pida el número de filas a mostrar y comience por la mayor fila
mostrando tantos asteriscos como la fila actual hasta llegar a cero*/

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFilas;
        System.out.println("Dime el numero de filas: ");
        numeroFilas = sc.nextInt();

        for (int i = numeroFilas; i >= 1 ; i--) { //-----

            for (int j = 1; j <= i; j++) { // ||||
                System.out.print("*");  // Imprime un asterisco
            }

            System.out.println();
        }

        sc.close();

    }
}
