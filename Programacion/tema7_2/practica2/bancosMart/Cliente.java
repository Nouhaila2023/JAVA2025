package tema7_2.practica2.bancosMart;

import java.time.LocalDate;

public class Cliente {

    /*Atributos*/

    private String dni;
    private  String nombre;
    private String email;
    private  String telefono;
    private  String direccion;
    private String ciudad;
    private String pais;

    /**
     * Constructor
     */

    public Cliente(String dni, String nombre, String email, String telefono, String direccion, String ciudad, String pais) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    /**
     * Getter and Setter
     */

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * toString que muestra din, nombre, telefono
     */

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


