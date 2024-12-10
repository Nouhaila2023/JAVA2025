package Tema3.ClasesStringStringBuffer.StringStringBuffer;

public class Ejercicio11 {

    /** . Elimina los espacios (intermedios también) de una cadena de texto */

    public static void main(String[] args) {

        String cadena = "Esta tarde no voy";

        String cadenaSinEspacio = cadena.replace(" ", "");

        System.out.println(cadena);
        System.out.println(cadenaSinEspacio);

    }

}
