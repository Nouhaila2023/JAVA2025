package Tema3.ClasesStringStringBuffer.StringStringBuffer;

public class Ejercicio3 {

    /**Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la
     cadena buscada. El programa indicará cuántas veces aparece la segunda cadena en la primera.*/


    public static void main(String[] args) {

        String texto = "En un lugar de la mancha de cuyo nombre de lo que nose de que";

        int palabra = texto.indexOf("de");

        //Forma 1
        int contador = 0;
        int posicion = 0;
        while (posicion >= 0) {
            posicion = texto.indexOf(palabra,posicion);
            if (posicion == -1)
                break;
            //posicion++;
            contador++;
        }
        System.out.println("Palabra aparece " + (contador) + " veces");

        //Forma 2
        posicion = -1;
        contador = 0;
        while ( (posicion = texto.indexOf(palabra,posicion+1)) >= 0) {
            contador++;
        }
        System.out.println("Palabra aparece " + (contador) + " veces");

    }

}
