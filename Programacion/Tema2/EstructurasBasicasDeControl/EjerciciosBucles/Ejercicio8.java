package Tema2.EstructurasBasicasDeControl.EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio8 {
 /*Programa que imprima la tabla de multiplicar de cualquier
 número entre el 1 y el 10 introducido por teclado. */

    public static int Tabla(int numero){

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + " x " + numero + " = " + (numero * i));

        }

        return numero;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(sc.nextLine());

        }while (numero < 1 || numero > 10);

        Tabla(numero);

        sc.close();
    }


}
