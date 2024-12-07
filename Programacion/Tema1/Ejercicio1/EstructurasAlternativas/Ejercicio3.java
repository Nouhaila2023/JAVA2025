package Tema1.Ejercicio1.EstructurasAlternativas;

import java.util.Scanner;

/**Crea un programa que pida al usuario dos números y muestre su división si el segundo no es
 cero, o un mensaje de aviso en caso contrario. **/

public class Ejercicio3 {
    public static void main(String[] args) {

        int num1 , num2;
        double division;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese un numero2: ");
        num2 = sc.nextInt();

        if (num2 > 0){
            division = num1 / num2;
            System.out.println(division);
        }else {
            System.out.println("El numero2 no puede ser 0");
        }

    }
}
