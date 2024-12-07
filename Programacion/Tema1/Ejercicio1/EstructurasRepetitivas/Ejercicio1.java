package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio 1
Crea una aplicación que permita adivinar un número. La aplicación genera un número
aleatorio del 1 al 100. A continuación, va pidiendo números y va respondiendo si el número
a adivinar es mayor o menor que el introducido, además de los intentos que te quedan
(tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
(además te dice en cuantos intentos lo has acertado), si se llega al límite de intentos te
muestra el número que había generado*/


import java.util.Scanner;

public class Ejercicio1 {


    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        int numero = numero_aleatorio(1,100);
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <10 ; i++) {

            int intregarNum = 0;
            System.out.println("Intrega el numero:");
            intregarNum = sc.nextInt();
            if (intregarNum > numero){
                System.out.println("Es Mayor");
            }else if (intregarNum < numero){
                System.out.println("Es Menor");
            }else {
                System.out.println("Es igual");
            }

        }




    }
}
