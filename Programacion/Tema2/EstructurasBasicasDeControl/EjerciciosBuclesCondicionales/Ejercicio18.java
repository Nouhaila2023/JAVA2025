package Tema2.EstructurasBasicasDeControl.EjerciciosBuclesCondicionales;

import java.util.Scanner;

public class Ejercicio18 {

/*Diseña un método que indique si un número entero pasado como parámetro es o no un número primo
(devuelve un boolean). Un número primo es aquel que tiene por divisores el 1 y el propio número,
únicamente.*/

    /*numeros primo: es el numero que se puede devidir entre 1 y el mismo*/


    public static boolean Primo(int n) {

        if (n <= 1){
            return false;
        }

        if (n == 2){
            return true;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("Introduzca el primer numero");
            numero = Integer.parseInt(sc.nextLine());

        } catch (Exception e) {
            System.out.println("Error no has introducido no es corecto");
            return;
        }

        if (Primo(numero)){
            System.out.println("El numero " + numero + " es primo");
        }else {
            System.out.println("El numero " + numero + " no es primo");
        }

    }
}
