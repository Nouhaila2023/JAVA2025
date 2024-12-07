package Tema1.Ejercicio1.EstructurasSecuenciales;

import java.util.Scanner;

/**
*  Realizar un algoritmo que lea un número y que muestre su raíz
*  cuadrada y su raíz cúbica.
*  PSeInt no tiene ninguna función predefinida que permita
*  calcular la raíz cúbica, ¿Cómo se
*  puede calcular?
**/

public class Ejercicio10 {

    public static void main(String[] args) {


        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        //raíz cuadrada
        System.out.println("El raíz cuadrada es: " + Math.sqrt(num));
        //Raiz cúbica
        System.out.println("El raíz cuadrada es: " + Math.pow(num, 1.0/3.0));









    }
}
