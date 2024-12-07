package Tema3.ClasesStringStringBuffer;

import java.util.Scanner;

public class Ejercicio1 {

    /*Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y
devuelva esta cadena invertida. Haz dos versiones, una con String y otra con StringBuffer*/


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu texto:");
        String texto = sc.nextLine();

        //Opcion StringBuffer
        StringBuffer sb = new StringBuffer(texto);
        System.out.println(sb.reverse());


        //Opción String
        for(int i=texto.length()-1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }


    }
}
