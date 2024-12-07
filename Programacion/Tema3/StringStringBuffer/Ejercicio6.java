package Tema3.StringStringBuffer;

import java.util.Scanner;

public class Ejercicio6 {

    /**
     * 6. Crea un método que determine si una cadena
     *    es un palíndromo, o sea, se lee igual en los dos sentidos.
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dima una cadena palindromo:)");
        String cadena = sc.nextLine();

        StringBuffer sb = new StringBuffer(cadena);

        if (cadena.equals(sb.reverse().toString())){
            System.out.println("La palabre es palindromo.");
        }else {
            System.out.println("La palabre no es palindromo");
        }


    }
}
