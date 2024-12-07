package Tema1.Ejercicios;

public class Ejercicio14 {

    //generar numero aleatorio entero

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

    // Realiza un programa en Java que genere números de
    //forma aleatoria simulando la tirada de un dado.

        System.out.println("TERADA DE DATOS: ");

        for (int i = 1; i <= 8 ; i++) {

            int general = numero_aleatorio(1,6);
            System.out.println("Tirada #" + (i)+ " --> " + general);
        }

    }
}
