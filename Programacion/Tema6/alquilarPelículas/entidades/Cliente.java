package Tema6.alquilarPelículas.entidades;
import java.util.Objects;

public abstract class Cliente {

    /**
     * Atributos
     */
    protected String dni;
    protected String nombre;
    protected String email;
    protected double precioMencual;


    /**
     * Constructor por defecto
     */
    public Cliente() {
    }

    /**
     * Constructor con todos los parametros menos en precioMensual
     */
    public Cliente(String dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    /**
     * Métodos abstracto
     */

    public abstract boolean esPro();
    public abstract double getPrecioMensual();

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

    public Cliente setPrecioMencual(double precioMencual) {
        this.precioMencual = precioMencual;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", precioMencual=").append(precioMencual);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals por dni
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
