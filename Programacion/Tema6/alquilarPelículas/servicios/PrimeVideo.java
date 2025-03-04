package Tema6.alquilarPelículas.servicios;
import Tema6.alquilarPelículas.entidades.Cliente;
import Tema6.alquilarPelículas.entidades.Multimedia;

import java.util.ArrayList;

public class PrimeVideo {

    /**
     * Atributos
     */
    private ArrayList<Multimedia> catalogo;
    private ArrayList<Cliente> suscriptores;
    private double ganancia;//ربح

    /**
     * Constructor
     */
    public PrimeVideo(double ganancia) {
        this.catalogo = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
        this.ganancia = 0.0;
    }

    public PrimeVideo() {
    }

    /**
     * Añadir una suscriptor, si no estaba ya
     */
    public void addSuscriptor(Cliente cliente) {
        if (!suscriptores.contains(cliente)) {
            suscriptores.add(cliente);
        }else {
            System.out.println("Ya existe suscriptor");
        }
    }

    /**
     * Añadir una pelicula al catologo, si no estab ya
     */
    public void addCatalogo(Multimedia multimedia) {
        if (!catalogo.contains(multimedia)) {
            catalogo.add(multimedia);
        }else {
            System.out.println("Ya existe suscriptor");
        }
    }

    /**
     * si el cliente no es por se añade a ganancias el precio del Multimedia
     */

    public void ver(Multimedia m, Cliente c){
        if (m.isPlus()){
            if (!c.esPro()){
                ganancia += m.getPrecio();
            }
        }
    }

    /**
     * devuelve las ganancia.
     * A las ganancias generadas cuando los clientes ven multimedia
     * hay que sumarle las ganancias de los todos los suscriptores que hay
     * (multiplicados por 12)
     */
    public double getGanancia() {
        for (Cliente c : suscriptores) {
            ganancia += c.getPrecioMensual()*12;
        }
        return ganancia;
    }

    /**
     * Get
     */

    public ArrayList<Multimedia> getCatalogo() {
        return catalogo;
    }

    public ArrayList<Cliente> getSuscriptores() {
        return suscriptores;
    }
}
