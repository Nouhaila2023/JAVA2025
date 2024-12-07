package Tema1.Ejercicio1.EstructurasRepetitivas;

/*Ejercicio10. Mostrar en pantalla los N primeros número primos. Se pide por teclado la cantidad de
números primos que queremos mostrar.*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Dime la cantidad del numeros: ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


    }
}

