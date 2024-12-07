package Prueva;

import java.util.Scanner;

public class EjercicoSuma {
    public static void main(String[] args) {

        int num1 , num2 , suma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Dame el segundo numero: ");
        num2 = sc.nextInt();

        suma = num1 + num2;

        System.out.println("La suma de los dos numero es: " + num1 + "+" + num2 + "="+ suma);

        int num3 = 2147483647;

        System.out.println("num3 = " + num3);
        System.out.println("tipo Integer corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo Integer corresponde en byte a " + Integer.SIZE);
        System.out.println("valor maxion de un Integer: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un Integer: " + Integer.MIN_VALUE);



        sc.close();

    }
}
