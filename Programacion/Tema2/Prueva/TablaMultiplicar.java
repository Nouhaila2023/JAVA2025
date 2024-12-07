package Tema2.Prueva;

public class TablaMultiplicar {

    public static void main(String[] args) {

        //Imprimir tabla de multiplicar el 9

        int numero = 9;
        int mul;

        for (int i = 1; i <= 10; i++) {

            mul = numero * i;

            System.out.println(mul);

        }

        //Imprimir todas las tablas


        for (int i = 1; i <= 10; i++) {

            System.out.println("--------------------------- tabla de " + i);

            for (int j = 1; j < 10; j++) {

                mul = i * j;

                System.out.println( j + " x " + i + " = " + mul);

            }

        }

        //Sacamos todos las tablas menos del 10

        for (int i = 1; i <= 20; i++) {



            if (i != 10){

                System.out.println("--------------------------- tabla de " + i);

                for (int j = 1; j < 10; j++) {

                    mul = i * j;

                    System.out.println( j + " x " + i + " = " + mul);

                }

            }

        }

    }

}
