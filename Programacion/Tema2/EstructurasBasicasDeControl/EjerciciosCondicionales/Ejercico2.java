package Tema2.EstructurasBasicasDeControl.EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercico2 {
/* Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7*/
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Intrega el numero");
        int numero = sc.nextInt();

        if ((numero % 2 == 0) || (numero % 3 == 0)  || (numero % 5 == 0)  || (numero % 7 == 0) ){
            System.out.println("El numero *" + numero +  "* Es múltiplo de 2, 3, 5 o 7");
        }else {
            System.out.println("El numero *" + numero + "* No es múltiplo de 2, 3, 5 o 7 ");
        }

        sc.close();

    }
}
