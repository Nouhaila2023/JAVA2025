package Tema3.Prueva;

public class Ejercicio5 {

    public static double numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {


        /*
        * Vamos a simular que tenemos un sensor de temperatura en una plantacion de tomates (0 y 55 grados)
        * El dispositivo toma la temperatura 120 veces al dia
        * Simula el comportamiento del sensor con un array de double
        * que represente la temperatura tomada por el sensor
        *
        * si la temperatura media actual es superior a un umbral (35 grados)
        * debe saltar una alarma (throw Exception)
        *
        */


        int media= 0;

        double temperatura[] = new double[120];

        for (int i = 0; i < temperatura.length; i++) {

            temperatura[i] = numero_aleatorio(5,50);

        }
    }
}
