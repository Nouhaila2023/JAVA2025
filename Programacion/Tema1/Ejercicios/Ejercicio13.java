package Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        //Realiza un programa en Java con una variable
        // entera
        // t la cual contiene un tiempo en segundos y
        //queremos conocer este tiempo, pero expresado
        // en horas, minutos y segundos.

        int t;
        int hora , min , s , restantes1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tiempo en segundos: ");
        t = sc.nextInt();

        hora = t/3600;
        restantes1 = (t - (hora*3600));
        min = restantes1 / 60;
        s = (restantes1 - (min*60));

        System.out.println(hora + "h" + min + "min" + s + "s");


    sc.close();

    }
}