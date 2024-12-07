package Tema3.Prueva;

import java.util.Scanner;

public class Ejercicio5StringOtraManera {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cadena de vocales (mayúsculas y minúsculas)
        String vocales = "aeiouAEIOU";

        int contadorVocales = 0, contadorConsonantes = 0, contadorBlanco = 0;

        System.out.println("Dime tu texto:");
        String texto = sc.nextLine();

        // Recorremos cada carácter del texto
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i); // Obtenemos el carácter en la posición i

            // Verificamos si el carácter es una vocal
            if (vocales.indexOf(c) != -1) {
                contadorVocales++;
            }
            // Verificamos si es un espacio en blanco
            else if (c == ' ') {
                contadorBlanco++;
            }
            // Si es una consonante
            else if (Character.isLetter(c)) {
                contadorConsonantes++;
            }
        }

        // Mostrar los resultados
        System.out.println("Vocales: " + contadorVocales);
        System.out.println("Espacios en blanco: " + contadorBlanco);
        System.out.println("Consonantes: " + contadorConsonantes);

        sc.close();
    }

}
