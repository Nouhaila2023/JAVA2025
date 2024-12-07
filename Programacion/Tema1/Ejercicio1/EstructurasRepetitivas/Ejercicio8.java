package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio 8
Una empresa les paga a sus empleados con base en las horas trabajadas en la semana.
Realice un algoritmo para determinar el sueldo semanal de N trabajadores y, además,
calcule cuánto pagó la empresa por los N empleados.*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {


        int semana = 6;
        double baseHora = 8.28; //El base en españa
        int N;
        double sueldo;
        int horaDiaria;
        double pagoTotal = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas horas has trabajado al dia?");
        horaDiaria = sc.nextInt();
        System.out.println("¿Cuantos trabajadores hay?");
        N = sc.nextInt();

        sueldo = horaDiaria * baseHora * semana;

        System.out.println("Sueldo total para un trabajador: " + sueldo);

        pagoTotal += sueldo;

        System.out.println("La empresa paga: " + pagoTotal);






        System.out.println("\nEl ejercicio con for:");

        System.out.println("¿Cuantos trabajadores hay?");
        N = sc.nextInt();

        for (int i = 0; i <N ; i++) {
            System.out.println("¿Cuantas horas has trabajado " + (i+1) +  " al dia?");
            horaDiaria = sc.nextInt();

            sueldo = horaDiaria * baseHora * semana;

            System.out.println("Sueldo total para un trabajador: " + sueldo);

            pagoTotal += sueldo;


        }
        System.out.println("La empresa paga: " + pagoTotal);



    }
}
