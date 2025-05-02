package Tema7_1.practicaClase;

import java.security.SecureRandom;
import java.util.Objects;

public class Usuario {
    /**
     * Atributos
     */
    private String nombre;
    private String email;
    private String passwordHash;//contrasena cifrada

    /**
     * Constructor
     * @return
     */

    public Usuario(String nombre, String email, String passwordHash) {
        this.nombre = nombre;
        this.email = email;
        this.passwordHash = generarContraseña();
    }


    /**
     * toString
     * @return
     */

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", passwordHash='").append(passwordHash).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals and hashCode
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(email, usuario.email) && Objects.equals(passwordHash, usuario.passwordHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, email, passwordHash);
    }






    public static String generarContraseña() {
        // Definir los caracteres permitidos en la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        SecureRandom random = new SecureRandom();
        StringBuilder contrasena = new StringBuilder();

        // Generar la contraseña de la longitud solicitada
        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }

        return contrasena.toString();
    }


}
