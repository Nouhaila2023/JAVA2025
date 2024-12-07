package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio 5
Escribe un programa que dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador
de potencia.*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int base;
        int exponent;
        int resulta = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de base: ");
        base = sc.nextInt();
        System.out.println("Ingrese el valor de exponent: ");
        exponent = sc.nextInt();

        
        if (exponent >= 1){
            for (int i = 0; i < exponent; i++) {
                resulta *= base;
            }
            System.out.println(resulta);
        }else {
            System.out.println("Error");
        }
        
        System.out.println(Math.pow(base, exponent));

    }
}
