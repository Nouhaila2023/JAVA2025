package Tema6.alquilarPelículas.entidades1;

public class Episodio {
    /**
     * Atributos
     */
    private String titulo;
    private String duracion;//en minutos
    private Temporada temporada;

    /**
     * Constructor por defecto
     */
    public Episodio() {
    }

    /**
     * Constructor con titulos y duracion
     */
    public Episodio(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Getter and Setter
     */
    public String getTitulo() {
        return titulo;
    }

    public Episodio setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public Episodio setTemporada(Temporada temporada) {
        this.temporada = temporada;
        return this;
    }

    public String getDuracion() {
        return duracion;
    }

    public Episodio setDuracion(String duracion) {
        this.duracion = duracion;
        return this;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Episodio{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", duracion='").append(duracion).append('\'');
        sb.append(", temporada=").append(temporada);
        sb.append('}');
        return sb.toString();
    }


}
