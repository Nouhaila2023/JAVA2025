package Tema3.StringStringBuffer;

import java.util.Scanner;

public class Ejercicio3 {

    /*
     * Diseña un programa en Java que solicite al usuario una cadena en la que
     * buscará y otra que será la
     * cadena buscada. El programa indicará cuántas veces aparece la segunda cadena
     * en la primera
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = "";
        String palabra = "";
        int contador = 0;
        int pocicion = 0;

        System.out.println("Dime le texto:>");
        texto = sc.nextLine();
        System.out.println("Dima la palaba que quieres saber cuantas veces hay en el texto:");
        palabra = sc.nextLine();

        while (pocicion >= 0) {
            pocicion = texto.indexOf(palabra, pocicion);
            if (pocicion == -1) {
                break;
            }
            pocicion++;
            contador++;
        }

        System.out.println("Parece la palabra " + palabra + " en el texto *" + contador + "* veces:>");

    }
}
