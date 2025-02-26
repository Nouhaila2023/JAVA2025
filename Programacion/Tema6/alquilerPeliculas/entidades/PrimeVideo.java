package Tema6.alquilerPeliculas.entidades;

import java.util.ArrayList;

public class PrimeVideo {

    /**
     * Atributos
     */
    private ArrayList<Multimedia> catalogo;
    private ArrayList<Cliente> suscriptore;
    private double genancias;

    /**
     * Constructor
     */
    public PrimeVideo() {
        this.genancias = 0;
    }

    /**
     * Añadir un Cliente
     */

    public void addSuscriptore(Cliente cliente) {

            if (!suscriptore.contains(cliente)){
                suscriptore.add(cliente);
            }else {
                System.out.println("No pudemos añadir esta cliente -> {Ya lo tenemos}");
            }

    }

    /**
     * Método añade una película al catálogo, si no estaba ya
     */

    public void addMultimedia(Multimedia multimedia){

        if(!catalogo.contains(multimedia)){
            catalogo.add(multimedia);
        }else {
            System.out.println("No pudemos añadir la multimedia");
        }

    }


    public void ver(Multimedia m, Cliente c){
        if (c.esPro()){
            this.genancias += m.getPrecio();
        }
    }

    /**
     *
     */

    public double getGenancias(){

        for (Cliente c : suscriptore){
            genancias += c.precioMensual * 12;
        }

        return genancias;
    }






}
