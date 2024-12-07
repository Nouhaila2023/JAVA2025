package Tema3.Prueva;

import java.util.Scanner;

public class CharAt1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = "";
        int numeroLetra = -1;
        char letra;
        System.out.println("Dime tu texto");
        texto = sc.nextLine();

        do {
            try {
                System.out.println("Dima la pucicion");
                numeroLetra = sc.nextInt();
                if (numeroLetra < 1 || numeroLetra > texto.length()) {
                    System.out.println("Error: La pucicion debe ser entre 1 y " + texto.length());
                } else {
                    letra = texto.charAt(numeroLetra - 1);
                    System.out.println("El numero ilejido de la pusicion: " + letra);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine(); // limpiar el bufer
            }

        } while (true);

    }
}