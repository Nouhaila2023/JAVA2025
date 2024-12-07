package Tema3.StringStringBuffer;

import java.util.Scanner;

public class Ejercicio5 {

    /*
     * Diseña un programa en Java que solicite al usuario una cadena de caracteres y
     * muestre por pantalla un
     * conteo de cuántas vocales, consonantes y espacios en blanco contiene la
     * cadena introducida.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char vocales[] = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };

        int contadorVocales = 0, contadorConsonantes = 0, contadorBlanco = 0;

        String texto;

        System.out.println("Dime tu texto:>");
        texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {

            char pocicion = texto.charAt(i);

            if (pocicion == vocales[i]) {
                contadorVocales++;
            } else if (pocicion == ' ') {
                contadorBlanco++;
            } else {
                contadorConsonantes++;
            }

        }

        System.out.println("Vovales: " + contadorVocales);
        System.out.println("Blanco: " + contadorBlanco);
        System.out.println("Consonantes: " + contadorConsonantes);
    }
}
