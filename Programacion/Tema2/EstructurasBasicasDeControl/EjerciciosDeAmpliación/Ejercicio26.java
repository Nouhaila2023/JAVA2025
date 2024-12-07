package Tema2.EstructurasBasicasDeControl.EjerciciosDeAmpliación;

import java.util.Scanner;

public class Ejercicio26 {
    /*Sistema de numeración “palotes”
    Crea una función con la siguiente cabecera:
    public static void convierteEnPalotes(int n) {...}
    Esta función recibe un parámetro de entrada de tipo entero e imprime por pantalla una cadena de
    caracteres con la conversión del número n al sistema de palotes.
    Por ejemplo:
    El número 470213 (en decimal) se convierte en:
    | | | | - | | | | | | | - - | | - | - | | |
    en el sistema de palotes.
    Fíjate en la representación del número 0 y realiza diferentes pruebas con el 0 situado en la primera
    posición, en una posición intermedia y en la posición final del número.
    El número 2130 (en decimal) se convierte en:
    | | - | - | | | - -
    en el sistema de palotes.
    Utiliza esta función en un programa para comprobar que funciona correctamente*/

    public static void convierteEnPalotes(int n){

        //Cambiamos el numero a cadena
        String numero_cadena;
        numero_cadena = Integer.toString(n);

        //la longitud del numero
        for (int i = 0; i < numero_cadena.length(); i++) {

            /*for (int j = 0; j < ; j++) {
            }*/
        }




    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega el numero:");
        int num = sc.nextInt();
        convierteEnPalotes(num);





    }

}
