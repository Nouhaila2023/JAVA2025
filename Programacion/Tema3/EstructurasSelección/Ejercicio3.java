package Tema3.EstructurasSelección;

import java.util.Scanner;

public class Ejercicio3 {

    /*Escribe un programa en que dado un número del 1 a 7 escriba el
correspondiente nombre del día de la semana.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int  numeros_dia[] = new int [7];

        int numeros;

        try {
            System.out.println("Intrega de numeros de dia");
            numeros = Integer.parseInt(sc.nextLine());
        }catch (Exception e){
            System.out.println("Error");
            return;
        }

        if (numeros >= 1 && numeros <= 7){
            if (numeros == (numeros_dia[0]+1)){
                System.out.println("Lunes");
            } else if (numeros == (numeros_dia[0]+2)) {
                System.out.println("Martes");
            } else if (numeros == (numeros_dia[0]+3)) {
            System.out.println("Miercoles");
            }else if (numeros == (numeros_dia[0]+4)) {
                System.out.println("Jueves");
            } else if (numeros == (numeros_dia[0]+5)) {
                System.out.println("Viernes");
            } else if (numeros == (numeros_dia[0]+6)) {
            System.out.println("Sabado");
            } else if (numeros == (numeros_dia[0]+7)) {
                System.out.println("Domingo");
            }

        }else {
            System.out.println("Intrega el numero entre 1 y 7 Gracias:");
        }



        sc.close();
    }
}
