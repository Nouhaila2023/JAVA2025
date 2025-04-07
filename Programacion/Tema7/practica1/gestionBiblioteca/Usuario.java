package Tema7.practica1.gestionBiblioteca;

import java.util.Objects;

public class Usuario implements Comparable<Usuario>{
    /**
     * Atributos
     */
    private String DNI;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    /**
     * Getter Setter
     */
    public String getDNI() {
        return DNI;
    }

    public Usuario setDNI(String DNI) {
        this.DNI = DNI;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Usuario setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * toSting
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("DNI='").append(DNI).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals con DNI
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(DNI, usuario.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }

    @Override
    public int compareTo(Usuario o) {
        return this.DNI.compareTo(o.getDNI());
    }
}
