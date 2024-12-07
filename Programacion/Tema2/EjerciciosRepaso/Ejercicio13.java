package Tema2.EjerciciosRepaso;

/* Escribe un programa que lea un número N e imprima una pirámide de números con N filas como en la
siguiente figura:
    1
   121
  12321
 1234321

*/

public class Ejercicio13 {
    public static void main(String[] args) {


        for(int i = 1; i <= 4; i++) {

            // For para poner espacios
            for(int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // For para poner *
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // For para poner *
            for(int j = 1; j <= i-1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


    }
}
