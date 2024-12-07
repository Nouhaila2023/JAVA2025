package Tema2.EstructurasBasicasDeControl.EjerciciosBuclesCondicionales;

import java.util.Scanner;

public class Ejercicio14 {

    /* Programa que lea dos números positivos e imprima por pantalla todos los números
     pares que estén entre los dos números dados.
     También debe indicar cuántos números pares hay en ese intervalo.*/


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int contador = 0;
        int temp;

        if (num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }

        for (int i = num1; i <= num2 ; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                contador++;
            }

        }

        System.out.println("Hay *" + contador + "* numeros pares entre los dos numeros.");



    }
}
