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

    public void addSuscriptore(Cliente cliente, String dni) {




    }

    public void buscar(String dni){
        for (Cliente cliente : suscriptore) {
            if (cliente.getDni().equals(dni)) {

            }
        }

    }




}
