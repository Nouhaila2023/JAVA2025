package Tema2.EstructurasBasicasDeControl.EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio9 {
    /*Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10. */

    public static int Devisur(int numero){

        int contador = 0;


        while (numero > 0 && numero % 10 == 0){

                numero /= 10;
                contador++;

        }

        System.out.println("Se puede dividir " + contador + " veces");

        return numero;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Intrega numero: ");

        int numero = sc.nextInt();

        //Convertir un integar a cadena.
        String cadena = String.valueOf(numero);

        //Contar los digitos
        int digitos = cadena.length();

        System.out.println("El numero " + numero + " tiene " + digitos + " digitos.");

        //Convertir un String a un numero
        int entero = Integer.parseInt(cadena);

        int divisibles =  Devisur(entero);

        System.out.println(divisibles);
        sc.close();

    }
}
