package Tema2.Prueva;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //Calcular el facturial de un numeor. que es el prodocto de todos los numeros anteriores a el hasta el 1
        //EX: Factorial = 5:  5*4*3*2*1

        Scanner sc = new Scanner(System.in);

        int factorial;
        long total = 1;

        System.out.println("Dime el factorial:");
        factorial = sc.nextInt();

        for (int i = factorial; i >= 2 ; i--) {
            total *= i;
        }

        System.out.println("Le factorial es: " + total);


    }
}
