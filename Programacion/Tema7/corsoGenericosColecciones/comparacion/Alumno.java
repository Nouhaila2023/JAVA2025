package Tema7.corsoGenericosColecciones.comparacion;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

    /**
     * Comparar con apellido
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Alumno o) {
        return apellido.compareTo(o.apellido);
    }

    /**
     * Atributos
     */
    private int idAlumno;
    private String nombre;
    private String apellido;
    private int edad;

    /**
     * Constructor
     */
    public Alumno(int idAlumno, String nombre, String apellido, int edad) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    /**
     * Getter Aand Setter
     */
    public int getIdAlumno() {
        return idAlumno;
    }

    public Alumno setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Alumno setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Alumno setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    /**
     * toSting
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alumno{");
        sb.append("idAlumno=").append(idAlumno);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return idAlumno == alumno.idAlumno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idAlumno);
    }
}
