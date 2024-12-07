package Tema2.EstructurasBasicasDeControl.EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio1 {

    /*Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
public int mayor (int a, int b, int c) { … }
*/

    public static int MayorDeTres(int a, int b , int c){

        if (a>b && a>c){
            return a;
        } else if (b>a && b>c ) {
            return b;
        }else
            return c;

    }

   /*public static int MayorDeCuatro(int a , int b , int c , int d){

        return MayorDeTres(MayorDeTres(a,b), MayorDeTres(c,d));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Intriga el valor de A:");
        int a = sc.nextInt();
        System.out.println("Intriga el valor de B:");
        int b = sc.nextInt();
        System.out.println("Intriga el valor de C:");
        int c = sc.nextInt();
        System.out.println("Intrega el valoe de D:");
        int d = sc.nextInt();


        int resultado = MayorDeTres(a,b);
        System.out.println("El mayor numero es: " + resultado);


        int resulado = MayorDeCuatro(a,b,c,d);
        System.out.println(resulado);

    }*/
}
