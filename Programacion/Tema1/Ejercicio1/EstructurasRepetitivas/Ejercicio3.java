package Tema1.Ejercicio1.EstructurasRepetitivas;
import java.util.Scanner;

/*Ejercicio 3
Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
contrario, el programa termina cuando se introduce un espacio. */

public class Ejercicio3 {
    public static void main(String[] args) {

        char caracter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Imprima el vocal");
        caracter = sc.nextLine().toLowerCase().charAt(0);


         if (caracter == 'a'
                 || caracter == 'b'
                 || caracter == 'c'
                 || caracter == 'd'
                 || caracter == 'e'
                 || caracter == 'f'
                 || caracter == 'g'
                 || caracter == 'h'
                 || caracter == 'i'
                 || caracter == 'j'
                 || caracter == 'k'
                 || caracter == 'l'
                 || caracter == 'm'
                 || caracter == 'n'
                 || caracter == 'o'
                 || caracter == 'p'
                 || caracter == 'q'
                 || caracter == 'r'
                 || caracter == 's'
                 || caracter == 't'
                 || caracter == 'u'
                 || caracter == 'v'
                 || caracter == 'w'
                 || caracter == 'x'
                 || caracter == 'y'
                 || caracter == 'z'){
        System.out.println("VOCAL");
         } else if (caracter != ' ') {
             System.out.println("NO VOCAL");
         }else {
             System.out.println("NO VOCAL");
         }


    }
}
