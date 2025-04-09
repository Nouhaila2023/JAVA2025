package tema7_2.ejercicioClase;

public class Artista {
    /*Atributos*/

    private String nombre;
    private String pais;

    /***
     * Constrructor
     */
    public Artista(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    /**
     * Setter And Getter
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    /*
    *toStinrg
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
