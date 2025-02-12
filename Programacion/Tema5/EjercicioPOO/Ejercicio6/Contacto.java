package Tema5.EjercicioPOO.Ejercicio6;

import java.util.Objects;

public class Contacto {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    //Un contacto esta definido por un nombre y un telefono.
    private String nombre;
    private String telefono;

    //Constructor
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
       this.telefono = String.valueOf(numero_aleatorio(0,9));
       if (telefono.length() >= 9);
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contacto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Un contacto es igual a otro cuando sus nombres son iguales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
