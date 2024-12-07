package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioWhile1 {
    public static void main(String[] args) {

        System.out.println("1.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        int num1 = 1;

        while (num1 <= 5){
            System.out.println(num1);
            num1++;
        }

        System.out.println("2.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int num2 = 2;
        
        while (num2 <= 20){
            System.out.println(num2);
            num2 += 2;
        }

        System.out.println("3.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int num3 = 10;

        while (num3 >= 1){
            System.out.println(num3);
            num3 --;
        }

        System.out.println("4.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int num4 = 10;

        while (num4 <= 100){
            System.out.println(num4);
            num4 += 10;
        }

        System.out.println("5.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int num5 = 1;

        while (num5 <= 100){
            if (num5 % 10 == 0){
                System.out.println(num5);
            }
            num5++;
        }

        System.out.println("6.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        /*del 1 al 200 muestra los numeros impares que no sean multiplos de 7*/


        int num6 = 1;

        while (num6 <= 200){
            if (num6 % 7 != 0 && num6 % 2 != 0){
                System.out.println(num6);
            }
            num6++;
        }


        /*Otra manera Para el (6)*/

        System.out.println("6.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int num7 = 1;

        while (num7 <= 200){
            if (num7 % 7 != 0){
                System.out.println(num7);
            }
            num7 += 2;
        }

        System.out.println("8.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        /*Pida por teclado un contreseña mientres la longitud sea menos de 8 caracteres
        * password.length() --> devuelve la longitud del String password
        */

        /*int num8;

        Scanner sc = new Scanner(System.in);

        System.out.println("Imprime la contraseña:");
        num8 = sc.nextInt();

        if (num8 <= 99999999){
            System.out.println("corecta");
        }else {
            System.out.println("Error");
        }*/


        String num9 = "1";

        Scanner sc = new Scanner(System.in);

        while (num9.length() < 8){

            System.out.println("Imprime la contraseña:");
            num9 = sc.nextLine();

        }


        /*Pida con teclado una contraceña mentras la lengitud sea menos de 10 caracteras y tenga al menos una letra*/
        //num10.toUpperCase() Mayuscula
        //num10.toLowerCase() Meniscula


        String num10 = "hola";

        while (num10.length() < 10 || num10.equals(num10.toUpperCase())){
            System.out.println("Intrega tu contraceña:");
            num10 = sc.nextLine();
        }

        /*
        * lo que yo quiero es que la bucle termina cuando
        * */




    }
}
