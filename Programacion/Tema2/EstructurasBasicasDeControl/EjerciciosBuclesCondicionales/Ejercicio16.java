package Tema2.EstructurasBasicasDeControl.EjerciciosBuclesCondicionales;

import java.util.Scanner;

public class Ejercicio16 {

    /* Programa que lea por teclado una serie de números enteros hasta que introduzca el
     -1 y obtenga su media. Deberá mostrarla por pantalla.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int media;
        int suma = 0;
        int contador = 0;

        do {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(sc.nextLine());

            if (numero != (-1)){
                suma += numero;
                contador++;
            }

        }while (numero != (-1));

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("Le contador es: " + contador);

        media = suma / contador;

        System.out.println("La media de los numeros es: " + media);

        sc.close();

    }
}
