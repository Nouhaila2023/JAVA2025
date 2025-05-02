package Tema7_1.EjercicioProgrogramacion.Ejercicio1;

import java.util.Objects;

public class Entrada {

    /*
     *Atributos
     */
    private String palabraEspanol;
    private String palabraEngles;

    /**
     * Constructor
     */
    public Entrada(String palabraEspanol, String palabraEngles) {
        this.palabraEspanol = palabraEspanol;
        this.palabraEngles = palabraEngles;
    }


    /**
     * Getter Setter
     */
    public String getPalabraEspanol() {
        return palabraEspanol;
    }

    public void setPalabraEspanol(String palabraEspanol) {
        this.palabraEspanol = palabraEspanol;
    }

    public String getPalabraEngles() {
        return palabraEngles;
    }

    public void setPalabraEngles(String palabraEngles) {
        this.palabraEngles = palabraEngles;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entrada{");
        sb.append("palabraEspanol='").append(palabraEspanol).append('\'');
        sb.append(", palabraEngles='").append(palabraEngles).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return Objects.equals(palabraEspanol, entrada.palabraEspanol);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palabraEspanol);
    }
}
