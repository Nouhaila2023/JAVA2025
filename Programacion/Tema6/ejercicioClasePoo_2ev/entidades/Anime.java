package Tema6.ejercicioClasePoo_2ev.entidades;

import java.time.LocalDate;

public class Anime extends Comic{

    /**
     * Atributos
     */
    private Integer episodio;
    private String serie;

    /**
     * Constructor
     */
    public Anime(String titulo, LocalDate fecha, Integer numPaginas, Integer episodio, String serie) {
        super(titulo, fecha, numPaginas);
        this.episodio = episodio;
        this.serie = serie;
    }

    /**
     * Getter and Setter
     */
    public Integer getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Integer episodio) {
        this.episodio = episodio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Anime{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autors=").append(autors);
        sb.append(", episodio=").append(episodio);
        sb.append(", serie='").append(serie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
