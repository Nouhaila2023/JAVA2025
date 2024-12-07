package Tema1.Ejercicio1.EstructurasSecuenciales;

/*
* Pide al usuario dos pares de números (x1,y1) y (x2,y2),
* que representen dos puntos en el
plano. Calcula y muestra la distancia entre ellos.*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        int x1 ,y1 , x2, y2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Intrega el x1: ");
        x1 = sc.nextInt();
        System.out.println("Intrega el y1: ");
        y1 = sc.nextInt();
        System.out.println("Intrega el x2: ");
        x2 = sc.nextInt();
        System.out.println("Intrega el y2: ");
        y2 = sc.nextInt();

        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println( "La nota final es: " + String.format("%.2f",d));





    }
}
