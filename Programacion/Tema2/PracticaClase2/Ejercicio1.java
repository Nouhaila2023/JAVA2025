package Tema2.PracticaClase2;

import java.util.Scanner;

public class Ejercicio1 {

    /*Búsqueda binaria
    El usuario piensa un número, y el programa debe averiguarlo. Pide al usuario que piense un
    número entre el 1 y el 100. El programa mostrará un número por pantalla y preguntará al
    usuario si el número que ha pensado es menor, igual o mayor al número mostrado. Este
    proceso lo repetirá hasta encontrar el número que ha pensado el usuario. Al finalizar el
    proceso, mostrará el número de intentos probados hasta encontrar el número.*/

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        int numero_aleatorio = numero_aleatorio(1,100);

        do{

            try {
                System.out.println("Dime el numero:");
                numero = Integer.parseInt(sc.nextLine());
            }catch (Exception sx){
                System.out.println("Error");
            }

            if (numero_aleatorio > numero){
                System.out.println("Es Mayor");
            } else if (numero_aleatorio < numero) {
                System.out.println("Es Menor");
            }else {
                System.out.println(numero_aleatorio + " = " + numero + " --> Es igual");
            }
            contador ++;

        }while (numero != numero_aleatorio);


        System.out.println("número de intentos: " + contador);

        sc.close();

    }

}
