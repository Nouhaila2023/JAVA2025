package Tema2.EstructurasBasicasDeControl.EjerciciosBuclesCondicionales;

import java.util.Scanner;

public class Ejercicio17 {

    /* Programa que lea un entero positivo introducido por el usuario y que muestre
    por pantalla todos sus divisores. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero = sc.nextInt();

        if (numero < 0){
            System.out.println("Numero invalido");
            return;
        }

        for (int i = numero - 1; i >= 1 ; i--) {

            if (numero % i == 0) {
                System.out.println("su division : "  + i );
            }

        }

        sc.close();

    }
}
