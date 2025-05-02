package Tema7_1.corsoGenericosColecciones.records.atributosYmetodosEstaticos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record Alumno(String nombre, String apellido, String email, int edad) {

    public static final String DOMINIO = "@gmail.com";

    public Alumno(String nombre, String apellido, int edad) {
        this(   nombre,
                apellido,
                nombre.toLowerCase() + apellido.toLowerCase().replaceAll("\\s"," ") + DOMINIO,
                edad);
    }

    public static Alumno of(Persona persona) {
        int edad = (int) ChronoUnit.YEARS.between(persona.getFechaNacimiento(), LocalDate.now());
        return new Alumno(persona.getNombre(), persona.getApellido(), edad);
    }




}
