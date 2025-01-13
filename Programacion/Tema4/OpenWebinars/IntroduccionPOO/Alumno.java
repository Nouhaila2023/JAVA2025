package Tema4.OpenWebinars.IntroduccionPOO;

//Se necesita crear una clase que
// representara a un Alumno de un centro educativo


import java.util.Objects;

public class Alumno {
//De cada alumno se quiere conocer
// el nombre , apellidos, email, edad y elefono

    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private int telefono;

//Se necisitan diferenter constructores

    //Sin argumentos
    public Alumno() {
    }

    //Nombre apellido y edad
    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Todos los atributos
    public Alumno(String nombre, String apellido, int edad, String email, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

//Se deben implementar los metodos getters y setters
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Se debe añader un metodo que nos indique si el alumno es mayor de edad(>= 18)

    public boolean MayorEdad(){
        if (edad >= 18){
            System.out.println("EL alumno " + nombre + " " + apellido + ": es mayor edad");
            return true;
        }else {
            System.out.println("EL alumno " + nombre + " " + apellido + ": no es mayor edad");
            return false;
        }

    }


    //Se deben implementar los metodos equals, hashCode y toString
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return edad == alumno.edad && telefono == alumno.telefono && Objects.equals(nombre, alumno.nombre) && Objects.equals(apellido, alumno.apellido) && Objects.equals(email, alumno.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, email, telefono);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }



}
