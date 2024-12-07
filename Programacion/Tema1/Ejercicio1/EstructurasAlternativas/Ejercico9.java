package Tema1.Ejercicio1.EstructurasAlternativas;

import java.util.Scanner;

/**Ejercicio 9
 Escribe un programa que pida un número entero entre uno y doce e imprima el número de
 días que tiene el mes correspondiente.**/

public class Ejercico9 {
    public static void main(String[] args) {

        int mes;

        //2 -> 28
        // 1,3,5,7,8,10,12 -> 31
        // 4,6,9,11 -> 30

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrege el numero:");
        mes = sc.nextInt();

        switch (mes){
            case 2:
                System.out.println("28");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("31");
                break;
            case 4,6,9,11:
                System.out.println("30");
                break;
            default:
                System.out.println("Numero de meses");
        }



    }
}
