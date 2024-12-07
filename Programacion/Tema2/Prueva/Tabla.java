package Tema2.Prueva;

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {

        /*PINTA POR TECLADO LA TABLA DE MULTIPLICAR DEL NUMERO 7*/



        for (int i = 1; i < 10 ; i++) {
            System.out.println(i + "x7=" +(i*7));
        }


        System.out.println(" ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        //Pinta la tabla 4 al revers
        //4*10=40
        for (int i = 10; i > 0 ; i--) {
            System.out.println("4x"+ i + "=" +(i*4));
        }


        System.out.println(" ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");





    }
}
