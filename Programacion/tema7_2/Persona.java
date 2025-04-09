package tema7_2;

public class Persona {

    String nombre;
    String email;

    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    /**
     * Pasar el nombre y el email a mayuscula
     * @return
     */

    public Persona pasarAMayuscula(){
        this.nombre = this.nombre.toUpperCase();
        this.email = this.email.toUpperCase();
        return this;
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


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
