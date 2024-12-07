package Tema1.Ejercicio1.EstructurasSecuenciales;

import java.util.Scanner;

/**Ejercicio 13
Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: por
cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0.
Imprime el resultado obtenido por el estudiante.
* */
public class Ejercicio13 {
    public static void main(String[] args) {

        int correcta = 5;
        int incorrecta = 3;
        int blanca = 2;
        int nota_final = 0;

        if (correcta > 0){
            nota_final += (correcta*5);
        }
        if (incorrecta > 0){
            nota_final += (incorrecta*(-1));
        }
        if (blanca > 0){
            nota_final += (blanca*0);
        }

        System.out.println("La nota final es: " + nota_final);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //Otra manera facil

        nota_final = (correcta * 5) + (incorrecta * (-1)) + (blanca * 0);
        System.out.println("La nota final es: " + nota_final);

        //Ptra manera del prof

        nota_final = (correcta * 5) - incorrecta;
        System.out.println("La nota final es: " + nota_final);


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Otra manera con tres preguntas

        String cuaderno = "book";
        String leche = "melk";
        String manzana = "appel";
        int nota_final1 = 0;
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.println("Que es cuaderno en Inglés: ");
        respuesta = sc.nextLine();


        if (respuesta.equalsIgnoreCase(cuaderno)){
            nota_final1 += (correcta*5);
        }
        if (respuesta.equalsIgnoreCase(String.valueOf(cuaderno == "melk" || cuaderno == "appel"))) {
            nota_final1 += (incorrecta*(-1));
        }
        if (respuesta.equalsIgnoreCase(String.valueOf(cuaderno.trim().isEmpty()))){
            nota_final1 += (blanca*0);
        }

        System.out.println("Que es leche en Inglés: ");
        respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase(leche)){
            nota_final1 += (correcta*5);
        }
        if (respuesta.equalsIgnoreCase(String.valueOf(leche == "book" || leche == "appel"))) {
            nota_final1 += (incorrecta*(-1));
        }
        if (respuesta.equalsIgnoreCase(String.valueOf(leche.trim().isEmpty()))){
            nota_final1 += (blanca*0);
        }

        System.out.println("Que es manzana en Inglés: ");
        respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase(manzana)){
            nota_final1 += (correcta*5);
        }
        if (respuesta.equalsIgnoreCase(String.valueOf(manzana == "book" || manzana == "melk"))) {
            nota_final1 += (incorrecta*(-1));
        }
        if (respuesta.equalsIgnoreCase(String.valueOf(manzana.trim().isEmpty()))){
            nota_final1 += (blanca*0);
        }

        System.out.println(nota_final1);


    }
}
