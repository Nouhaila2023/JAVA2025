package Tema3.StringStringBuffer;

import java.util.Scanner;

public class Ejercicio7 {

    /*
     * Cuenta las vocales del texto “Me gusta programar en Java los sábados por la
     * mañana”
     */

    public static void main(String[] args) {

        String texto = "Me gusta programar en Java los sábados por la mañana";
        System.out.println(texto.length());
        String vocales = "aAeEiIoOuU";
        char letra;
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);

            // != -1 Para contar (indesOf siempre da -1)
            if (-1 != vocales.indexOf(letra)) {
                contador++;
            }

        }

        System.out.println("Hay <<" + (contador) + ">> vocales en esta texto-> " + texto);


        //Otra manera

        int contador2 = 0;
        char caracteres;

        for (int i = 0; i < texto.length(); i++) {
            caracteres = texto.charAt(i);

            switch (caracteres){
                case 'a' ,'A' , 'e' , 'E' ,'i' , 'I' ,'o' ,'O' , 'u' , 'U':
                contador2++;
                break;
            }

        }

        System.out.println("Contador : " + contador2 );



    }
}
