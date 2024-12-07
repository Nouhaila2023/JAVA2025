package Tema1.Ejercicio1.EstructurasSecuenciales;

import java.util.Scanner;
//Ejercicio 3
//Dados dos números,
// mostrar la suma, resta, división y multiplicación de ambos
public class Ejercicio3 {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("El numero1 es :");
        num1 = sc.nextInt();

        System.out.println("El numero2 es :" );
        num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        double division = num1 / num2;
        double multiplicacion = num1 * num2;

        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta de los dos numeros es: " + resta);
        System.out.println("La division de los dos numeros es: " + division);
        System.out.println("La multiplicacion de los dos numeros es: " + multiplicacion);


    }
}
