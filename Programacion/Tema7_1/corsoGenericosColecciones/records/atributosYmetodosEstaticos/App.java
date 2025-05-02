package Tema7_1.corsoGenericosColecciones.records.atributosYmetodosEstaticos;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Alumno a = new Alumno("A", "a", 12);
        System.out.println(a);
        System.out.println(Alumno.DOMINIO);

        Persona p = new Persona("P" , "p" , LocalDate.of(2002,8,13));
        Alumno b = Alumno.of(p);
        System.out.println(b);
    }
}
