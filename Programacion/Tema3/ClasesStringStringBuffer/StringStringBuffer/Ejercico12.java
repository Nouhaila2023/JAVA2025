package Tema3.ClasesStringStringBuffer.StringStringBuffer;

import java.util.Scanner;

public class Ejercico12 {

    public static String mitadCadena(String cadena) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu texto:)");
        cadena = sc.nextLine();

        int longitudCadena = cadena.length();
        int mitadCadena = longitudCadena / 2;

        return cadena.substring(0, mitadCadena);
    }

    /**
     * Escribe un método que te devuelva la mitad de una cadena.
     */

    public static void main(String[] args) {

        String cadena = "";
        String metodoCadena = mitadCadena(cadena);
        System.out.println(metodoCadena);

    }
}
