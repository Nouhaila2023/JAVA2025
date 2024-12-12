package Tema3.ClasesStringStringBuffer.StringStringBuffer;

import java.util.Scanner;

public class Ejercicio2 {


    /*Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, este
es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por
lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
“teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá “holaloh”. Haz dos versiones, una
con String y otra con StringBuffer.*/


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu texto:");
        String texto = sc.nextLine();
        String reves = "";

       for(int j=texto.length()-2; j >= 0; j--) {
                reves += texto.charAt(j);
       }

        System.out.println(texto+reves);


       //Opcion StringBuffer

        StringBuffer sb = new StringBuffer(texto);
        sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        System.out.println(texto+sb);
    }
}
