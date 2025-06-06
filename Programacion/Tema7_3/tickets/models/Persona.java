package Tema7_3.tickets.models;

public class Persona {

    /**
     * Atributos
     */
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String movil;

    /**
     * Constructor
     * @param id
     * @param nombre
     * @param apellido
     * @param email
     * @param movil
     */
    public Persona(int id, String nombre, String apellido, String email, String movil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.movil = movil;
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

    public String getMovil() {
        return movil;
    }

    public Persona setMovil(String movil) {
        this.movil = movil;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", movil='").append(movil).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
