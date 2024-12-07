package Tema2.EstructurasBasicasDeControl.EjerciciosControlExcepciones;

import java.util.Scanner;

public class Ejercicio21 {

    /*Pedir un número entre 1 y 999 y mostrarlo con las cifras al revés.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int parte1, parte2, parte3 ,parte4;


        try {
            System.out.println("Intrega el numero");
            numero = Integer.parseInt(sc.nextLine());

        }catch (Exception e){
            System.out.println("Error");
        }

        //4119    9114

        parte1 = numero / 1000;
        parte2 = (numero % 1000) / 100;
        parte3 = ((numero % 1000) % 100) / 10;
        parte4 = ((numero % 1000) % 100) % 10;

        System.out.println(parte4);
        System.out.println(parte3);
        System.out.println(parte2);
        System.out.println(parte1);

        int resulta = parte1 + parte2*10 + parte3*100 + parte4*1000;

        System.out.println(resulta);


    }

}
