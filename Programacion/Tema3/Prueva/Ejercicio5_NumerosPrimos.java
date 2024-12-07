package Tema3.Prueva;

public class Ejercicio5_NumerosPrimos {

    public static boolean Primo(int n) {

        if (n <= 1){
            return false;
        }

        if (n == 2){
            return true;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;

    }

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        /*Genera un array de 20 numeros enteros 1, 1000
        * Muestra solo aquellos que sean primos*/


        int numero[] = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(1,1000);
            if (Primo(i)){
                System.out.println(i);
            }
        }


    }
}
