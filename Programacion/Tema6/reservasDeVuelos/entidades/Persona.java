package Tema6.reservasDeVuelos.entidades;

import java.util.Objects;

public abstract class Persona {

    /**
     * Atributos
     */
    protected Long id;
    protected String nombre;
    protected String apellido;
    protected String dniPasaporte;
    protected String email;
    protected String direccion;
    protected String ciudad;
    protected String pais;
    protected String telefono;

    /**
     * Constructor vacio
     */
    public Persona() {
    }

    /**
     * Constructor con todos los parametros
     */
    public Persona(Long id, String nombre, String apellido, String dniPasaporte, String email, String direccion, String ciudad, String pais, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dniPasaporte = dniPasaporte;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.telefono = telefono;
    }

    /**
     * Getter Setter
     */
    public Long getId() {
        return id;
    }

    public Persona setId(Long id) {
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

    public String getDniPasaporte() {
        return dniPasaporte;
    }

    public Persona setDniPasaporte(String dniPasaporte) {
        this.dniPasaporte = dniPasaporte;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Persona setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Persona setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Persona setCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public String getPais() {
        return pais;
    }

    public Persona setPais(String pais) {
        this.pais = pais;
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
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", dniPasaporte='").append(dniPasaporte).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * Equals por dinPasaporte
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
