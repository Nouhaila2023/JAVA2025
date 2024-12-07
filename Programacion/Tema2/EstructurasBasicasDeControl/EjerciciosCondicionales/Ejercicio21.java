package Tema2.EstructurasBasicasDeControl.EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        /*Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostrar
la media de los N números introducidos, el mayor y el menor.*/


        Scanner sc = new Scanner(System.in);

        int numero;
        int cantidad;
        int maxi = 0;
        int min = 0;
        int media = 0;
        int suma = 0;

        try {

            System.out.println("Intrega el numero:");
            cantidad = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= cantidad ; i++) {

                System.out.println(i + ": Dime el numero:");
                numero = Integer.parseInt(sc.nextLine());

                if (i == 1){
                    maxi = numero;
                    min = numero;
                }

                if (numero > maxi){
                    maxi = numero;
                }

                if (numero < min){
                    min = numero;
                }

                suma += numero;
                media = suma / cantidad;


            }



        }catch (Exception ex){

           System.out.println("Numero Incorecto");

        }



        System.out.println("El numero mayor es --> " + maxi );
        System.out.println("El numero menor es --> " + min );
        System.out.println("La media es --> " + media);


    }
}
