package Tema1.Ejercicio1.EstructurasAlternativas;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int min, max, par = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("min");
        min = sc.nextInt();

        System.out.println("max");
        max = sc.nextInt();
        for ( int i = min; i < max; i++){
;            if(par % 2 == 0){
                System.out.println(par+ " ES PAR");
            } else {
                System.out.println(par + " no es par");
            }
            par++;
        }

    }
}
