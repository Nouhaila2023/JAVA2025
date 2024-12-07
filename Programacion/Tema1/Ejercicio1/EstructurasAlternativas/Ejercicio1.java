package Tema1.Ejercicio1.EstructurasAlternativas;

import java.util.Scanner;

/**Algoritmo que pida dos números e indique si el
 primero es mayor que el segundo o no. **/

public class Ejercicio1 {
    public static void main(String[] args) {

        int num1 ,num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        num1 = sc.nextInt();
        System.out.println("Ingresa un numero entero: ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("El numero 1 es el mayor: " + num1 + ">" + num2 );
        }

        if(num1 < num2){
            System.out.println("El numero 2 es el mayor: " + num2 + ">" + num1 );
        }


    }
}
