package Tema2.EjerciciosRepaso;

/*Realiza un programa que vaya pidiendo números enteros mientras no introduzcas el -1. Como resultado
debe devolver la cantidad de números introducidos y la suma de esos números*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int suma = 0;
        int cantidad = 0;
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero negaticvo: ");
        numero = sc.nextInt();

        for (int i = numero; i <= 5 ; i++) {

            if (i == (-1)){
                continue;
            }
            System.out.println(i);
            cantidad++;
            suma += i;

        }

        System.out.println("La suma--> " + suma);
        System.out.println("La cantidad--> " + cantidad);

    }
}
