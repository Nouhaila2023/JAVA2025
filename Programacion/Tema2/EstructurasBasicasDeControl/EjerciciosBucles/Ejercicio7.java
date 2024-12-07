package Tema2.EstructurasBasicasDeControl.EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio7 {
    /* Función que calcule el factorial de un número entero positivo pasado como parámetro.*/

    public static int Factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("El facturial del numero es: " + fact);

        return fact;

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Intrega el numero: ");
        int num = Integer.parseInt(sc.nextLine());

        Factorial(num);

        sc.close();
    }

}
