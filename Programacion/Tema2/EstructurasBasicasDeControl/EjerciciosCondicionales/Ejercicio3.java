package Tema2.EstructurasBasicasDeControl.EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio3 {

    public static int Numero(int numero){

        switch (numero){
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Sies");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            default:
                System.out.println("Error");


        }

        return numero;
    }


    public static void main(String[] args) {

        /*Programa que lea un número positivo de un dígito por teclado y diga en letra a qué dígito corresponde
(uno, dos, tres, cuatro, …). Ejemplo: si se introduce el 1, se mostrará por pantalla el “uno”; si se introduce
el 11, se mostrará el mensaje “Error: no es un número de un dígito”*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega el numero:");
        int numero = sc.nextInt();

        System.out.println(Numero(numero));

        //Otra manera para practicar:

        if (numero == 1){
            System.out.println("Uno");
        } else if (numero == 2) {
            System.out.println("Dos");
        } else if (numero == 3) {
            System.out.println("Tres");
        } else if (numero == 4) {
        System.out.println("Cuatro");
        } else if (numero == 5) {
            System.out.println("Cinco");
        } else if (numero == 6) {
            System.out.println("Seis");
        } else if (numero == 7) {
            System.out.println("Siete");
        } else if (numero == 8) {
            System.out.println("Ocho");
        } else if (numero == 9) {
            System.out.println("Nueve");
        }else {
            System.out.println("Error: no es un número de un dígito");
        }

    }
}
