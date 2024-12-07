package Tema2.Prueva;

import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {

        //Vamos a pedir un precio con teclado y vamos a mostrar el precio con IVA (21%)
        //Controlas que el precio sea un duble y no escribe otro cosa
        //Controlar si es un numero negativo vamos a lanzar una excepción (no importante)
        Scanner sc = new Scanner(System.in);

        double precio;

        try {

            System.out.println("Intrega el precio:");
            precio = Double.parseDouble(sc.nextLine());

            if (precio < 0) {
                throw new Exception("Precion incorecto");
            }

            System.out.println("El precio con IVA --> " + precio * 1.21);

        } catch (NumberFormatException e) {

            System.out.println("No has introducir un dicimal para el precio.");

        }catch (Exception e){

            System.out.println(e.getMessage());

        }



    }
}
