package Tema3.EstructurasSelección;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*Escribe un programa que calcule el salario semanal de un trabajador
        teniendo en cuenta que las horas ordinarias (40 primeras horas de
        trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
        euros la hora*/

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Intrega la hora de el trabajo:");
        hora = Integer.parseInt(sc.nextLine());

        if (hora <= 40) {
            System.out.println("El total del las horas de trabajo: " + hora);
            System.out.println("El precio de pago al semana es: " + (hora * 12) );
        }else if (hora >= 41) {
            System.out.println("El total del las horas de trabajo: " + hora);
            int horaExtra = hora - 40;
            System.out.println("El precio de pago al semana es: " + ((40*12) + (horaExtra * 16)));
        }


        sc.close();





    }
}
