package Tema1.Ejercicio1.EstructurasAlternativas;

import java.util.Scanner;

/**
 * Ejercicio 4
 * Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el
 * exponente. Pueden ocurrir tres cosas:
 * El exponente sea positivo, solo tienes que imprimir la potencia.
 * El exponente sea 0, el resultado es 1.
 * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 **/

public class Ejercicio4 {
    public static void main(String[] args) {

        int potencia = 1;
        int base;
        int exponente;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el base: ");
        base = sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        exponente = sc.nextInt();

        
        if(exponente > 0){
            potencia *= base;
            System.out.println("El potencia es: " + potencia);
        } else if (exponente == 0) {
            System.out.println("El potencia es: " + potencia);
        } else if (exponente < 0) {
            potencia = (1/potencia) * base;
            System.out.println("El potencia es: " + potencia);
        }


    }
}
