package Tema2.EstructurasBasicasDeControl.EjerciciosCondicionales;

   /*Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
362 euros  1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
que ir sacando la división entera, y el resto se lleva al siguiente billete. */

import java.util.Scanner;

public class Ejercicio4 {

    public static void Billete(int cantidad){

        int b200, b100 ,  b50 , b10;

        if (cantidad >= 200){
            b200 = cantidad / 200;
            System.out.println("Hay *" + b200 + "* billetes de 200€.");

            cantidad -= (200*b200);

            System.out.println( "Sobran " + cantidad + "€");

        }


        if (cantidad >= 100){
            b100 = cantidad / 100;
            System.out.println("Hay *" + b100 + "* billetes de 100€.");

            cantidad -= (100*b100);

            System.out.println( "Sobran " + cantidad + "€");

        }


        if (cantidad >= 50){
            b50 = cantidad / 50;
            System.out.println("Hay *" + b50 + "* billetes de 50€.");

            cantidad -= (50*b50);

            System.out.println( "Sobran " + cantidad + "€");

        }


        if (cantidad >= 10){
            b10 = cantidad / 10;
            System.out.println("Hay *" + b10 + "* billetes de 10€.");

            cantidad -= (10*b10);


            System.out.println( "Sobran " + cantidad + "€");

        }

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese cantidad de billetes");
        cantidad = sc.nextInt();

        Billete(cantidad);


    }
}
