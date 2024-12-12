package Tema3.ClasesStringStringBuffer.StringStringBuffer;

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

        System.out.println("Dime el texto");
        String texto = sc.nextLine();
        System.out.println("Dime la plabra");
        String palabra = sc.nextLine();

        String represar = texto.replace(palabra, palabra.toUpperCase());
        System.out.println("Texto --> " + texto);
        System.out.println("Represar --> " + represar);

    }
}
