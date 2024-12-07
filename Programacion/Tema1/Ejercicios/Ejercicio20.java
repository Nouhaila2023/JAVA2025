package Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int a , b , d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Intrega el valor de a: ");
        a = sc.nextInt();
        System.out.println("Intrega el valor de b: ");
        b = sc.nextInt();
        System.out.println("Intrega el valor de d: ");
        d = sc.nextInt();

        double expresion1 , expresion2 , expresion3;

        expresion1 = (double) ((5 * Math.pow(a,2) * Math.pow(b,3)) + (Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)))));
        expresion2 = (double) (Math.sqrt(4*a*Math.pow(b,2)) + (Math.pow((a+b),2)));
        expresion3 = (double) ( ( (Math.pow(a,3) * b) / (2*a*Math.pow(b,2))) - (Math.sqrt(12*Math.pow(d,4))));

        System.out.println("1) " + expresion1);
        System.out.println("2) " + expresion2);
        System.out.println("3) " + expresion3);

    }
}
