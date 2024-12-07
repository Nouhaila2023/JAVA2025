package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio 4
Escribir un programa que imprima todos los números pares entre dos números que se le
pidan al usuario.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int numeroMax, numeroMin;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el mayor numero: ");
        numeroMax = sc.nextInt();
        System.out.print("Ingrese el menor numero: ");
        numeroMin = sc.nextInt();


        for (int i = numeroMin; i < numeroMax; i++) {
            if (i % 2 == 0) {
                System.out.println("EL numeros pares es: " + i);
            }
        }




    }
}
