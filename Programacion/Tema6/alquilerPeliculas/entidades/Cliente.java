package Tema6.alquilerPeliculas.entidades;

import java.util.Objects;

public abstract class Cliente {

    /**
     * Atributes
     */
    protected String dni;
    protected String nombre;
    protected String email;
    protected double precioMensual;

    /**
     * Constructod por defecto
     */
    public Cliente() {
    }

    /**
     * Constructores menos precioMensual
     */
    public Cliente(String dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.precioMensual = 0;
    }

    /**
     * Getter and Setter
     */

    public String getDni() {
        return dni;
    }

    public Cliente setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Cliente setEmail(String email) {
        this.email = email;
        return this;
    }

    public Cliente setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", precioMensual=").append(precioMensual);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals por dni
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente client = (Cliente) o;
        return Objects.equals(dni, client.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    /**
     * Metodo abstracto
     */

    public abstract double getPrecioMensual();
    public abstract boolean esPro();

}
