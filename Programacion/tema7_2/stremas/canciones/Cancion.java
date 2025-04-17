package tema7_2.stremas.canciones;

public class Cancion {


    /**
     * Atributos
     */
    private String titulo;
    private Artista artista;
    private int anoLanzamiento;
    private int duracionSegs;
    private Double popularidad;
    private Genero genero;


    /**
     * Constructor
     * @param titulo
     * @param artista
     * @param anoLanzamiento
     * @param duracionSegs
     * @param popularidad
     */
    public Cancion(String titulo, Artista artista, int anoLanzamiento, int duracionSegs, Double popularidad, Genero genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLanzamiento = anoLanzamiento;
        this.duracionSegs = duracionSegs;
        this.popularidad = popularidad;
        this.genero = genero;
    }

    /**
     * Getter Setter
     */

    public String getTitulo() {
        return titulo;
    }

    public Cancion setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Artista getArtista() {
        return artista;
    }

    public Cancion setArtista(Artista artista) {
        this.artista = artista;
        return this;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public Cancion setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
        return this;
    }

    public int getDuracionSegs() {
        return duracionSegs;
    }

    public Cancion setDuracionSegs(int duracionSegs) {
        this.duracionSegs = duracionSegs;
        return this;
    }

    public Double getPopularidad() {
        return popularidad;
    }

    public Cancion setPopularidad(Double popularidad) {
        this.popularidad = popularidad;
        return this;
    }

    public Genero getGenero() {
        return genero;
    }

    public Cancion setGenero(Genero genero) {
        this.genero = genero;
        return this;
    }

    /**
     * toStinrd
     * @return
     */

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cancion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", artista='").append(artista).append('\'');
        sb.append(", anoLanzamiento=").append(anoLanzamiento);
        sb.append(", duracionSegs=").append(duracionSegs);
        sb.append(", popularidad=").append(popularidad);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }


}
