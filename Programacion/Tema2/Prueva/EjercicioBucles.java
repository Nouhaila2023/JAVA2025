package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioBucles {

    public static void main(String[] args) {

        //Hay que pedir numero hasta qie intruduzcamos
        //EL resultado es la suma y la media

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int suma = 0;
        int numero = 0;
        int media;

        for (int i = 0; i < 3  ; i++) {

            System.out.println("Dime el numero: ");
            numero = sc.nextInt();

            for (int j = 0; j < numero ; j++) {

                suma += numero;

            }
            contador++;

        }

        media = suma/contador;

        System.out.println("La media es: " + media);
        System.out.println("La suma es: " + suma);
        System.out.println("El contador es: " + contador);


        /**************************************************************+++*******/


        //L acorecsion:::::::


        int contador1 = 0;
        int suma1 = 0;
        int numero1 = 1;
        int media1;


        while (numero1 != 0){

            System.out.println("Intrega el numero: ");
            numero1 = Integer.parseInt(sc.nextLine());

            if (numero1 != 0){

                suma1 += numero1;
                contador1++;

            }

        }

        media1 = suma1 / contador1;

        System.out.println("La suma es --> " + suma1 + " La media es --> " + media1 + " El contador es --> " + contador1);














    }

}
