package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio 2
    Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
    introducir). El programa debe informar de cuantos números introducidos son mayores que
    0, menores que 0 e iguales a 0.*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero > 0){
            System.out.println("El numero mayor que 0: " );
        } else if (numero < 0) {
            System.out.println("El numero menor que 0: " );
        }else {
            System.out.println("El numero iguan que 0: " );
        }

    }
}
