package Tema6.alquilarPelículas.servicios;
import Tema6.alquilarPelículas.entidades.Episodio;

import java.util.ArrayList;

public class Temporada {
    /**
     * Atributos
     */
    private int numero;
    private ArrayList<Episodio> episodios;
    private Serie serie;

    /**
     * Constructor por defecto
     */
    public Temporada() {
    }

    /**
     * Constructor con numero, inicializar el Arraylist
     */
    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    /**
     * getNumeroEpisodios()
     */
    public void getNumeroEpisodios() {
        this.episodios.size();
    }

    /**
     * Añader
     */
    public void addEpisodio(Episodio episodio) {
        episodio.setTemporada(this);
        this.episodios.add(episodio);
    }

    /**
     * Eliminar
     */
    public void delEpisodio(Episodio episodio) {
        this.episodios.remove(episodio);
    }

    /**
     * Getter and setter
     */
    public int getNumero() {
        return numero;
    }

    public Temporada setNumero(int numero) {
        this.numero = numero;
        return this;
    }


    public Temporada setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
        return this;
    }

    public Serie getSerie() {
        return serie;
    }

    public Temporada setSerie(Serie serie) {
        this.serie = serie;
        return this;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Temporada{");
        sb.append("numero=").append(numero);
        sb.append(", serie=").append(serie.getTitulo());//titulo del serie??
        sb.append(", episodios=").append(episodios);
        sb.append('}');
        return sb.toString();
    }
}
