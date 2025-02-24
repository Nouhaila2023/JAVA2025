package Tema6.alquilerPeliculas.entidades;

import java.util.Objects;

public abstract class Client {

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
    public Client() {
    }

    /**
     * Constructores menos precioMensual
     */
    public Client(String dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    /**
     * Getter and Setter
     */

    public String getDni() {
        return dni;
    }

    public Client setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Client setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Client setEmail(String email) {
        this.email = email;
        return this;
    }

    public Client setPrecioMensual(double precioMensual) {
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
        Client client = (Client) o;
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
