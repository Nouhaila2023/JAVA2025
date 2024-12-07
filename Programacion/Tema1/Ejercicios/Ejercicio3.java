package Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int a , b ,c ,d ,e ,f ,g;

        Scanner sc = new Scanner(System.in);

        System.out.println("intrego un numero pir el a: ");
        a = sc.nextInt();
        System.out.println("a. " + (a>2));

        System.out.println("intrego un numero pir el b: ");
        b = sc.nextInt();
        System.out.println("b. " + ((b<=25) && (b>5)));

        System.out.println("intrego un numero pir el c: ");
        c = sc.nextInt();
        System.out.println("intrego un numero pir el d: ");
        d = sc.nextInt();
        System.out.println("c. " + (c>6 || c ==d));

        System.out.println("intrego un numero pir el d: ");
        e = sc.nextInt();
        System.out.println("d. " + ((e % 2 == 0) && (e >= 50)));

        System.out.println("intrego un numero pir el e: ");
        f = sc.nextInt();
        System.out.println("e. " + (f>a && f>d && f>e));

        System.out.println("intrego un numero pir el f: ");
        g = sc.nextInt();
        System.out.println("f. " + (g == 3 || g == 4 || g == 5));



    }
}
