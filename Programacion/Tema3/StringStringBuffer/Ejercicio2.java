package Tema3.StringStringBuffer;

import java.util.Scanner;

public class Ejercicio2 {
    /*
     * . Crea un programa que reciba una cadena de caracteres y la devuelva
     * invertida con efecto espejo, este
     * es, se concatena a la palabra original su inversa, compartiendo la última
     * letra, que hará de espejo, por
     * lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por
     * ejemplo, al introducir
     * “teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá
     * “holaloh”. Haz dos versiones, una
     * con String y otra con StringBuffer.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = "";
        String copia = "";

        try {
            System.out.println("Dime tu texto:");
            texto = sc.nextLine();

        } catch (Exception e) {
            System.out.println("Error:)");
        }

        // String
        System.out.println("\n-----Con String-----");
        System.out.print(texto);
        for (int i = texto.length() - 2; i >= 0; i--) {
            System.out.print(texto.charAt(i));

        }

        System.out.println("\n-------Otra manera-------");

        for (int i = texto.length() - 2; i >= 0; i--) {
            copia += texto.charAt(i);
        }

        System.out.print(texto + copia);

        System.out.println("\n-----Con StringBuffer-----");

        StringBuffer sb = new StringBuffer(texto);
        sb.deleteCharAt(sb.length() - 1);
        sb.reverse();
        System.out.println(texto + sb);

    }

}
