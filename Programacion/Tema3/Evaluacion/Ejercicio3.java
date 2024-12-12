package Tema3.Evaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //a. Primera letra al final: Mueve la primera letra
        // de cada palabra al final de la palabra

        System.out.println("Dime la frace para el parte A:");
        String fraceA = sc.nextLine();
        String palabraA[] = fraceA.split(" ");

        for (int i = 0; i < palabraA.length; i++) {
            palabraA[i] = palabraA[i].substring(i) + palabraA[i].charAt(0);
            System.out.println(palabraA[i]);
        }


        //b. Reemplazo de vocales: Reemplaza las vocales de la palabra con caracteres
        //especiales: a -> @, e -> &, i -> $, o -> º, u -> #

        String fraceb[] = new String[1];
        System.out.println("Dime la frace para el parte B");
        for (int i = 0; i < fraceb.length; i++) {
            fraceb[i] = sc.nextLine().toLowerCase();
            for (int j = 0; j < fraceb[i].length(); j++) {
                char caracteres = fraceb[i].charAt(j);
                if (caracteres == 'a'){
                    System.out.print("@");
                } else if (caracteres == 'e') {
                    System.out.print("&");
                } else if (caracteres == 'i') {
                    System.out.print("$");
                } else if (caracteres == 'o') {
                    System.out.print("º");
                } else if (caracteres == 'u') {
                    System.out.print("#");
                } else {
                    System.out.print(caracteres);
                }
            }
        }


        //c. Invertir cada palabra: Si la longitud de la palabra es impar, invierte la palabra
        //resultante antes de añadirla al mensaje codificado.

        System.out.println("\nDima la frace para el parte C");
        String fracec = sc.nextLine();

        String palabra[] = fracec.split(" ");

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() % 2 != 0){
                System.out.println("La palabras impar es: " + palabra[i]);
            }
        }







    }
}
