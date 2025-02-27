package Tema6.alquilarPelículas.entidades1;

import Tema6.alquilarPelículas.entidades.Multimedia;
import Tema6.alquilarPelículas.entidades.enum_.Genero;

import java.util.ArrayList;

public class Serie extends Multimedia {
    /**
     * Atributos
     */
    private ArrayList<Temporada> temporadas;

    /**
     * Constructor
     */
    public Serie(Long codigo, String titulo, double precio, boolean plus, Genero genero) {
        super(codigo, titulo, precio, plus, genero);
        this.temporadas = new ArrayList<>();
    }

    /**
     * getNumeroTemporada()
     */
    public int getNumeroTemporadas() {
        return temporadas.size();
    }


    /**
     * Añader temporada al serie
     */
    public void addTemporada(Temporada temporada) {
        //me falta algo no estoy segura de este
        temporada.setSerie(this); //asignar el serie al temporada
        temporadas.add(temporada);
    }

    /**
     *Eliminar
     */
    public void delTemporada(Temporada temporada) {
        temporadas.remove(temporada);
    }



    /**
     * Getter and Setter
     */
    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public Serie setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Serie{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append(", temporadas=").append(temporadas);
        sb.append('}');
        return sb.toString();
    }
}
