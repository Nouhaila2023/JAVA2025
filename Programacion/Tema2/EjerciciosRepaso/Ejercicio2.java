package Tema2.EjerciciosRepaso;

public class Ejercicio2 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }
    public static void main(String[] args) {

        /*Realiza un programa que genere 20 números aleatorios entre 1 y 200, que diga cuántos números pares
        han salido y cuántos impares*/

        int contador1 = 0, contador2 = 0;
        int i = 0;

        for (i = 0; i < 20; i++) {
            i = numero_aleatorio(1,200);
            if (i % 2 == 0){

            }else {

            }
        }

        System.out.println("La contidad de los numeros pares es:" + (contador1 += i));
        System.out.println("La contidad de los numeros impares es:" + (contador2 += i));




    }
}
