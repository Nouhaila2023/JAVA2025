package Tema6.reservasDeVuelos.servicios;

import Tema6.reservasDeVuelos.entidades.Asiento;
import Tema6.reservasDeVuelos.entidades.Pasajero;
import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;
import Tema6.reservasDeVuelos.entidades.enums.TipoTarifa;

import java.util.ArrayList;

public class Atrapame {
    /**
     * Atributos
     */
    private ArrayList<Vuelo> vuelos;
    private ArrayList<ReservaVuelo> reservaVuelos;
    /**
     * Constructor
     */
    public Atrapame() {
        this.vuelos = new ArrayList<>();
        this.reservaVuelos = new ArrayList<>();
    }

    /**
     * getVuelos, getReservas
     */
    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public ArrayList<ReservaVuelo> getReservaVuelos() {
        return reservaVuelos;
    }

    /**
     * Metodos
     */

    //Añadir un vuelo a la colección
    public void addVuelo(Vuelo vuelo){
        this.vuelos.add(vuelo);
    }

    //
    public boolean crearReserva(Vuelo vuelo, ArrayList<Pasajero> pasajeros, TipoTarifa tipoTarifa, TipoAsiento tipoAsiento){



        return false;
    }




}
