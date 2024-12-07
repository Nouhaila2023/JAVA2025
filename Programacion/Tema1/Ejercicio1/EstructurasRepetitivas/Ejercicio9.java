package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio 9
Realizar un ejemplo de menú, donde podemos escoger las distintas opciones (Opción A,
Opción B, Salir) hasta que seleccionamos la opción de “Salir”*/

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        System.out.println("Dime tu opcion:");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Opcion A");
                break;
            case 2:
                System.out.println("Opcion B");
                break;
            default:
                System.out.println("Salir");
        }

    }

}
