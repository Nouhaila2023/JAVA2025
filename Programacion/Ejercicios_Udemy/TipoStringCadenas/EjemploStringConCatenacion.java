package Ejercicios_Udemy.TipoStringCadenas;

public class EjemploStringConCatenacion {
    public static void main(String[] args) {

        String curso = "Programacion java";
        String profesor = "Andres";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numA = 10;
        int numB = 5;



        String detall2 = curso.concat(" con ").concat(profesor);
        System.out.println(detall2);

    }
}
