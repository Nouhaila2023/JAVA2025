package Tema1.Ejercicio1.EstructurasAlternativas;

/*Ejercicio 10
Escribe un programa que resuelva una ecuación de segundo grado del tipo AX2 + BX + C1*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        int a,b,c;
        double X1, X2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega en a:");
        a = sc.nextInt();
        System.out.println("Intrega en b:");
        b = sc.nextInt();
        System.out.println("Intrega en c:");
        c = sc.nextInt();


        if (Math.pow(b,2) - 4 * a *c >= 0 && a != 0){
            X1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a *c) / 2 * a);
            X2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a *c) / 2 * a);
            System.out.println(X1 + "Y" + X2);
        }else {
            System.out.println("Eroor");
        }



    }
}
