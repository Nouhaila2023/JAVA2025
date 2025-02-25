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
        for (Cliente c : suscriptore){
            if (!(c.getDni().equals(cliente.dni))){
                suscriptore.add(c);
            }else {
                System.out.println("No pudemos añadir esta cliente -> {Ya lo tenemos}");
            }
        }
    }

    public void buscar(String dni){
        for (Cliente cliente : suscriptore) {
            if (cliente.getDni().equals(dni)) {

            }
        }

    }

    /**
     * Método añade una película al catálogo, si no estaba ya
     */

    public void addMultimedia(Multimedia multimedia){





    }






}
