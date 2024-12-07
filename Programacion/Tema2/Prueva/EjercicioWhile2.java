package Tema2.Prueva;

public class EjercicioWhile2 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        //Simula lanzar un dado de sies caras, hasta que te sale un 6
        //General un numero aleatorio del 1 a 6

        int num;

        do {
            num = numero_aleatorio(1,6);
            System.out.println(num);
        } while (num != 6);


        //Simula lanzar un dado de sies caras, hasta que te sale un 6
        //cuentas el numero de tirada que has necesitado hasta sacar un 6

        System.out.println("1.+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int tirada1 = 0;
        int contador1 = 0;

        do {
            tirada1 = numero_aleatorio(1,6);
            System.out.println(tirada1);
            contador1++;

        } while (tirada1 != 6);
        System.out.println(contador1 + " Tiradas");

        System.out.println("2.+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int tirada2 = 0;
        int contador2 = 0;
        
        while (tirada2 != 6){
            tirada2 = numero_aleatorio(1,6);
            System.out.println(tirada2);
            contador2++;
        }
        System.out.println(contador2 + " Tiradas");

        System.out.println("3.+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        /*simula tirar un dado de 20 caras hasta que te sale el 1 o el 20*/

        int contador3 = 0;
        int tirada3 = 0;

        while (tirada3 != 1 && tirada3 != 20){
            tirada3 = numero_aleatorio(1,20);
            System.out.println(tirada3);
            contador3++;
        }

        System.out.println(contador3 + " tirada");









    }
}
