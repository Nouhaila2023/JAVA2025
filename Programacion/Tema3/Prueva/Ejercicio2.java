package Tema3.Prueva;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*Pide 5 numeros double por teclado
        * Guardalos en una array
        * Pinta el array enteros*/


        Scanner sc = new Scanner(System.in);

        double numero[] = new double[5];

        //Lo leer por teclado y guardarlo
        for (int i = 0; i < numero.length ; i++) {
            System.out.println("Dime tu numero:");
            numero[i] = Double.parseDouble(sc.nextLine());
        }

        //Pintar
        for (int i = 0; i < numero.length; i++) {
            System.out.println("El numero es: " + numero[i]);
        }



    }
}
