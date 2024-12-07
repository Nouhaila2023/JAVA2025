package Tema2.EjerciciosRepaso;

/* Realiza un programa que pida por teclado un número que será la base. Luego debe pedir otro número
que indique hasta qué exponente lo quieres elevar y muestra todas esas potencias. Ej. Introduces el 3 y
el 7, y debe mostrar*/

import java.util.Scanner;

public class Ejercico11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base , exponente;
        int resulta;

        System.out.println("Dime el base");
        base = Integer.parseInt(sc.nextLine());
        System.out.println("Dime exponente ");
        exponente = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= exponente ; i++) {

                resulta = (int) Math.pow(base,i);
                System.out.println(base + " elevado a " + i + " es: " + resulta);

        }

        sc.close();

    }
}
