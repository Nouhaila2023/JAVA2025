package Tema6.reservasDeVuelos.servicios;

import Tema6.reservasDeVuelos.entidades.Asiento;
import Tema6.reservasDeVuelos.entidades.Pasajero;
import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;
import Tema6.reservasDeVuelos.entidades.enums.TipoTarifa;

import java.time.LocalDate;
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
        if (vuelo.verificarDisponiblilidad(tipoAsiento) >= pasajeros.size()){
            ReservaVuelo reservaVuelo = new ReservaVuelo(vuelo, tipoTarifa, tipoAsiento);
            for (Pasajero pasajero : pasajeros) {
                reservaVuelo.reservaAsinto(pasajero);
            }
            this.reservaVuelos.add(reservaVuelo);
            return true;
        }else {
            return false;
        }
    }
    public void cancelarReserva(String id) {
        for(ReservaVuelo reserva: this.reservaVuelos) {
            if (reserva.getId().equals(id)) {
                //Liberar asientos del vuelo
                for(Asiento asiento: reserva.getAsientos()) {
                    reserva.getVuelo().liblarAsinto(asiento);
                }

                this.reservaVuelos.remove(reserva); //A partir de la versión 21 de Java
                break;
            }
        }
    }

    public ArrayList<Vuelo> buscarVuelos(String destino) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getDestino().equalsIgnoreCase(destino)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getFecha().equals(fecha)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha, String destino) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getFecha().equals(fecha) &&
                    vuelo.getDestino().equalsIgnoreCase(destino)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    public ArrayList<ReservaVuelo> buscarReservas(String dni) {
        ArrayList<ReservaVuelo> reservasFound = new ArrayList<>();
        for (ReservaVuelo reserva : this.reservaVuelos) {
            Pasajero ps = new Pasajero();
            ps.setDniPasaporte(dni);
            if (reserva.getPasajeros().contains(ps)) {
                reservasFound.add(reserva);
            }
        }

        return reservasFound;
    }



    }
