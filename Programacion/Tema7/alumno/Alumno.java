package Tema7.alumno;

import java.util.Objects;

public class Alumno {
    /**
     * Atributos
     */
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String ciudad;


    /**
     * Constructor
     * @param dni
     * @param nombre
     * @param apellido
     * @param email
     * @param edad
     * @param ciudad
     */
    public Alumno(String dni, String nombre, String apellido, String email, int edad, String ciudad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
        this.ciudad = ciudad;
    }


    /**
     * Getter Setter
     * @return
     */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alumno{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append('}');
        return sb.toString();
    }


    /**
     * Equals por dni
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
