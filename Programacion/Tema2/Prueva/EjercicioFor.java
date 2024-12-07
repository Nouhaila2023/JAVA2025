package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioFor {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {



        /*System.out.println("1.++++++++++++++++++++++++++++++++++++++");

        /*de 1 al 10 con while*/

        int numero = 1;

        while (numero <= 10){
            System.out.println(numero);
            numero++;
        }

        System.out.println(" ");
        System.out.println("2.++++++++++++++++++++++++++++++++++++++");

        /*d 1 al 10 con for*/

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("3.++++++++++++++++++++++++++++++++++++++");

        /*num par desde el 1 al 40*/

        for (int i = 2; i < 40 ; i+=2) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("4.++++++++++++++++++++++++++++++++++++++");

        //recorer la cadena de caracter a caracter

        String nombre = "Nouhaila";

        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }

        System.out.println(" ");
        System.out.println("5.++++++++++++++++++++++++++++++++++++++");

        /*contar desde el 10 a 1 con for*/

        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("6.++++++++++++++++++++++++++++++++++++++");

        /*genera 10 teradas de un dado usando for*/

        for (int i = 1; i <= 10; i++) {

            int tirada = numero_aleatorio(1,6);

            System.out.println(tirada);
        }

        /*otra manera con random escrito*/

        System.out.println(" ");
        System.out.println("6.Otra manera+++++++++++++++++++++++++++");

        for (int i = 1; i <= 10 ; i++) {
            int tirada = (int) (Math.random()* (6 +1-1) +1);
            System.out.println(tirada);
        }


        System.out.println(" ");
        System.out.println("6.Otra manera con while++++++++++++++++");

        int i = 1 , tirada;

        while (i >= 10){
            tirada = (int) (Math.random()* (6) +1);
            System.out.println(tirada);
        }

        System.out.println(" ");
        System.out.println("7.++++++++++++++++++++++++++++++++++++++");

        /*Pregunat por teclado 5 nombres de persona*/

        Scanner sc = new Scanner(System.in);

        String nombres;

        for (int j = 1; j <= 5; j++) {
            System.out.println("Dime el nombre: ");
            nombres = sc.nextLine();

        }

        System.out.println(" ");
        System.out.println("8.++++++++++++++++++++++++++++++++++++++");

        /*Pregunat por teclado 5 nombres de persona*/
        //Para pentamas los nombres seguidos tenemos que ir guardando le nombre en una variable
        //EX: nombre = nombre + nuevo


        String nombress;
        String guardad = "";

        for (int j = 1; j <= 5; j++) {
            System.out.println("Dime el nombre: ");
            nombress = sc.nextLine();
            guardad += nombress + " ";
            System.out.println(guardad);
        }
        System.out.println(guardad);


        System.out.println(" ");
        System.out.println("9.++++++++++++++++++++++++++++++++++++++");





    }
}
