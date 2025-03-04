package Tema6.ejercicioClasePoo_2ev.servicios;

import Tema6.ejercicioClasePoo_2ev.entidades.Comic;
import Tema6.ejercicioClasePoo_2ev.entidades.Venta;

import java.util.ArrayList;

public class TiendaComics {

    /**
     * Atributos
     */
    private ArrayList<Comic> comics;
    private ArrayList<Venta> ventas;


    /**
     *Constructor
     */
    public TiendaComics() {
    }


    /**
     * Metodos
     */

    public void addComic(Comic c){
        c.setTiendaComics(this);
        this.comics.add(c);
    }

    public void removeComic(Comic c){
        c.setTiendaComics(null);
        this.comics.remove(c);
    }

    public void listarComics(){
        for (Comic c : comics){
            System.out.println(c);
        }
    }


    public void addVenta( Venta v){
        v.setVenta(this);
        this.ventas.add(v);
    }

    public void listarVenta(){
        for (Venta v : ventas){
            System.out.println(v);
        }
    }



    /**
     * Getter
     */
    public ArrayList<Comic> getComics() {
        return comics;
    }


    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TiendaComics{");
        sb.append("comics=").append(comics);
        sb.append('}');
        return sb.toString();
    }
}
