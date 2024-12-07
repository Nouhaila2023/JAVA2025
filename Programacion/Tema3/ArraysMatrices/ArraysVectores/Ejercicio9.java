package Tema3.ArraysMatrices.ArraysVectores;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio9 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        /*Realizar un programa que lea los tiempos en los que de 10 corredores han acabado una carrera. El programa debe
determinar qué corredores tienen el primer, segundo y último puesto, así como cuál es el tiempo medio en que
se ha corrido la carrera. Pista: ordénalo antes.*/


        //Crear un array de 10 enteros
        //Rellenalo con valors aleatorio entre 1 y 10
        //Devolver el corrodor que ha quedado 1 ,2 y ultimo
        //Devolver e tiempo medio = suma total / 10



        int corredores[] = new int[10];

        for (int i = 0; i < corredores.length ; i++) {
            corredores[i] = numero_aleatorio(1,10);
            System.out.print(corredores[i] + " ");
        }

        //Ordenar el array
        //Arrays.sort(vector)
        Arrays.sort(corredores);

        System.out.println("EL premero es: " + corredores[0]);
        System.out.println("EL segundo es: " + corredores[2]);
        System.out.println("EL ultimo es: " + corredores[9]);





    }
}
