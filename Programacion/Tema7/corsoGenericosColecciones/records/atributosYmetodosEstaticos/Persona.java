package Tema7.corsoGenericosColecciones.records.atributosYmetodosEstaticos;

import java.time.LocalDate;

public class Persona {
    private String nombre ,apellido;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Persona setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Persona setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }
}
