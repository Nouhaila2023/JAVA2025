package Tema7_3.wallapop.model;

import java.time.LocalDate;

public class Usuario {

    private String nombre;
    private String apellido;
    private String genero;
    private LocalDate fechaNacimiento;
    private String dni;
    private String login;
    private String password;


    public Usuario(String nombre, String apellido, String geneto, LocalDate fechaNacimiento, String dni,String login, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = geneto;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.login = login;
        this.password = password;
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

    public String getGenero() {
        return genero;
    }

    public Usuario setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Usuario setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Usuario setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Usuario setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public Usuario setLogin(String login) {
        this.login = login;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
