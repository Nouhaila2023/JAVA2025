package Tema3.ClasesStringStringBuffer;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5 {

    /*
     * Diseña un programa en Java que solicite al usuario
     * una cadena de caracteres y muestre por pantalla un
     * conteo de cuántas vocales, consonantes y espacios en
     * blanco contiene la cadena introducida.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contadorV1 = 0, contadorC1 = 0, contadorB1 = 0;
        int contadorV2 = 0, contadorC2 = 0, contadorB2 = 0;

        System.out.println("Dime el texto");
        String texto = sc.nextLine();

        char vocales[] = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };
        Arrays.sort(vocales);

        char caracteres1;

        for (int i = 0; i < texto.length(); i++) {
            caracteres1 = texto.charAt(i);

            // Manera 1:
            switch (caracteres1) {
                case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                    contadorV1++;
                    break;
                case ' ':
                    contadorB1++;

                default:
                    break;
            }

        }

        contadorC1 = texto.length() - (contadorB1 + contadorV1);
        System.out.println("Manera 1:");
        System.out.println("Vocales " + contadorV1);
        System.out.println("Espacio " + contadorB1);
        System.out.println("Consonantes " + contadorC1);

        char caracteres2;
        for (int i = 0; i < texto.length(); i++) {
            caracteres2 = texto.charAt(i);
            // Manera 2:

            if (caracteres2 == ' ') {
                contadorB2++;
            } else if (Arrays.binarySearch(vocales, caracteres2) >= 0) {
                contadorV2++;
            } else {
                contadorC2++;
            }
        }

        System.out.println("Manera 2:");
        System.out.println("Vocales " + contadorV2);
        System.out.println("Espacio " + contadorB2);
        System.out.println("Consonantes " + contadorC2);

    }
}
