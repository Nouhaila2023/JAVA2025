package Tema2.Prueva;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        /*Intriduse un numero y di si es numero primo*/
        // EL numero prime solo divisible entre el mismo y el 1
        //Indicador

        //EX: numero = 7 ->> 7%6   7%5 ... hasta el 2


        Scanner sc = new Scanner(System.in);

        boolean esPrimo = true;
        int numero ;

        double resultado;

        System.out.println("Intriga el numero: ");
        numero = Integer.parseInt(sc.nextLine());

        for (int i = (numero - 1) ; i >= 2 ; i--) {

            resultado = numero % i;

            if (resultado == 0){

                esPrimo = false;

            }

            if (esPrimo){
                System.out.println("El numero " + numero + " es primo");
            }else {
                System.out.println("El numero " + numero + " no es primo");

            }

        }

        System.out.println("El numro es: " + esPrimo);


    }
}
