package Tema3.Evaluacion;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //a. Primera letra al final: Mueve la primera letra
        // de cada palabra al final de la palabra

        System.out.println("Dime tu frace:");
        String frace = sc.nextLine();
        String palabra[] = frace.split(" ");

        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = palabra[i].substring(i) + palabra[i].charAt(0);
            System.out.println(palabra[i]);
        }

        System.out.println("---------------------------------------------");

        //b. Reemplazo de vocales: Reemplaza las vocales de la palabra con caracteres
        //especiales: a -> @, e -> &, i -> $, o -> º, u -> #


        StringBuffer sb = new StringBuffer(frace);
        for (int i = 0; i < frace.length(); i++) {
            frace = frace.replace('a' , '@');
            frace = frace.replace('e' , '&');
            frace = frace.replace('i' , '$');
            frace = frace.replace('o' , 'º');
            frace = frace.replace('u' , '#');
        }
        System.out.println(frace);


        //c. Invertir cada palabra: Si la longitud de la palabra es impar, invierte la palabra
        //resultante antes de añadirla al mensaje codificado.

        System.out.println("\n---------------------------------------------");


        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() % 2 != 0){
                System.out.println("La palabras impar es: " + palabra[i]);
            }
        }







    }
}
