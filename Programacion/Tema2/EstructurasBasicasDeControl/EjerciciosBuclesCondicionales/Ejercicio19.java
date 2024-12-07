package Tema2.EstructurasBasicasDeControl.EjerciciosBuclesCondicionales;

import java.util.Scanner;

public class Ejercicio19 {

    public static boolean Primo(int n) {

        if (n <= 1){
            return false;
        }

        if (n == 2){
            return true;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;

    }

/*Programa que, dado un número entero positivo introducido por teclado, visualice por pantalla
todos los números primos menores que él. Utiliza la función del ejercicio anterior. Ejemplo:

Dime un número: 15
> Los primos menores de 15 son: 1,2,3,5,7,11,13*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero = sc.nextInt();

        for (int i = numero; i >= 1 ; i--) {

            if (Primo(i)){
                System.out.println(i);
            }

        }


    }
}
