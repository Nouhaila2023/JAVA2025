package Tema2.EstructurasBasicasDeControl.EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio11 {

    /*Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
número de líneas, que se pida por teclado.
   *
  **
 ***
*****
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega el numero:");
        int numero = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numero ; i++) {

            for (int j = 1; j <= i ; j++) {

                for (int k = 1; k >= i; k--) {
                    System.out.print(" ");
                }

                System.out.print("*");

            }

            System.out.println();
        }



    }
}
