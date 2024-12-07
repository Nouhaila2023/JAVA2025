package Tema2.EstructurasBasicasDeControl.EjerciciosBucles;

/*Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10.*/

import java.util.Scanner;

public class Ejercicio5 {

    public static void Numero(){

        Scanner sc = new Scanner(System.in);
        int numero;

        do {

            System.out.println("Intrega el numero:");
            numero = Integer.parseInt(sc.nextLine());
        }while (numero <= 1 || numero >= 10);

            System.out.println("Es corecto ");


    }


    public static void main(String[] args) {

        Numero();

    }
}
