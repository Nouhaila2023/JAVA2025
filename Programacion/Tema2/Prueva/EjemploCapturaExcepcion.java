package Tema2.Prueva;

import java.util.Scanner;

public class EjemploCapturaExcepcion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {

            System.out.println("Intregasion:");
            int num = sc.nextInt();


        } catch (Exception e) {

            System.out.println("Error: Tienes que Intregar un numero." + e.getMessage());

        }


    }
}
