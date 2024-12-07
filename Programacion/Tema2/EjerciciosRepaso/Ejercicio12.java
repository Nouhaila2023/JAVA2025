package Tema2.EjerciciosRepaso;

public class Ejercicio12 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        /*Genera y muestra las tiradas de tres dados (seis caras)
        hasta que los tres dados saquen el mismo valor.
        Muestra las tiradas y el número de tiradas necesario hasta que han salido iguales*/

        int dado1 , dado2 , dado3;
        int contador = 0;

        do {
            dado1 = numero_aleatorio(1, 6);
            dado2 = numero_aleatorio(1, 6);
            dado3 = numero_aleatorio(1, 6);
            System.out.println(dado1 + " " + dado2 + " " + dado3);
            contador++;

        } while (!(dado1 == dado2 && dado1 == dado3));


        System.out.println("Numero de tiradas "+contador);

        int contador1 = 0;

        do {
            dado1 = numero_aleatorio(1, 6);
            dado2 = numero_aleatorio(1, 6);
            dado3 = numero_aleatorio(1, 6);
            System.out.println(dado1 + " " + dado2 + " " + dado3);
            contador1++;

        } while ((dado1 != dado2) || (dado1 != dado3));


        System.out.println("Numero de tiradas "+contador1);


    }
}
