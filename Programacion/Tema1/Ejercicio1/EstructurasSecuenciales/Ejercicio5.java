package Tema1.Ejercicio1.EstructurasSecuenciales;

import java.util.Scanner;

//Ejercicio 5
//Calcular la media de tres números pedidos por teclado
public class Ejercicio5 {
    public static void main(String[] args) {

        double num1;
        double num2;
        double num3;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.println("El premir numero es: ");
        num1 = sc.nextDouble();
        System.out.println("El segundo numero es: ");
        num2 = sc.nextDouble();
        System.out.println("El tercer numero es: ");
        num3 = sc.nextDouble();

        media = (num1+num2+num3)/3;

        System.out.println("La media es: " + media);

    }
}
