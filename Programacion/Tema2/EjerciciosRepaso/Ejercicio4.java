package Tema2.EjerciciosRepaso;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for. Házlo
        también con un while.*/


        System.out.println("El Ejercicio con for:");
        for (int i = 320; i >= 160 ; i--) {
            i -= 20;
            System.out.println(i);
        }

        System.out.println("El Ejercicio con while:");
        int num = 320;

        while (num != 160){
            num -= 20;
            System.out.println(num);
        }


    }
}
