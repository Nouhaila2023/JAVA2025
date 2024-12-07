package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioDoWhile1 {
    public static void main(String[] args) {

        System.out.println("1.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        /*String password;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Dime la contraceña:");
            password = sc.nextLine();
        }while (password.length() < 8);*/


        //Muestra los numero del 1 al 10 usando do while

        System.out.println("2.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        int num1 = 1;

        do {
            System.out.println(num1);
            num1++;
        }while (num1 <= 10);

        System.out.println("3.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int num2 = 100;

        do {
            System.out.println(num2--);

        }while (num2 >= 1);





    }
}
