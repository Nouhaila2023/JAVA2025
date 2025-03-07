package Tema6.reservasDeVuelos.servicios;

import Tema6.reservasDeVuelos.entidades.Asiento;
import Tema6.reservasDeVuelos.entidades.Pasajero;
import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;
import Tema6.reservasDeVuelos.entidades.enums.TipoTarifa;

import java.util.ArrayList;

public class ReservaVuelo {
    /**
     * Atributos
     */
    private Long id;
    private Vuelo vuelo;
    private ArrayList<Pasajero> pasajeros;
    private TipoTarifa tipoTarifa;
    private TipoAsiento tipoAsiento;

    /**
     * Constructor
     */
    public ReservaVuelo(Long id, Vuelo vuelo, TipoTarifa tipoTarifa, TipoAsiento tipoAsiento) {
        this.id = id;
        this.vuelo = vuelo;
        this.tipoTarifa = tipoTarifa;
        this.tipoAsiento = tipoAsiento;
        this.pasajeros = new ArrayList<>();
    }

    /**
     * Metodos
     */

    //addPasajero
    public void addPasajero(Pasajero pasajero) {
        for (Pasajero p : pasajeros) {
            if (p.equals(pasajero)) {
                System.out.println("El pasajero existe");
            }
            this.pasajeros.add(pasajero);
        }
    }

    //removePasajero
    public void removePasajero(Pasajero pasajero) {
        for (Pasajero p : pasajeros) {
            if (p.equals(pasajero)) {
                pasajeros.remove(pasajero);
            }
            System.out.println("Este pasajero no existe");
        }
    }

    //devuelva los asignados a pasajeros
    public ArrayList<Asiento> asientos(){
        ArrayList<Asiento> asientos = new ArrayList<>();
        for (Pasajero p : pasajeros) {
            System.out.println(p.getAsiento().getId());
            System.out.println(p.getAsiento().getLetra());
            System.out.println(p.getAsiento().getFila());
        }

        return asientos;
    }







    /**
     * Gettter Setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(TipoAsiento tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    /**
     * toString me falta imprimirBilletes
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReservaVuelo{");
        sb.append("id=").append(id);
        sb.append(", vuelo=").append(vuelo.getCodigo());
        sb.append(", dias que falta para el vuelo=").append(vuelo.diasFaltanVuelo());
        sb.append('}');
        return sb.toString();
    }
}
