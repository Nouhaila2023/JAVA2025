package Tema3.StringStringBuffer;

import java.util.Scanner;

public class Ejercicio4 {

    /*
     * Crea un programa en Java que solicite al usuario dos cadenas de caracteres y
     * que devuelva la primera
     * cadena, pero transformando en mayúsculas la parte que coincide con la segunda
     * cadena introducida.
     * Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” y “amiga”
     * devolverá “Esta es mi
     * AMIGA Ana”.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = "";
        String palabra = "";

        System.out.println("Dime le texto:>");
        texto = sc.nextLine();
        System.out.println("Dima la palaba que quieres saber cuantas veces hay en el texto:");
        palabra = sc.nextLine();

        // toUpperCase() y replacr

        String reprasar = texto.replace(palabra, palabra.toUpperCase());

        System.out.println(reprasar);

        sc.close();

    }
}