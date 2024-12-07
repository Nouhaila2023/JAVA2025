package Tema3.Prueva;

public class Ejercicio3 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        /*Genera de forma aleatoria un array de enteros con 100 elementos
        * los valores estaran entre -100 y 100
        * pinta los valores a revers
        * pinta los valores
        * Dime la media de todos valores*/

        int numero[] = new int[100];
        int suma = 0;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(-100 ,100);
        }

        System.out.println("Pinta los valores");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);suma += numero[i];
        }

        System.out.println("-----------------------------------");

        System.out.println("Pinta los valores al revés");
        for (int i = numero.length - 1; i >= 0 ; i--) {
            System.out.println(numero[i]);
            suma += numero[i];
        }

        System.out.println("La media: " + suma + "/" + numero.length + " = " +  suma / numero.length);








    }

}
