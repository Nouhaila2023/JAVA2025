package tema7_2.stremas.canciones;

public class Artista {

    /**
     * Atributos
     */
    private String nombre;
    private String pais;

    /**
     * Constructor
     * @param nombre
     * @param pais
     */
    public Artista(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    /**
     * Getter Setter
     */
    public String getNombre() {
        return nombre;
    }

    public Artista setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getPais() {
        return pais;
    }

    public Artista setPais(String pais) {
        this.pais = pais;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Artista{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append('}');
        return sb.toString();
    }


}

