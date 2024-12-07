package Ejercicios_Udemy.Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMaor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;

        System.out.println("Ingrese el premer numero:");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el segundo numero:");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el tercer numero:");
        int num3 = Integer.parseInt(sc.nextLine());

        max = (num1 > num2)? num1 : num2;
        max = (num1 > num3) ? max : num3;

        System.out.println( num1 + " - " + num2 + " - " + num3  + "\nEL mayor numero es: " + max);


    }
}
