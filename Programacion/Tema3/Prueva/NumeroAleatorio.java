package Tema3.Prueva;

public class NumeroAleatorio {
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }
}
