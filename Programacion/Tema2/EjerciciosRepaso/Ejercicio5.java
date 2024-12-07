package Tema2.EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        /*Realiza una función que calcule el máximo de tres números. Pruébala.*/

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int calculadora = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Dime el numero:");
            num = sc.nextInt();
            calculadora += num;
        }



        System.out.println("El calculo de tres numeros es: " + calculadora);




    }
}
