package Tema2.EstructurasBasicasDeControl.EjerciciosBuclesCondicionales;

import java.util.Scanner;

public class Ejercicio15 {


    /* Programa que lea números hasta que le den el cero,
    y que diga cuál ha sido el mayor y cuál el menor de
los números introducidos (sin tener en cuenta el cero). */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        do {

            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();

            if (numero > max ) {
                max = numero;
            }
            if (numero < min && numero != 0 ) {
                min = numero;
            }


        }while (numero != 0);

        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);



    }
}
