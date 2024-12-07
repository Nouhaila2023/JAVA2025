package Tema3.StringStringBuffer;

import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Crea un programa en Java que solicite al usuario la introducción de una
     * cadena de caracteres y
     * devuelva esta cadena invertida. Haz dos versiones, una con String y otra con
     * StringBuffer.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadrna = "";

        try {
            System.out.println("Dime un palabra");
            cadrna = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error");
        }

        // Stirng
        for (int i = cadrna.length() - 1; i >= 0; i--) {
            System.out.print(cadrna.charAt(i));
        }

        System.out.println();
        // StringBuffer
        StringBuffer sb = new StringBuffer(cadrna);
        System.out.println(sb.reverse());

    }
}