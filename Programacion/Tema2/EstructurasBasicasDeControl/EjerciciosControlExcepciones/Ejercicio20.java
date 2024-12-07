package Tema2.EstructurasBasicasDeControl.EjerciciosControlExcepciones;

import java.util.Scanner;

public class Ejercicio20 {

/*20. Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros.
Mostrar la media de los N números introducidos, el mayor y el menor. */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 0;
        int numero = 0;
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;


        try {
            System.out.println("Ingrese el N numero: ");
            N = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
        }


        for (int i = 0; i < N; i++) {

            System.out.println("Ingrese el numero: ");
            numero = sc.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            if (numero > mayor) {
                mayor = numero;
            }

            suma += numero;

        }

        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);

        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + (suma/N));

        sc.close();

    }
}
