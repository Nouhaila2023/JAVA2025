package Ejercicios_Udemy.TipoStringCadenas;

import java.sql.SQLOutput;

public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Javi";

        String relacion = curso.concat(profesor);
        System.out.println("Curso = " + curso);
        System.out.println("Relacion = " + relacion);
        System.out.println(curso == relacion);

///////////////////////////////////////////////////////////////////////////////

        String relacio2 = curso.transform((c) ->{
            return c + " con " + profesor;
        });

        System.out.println("relacion2 = " + relacio2);

///////////////////////////////////////////////////////////////////////////////


//.replace
        String relacion3 = relacion.replace("a" , "A");
        System.out.println("relacion3 = " + relacion3);











    }
}
