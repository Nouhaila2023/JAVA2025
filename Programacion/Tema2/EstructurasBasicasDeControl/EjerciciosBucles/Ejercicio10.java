package Tema2.EstructurasBasicasDeControl.EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio10 {
/* Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
número de líneas, que se pida por teclado.
*
**
***
****
*/


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Intrega el numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int filas = sc.nextInt(); // Leer el número de filas desde el teclado

        for (int i = 1; i <= filas; i++) {
            // Imprimir asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }

        sc.close();

    }
}
