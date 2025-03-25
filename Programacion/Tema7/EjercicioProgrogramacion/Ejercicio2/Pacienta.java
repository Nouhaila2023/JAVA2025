package Tema7.EjercicioProgrogramacion.Ejercicio2;

public class Pacienta {
    /**
     * Atributos
     */

    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String direccion;
    private String ciudad;

    /**
     * Constructor
     */
    public Pacienta(String nombre, String apellidos, String telefono, String email, String direccion, String ciudad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    /**
     * Getter Setter
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacienta{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
