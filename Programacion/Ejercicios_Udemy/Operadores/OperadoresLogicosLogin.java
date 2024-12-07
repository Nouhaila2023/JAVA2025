package Ejercicios_Udemy.Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = "Nouhaila";
        String contra = "1234";

        System.out.println("Intrese el numbre");
        String num = sc.nextLine();

        System.out.println("Intrese el contra");
        String p = sc.nextLine();

        boolean esAuteneticado = false;

        if (nombre.equals(num) && contra.equals(p)){
            esAuteneticado = true;
        }else {
            System.out.println("En corecto");
        }

        if (esAuteneticado){
            System.out.println("Bienvenido".concat(num).concat("!"));
        }else {
            System.out.println("Lo siento, requiere autenticacion");
        }


    }
}
