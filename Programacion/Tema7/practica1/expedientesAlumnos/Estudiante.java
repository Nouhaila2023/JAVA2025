package Tema7.practica1.expedientesAlumnos;

import java.time.LocalDate;
import java.util.Objects;

public class Estudiante {

    /**
     * Atributos
     */
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String localidad;
    private String email;
    private String telefono;

    /**
     * Constructor
     * @param dni
     * @param nombre
     * @param apellido
     * @param fechaNacimiento
     * @param direccion
     * @param localidad
     * @param email
     * @param telefono
     */
    public Estudiante(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String localidad, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.localidad = localidad;
        this.email = email;
        this.telefono = telefono;
    }


    /**
     * Getter Setter
     */
    public String getDni() {
        return dni;
    }

    public Estudiante setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Estudiante setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Estudiante setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Estudiante setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Estudiante setLocalidad(String localidad) {
        this.localidad = localidad;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Estudiante setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Estudiante setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Estudiante{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals con dni
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
