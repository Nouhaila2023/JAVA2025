package Ejercicios_Udemy.Variables;

import java.util.Scanner;

public class SistemasNumericosEntradaScaner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //numero decimal
        int num1;

        try {
            System.out.println("Ingrese un numero entero: ");
            num1 = sc.nextInt();
            System.out.println("El numero es: " + num1);
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("No se puede ingresar el numero");
        }




    }
}
