package Prueva;

import java.util.Scanner;

public class CircunferenciaRadio1 {
    public static  void  main (String[] args){

        int radio = 9;
        double circufernencia =0;
        double longitod =0;

        System.out.println("¿Que radio quieres? ");

        Scanner sc = new Scanner(System.in);
        radio = sc.nextInt();

        circufernencia = Math.PI * radio * radio;
        longitod = Math.PI * radio * 2;


        System.out.println("El circufernencia: " + circufernencia);
        System.out.println("El longitod: " + longitod);
    }

}
