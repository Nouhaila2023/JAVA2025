package Tema7_3.ticketsSoporteTecnico.models;

import java.util.UUID;

public class Persona {


    /**
     * Atributos
     */
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;


    /**
     * Constructor
     * @param nombre
     * @param apellido
     * @param email
     * @param telefono
     */
    public Persona(int id ,String nombre, String apellido, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Getter and Setter
     */
    public int getId() {
        return id;
    }

    public Persona setId(int id) {
        this.id = id;
        return this;
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

    public String getEmail() {
        return email;
    }

    public Persona setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Persona setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
