package Tema3.EstructurasSelección;

import java.util.Scanner;

public class Ejercico7 {
    public static void main(String[] args) {
    /*Realiza un minicuestionario con 3 preguntas tipo test sobre la asignatura
    de programación. Cada pregunta tiene 3 respuestas, pero solo una válida.
    Cada pregunta acertada sumará un punto. El programa mostrará al final la
    calificación obtenida.
    Ejemplo de pregunta tipo test.
    Cúal de estas sentencias genera un error:
    1 – int i = “1”;
    2 – int i = -1;
    3 – int i = (int)2.2;
    Respuesta: (el usuario tendría que responder aquí)*/

        Scanner sc = new Scanner(System.in);
        int respuestaUsuario;
        String respuestaUsuarios;

        int i = -1;
        int contador = 0;

        System.out.println("Cúal de estas la respuesta corecta:");
        System.out.println("1 – int i = “1”;\n" +
                "2 – int i = -1;\n" +
                "3 – int i = (int)2.2;");
        respuestaUsuario = sc.nextInt();

        if (i == respuestaUsuario){
            System.out.println("bien");
            contador++;
        }else {
            System.out.println("error");
        }


    }
}
