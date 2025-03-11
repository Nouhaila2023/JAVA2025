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

        if (pasajeros.contains(pasajero)) {
            System.out.println("El pasajero existe");
            return;
        }
        this.pasajeros.add(pasajero);

    }

    //removePasajero
    public void removePasajero(Pasajero pasajero) {

       if (pasajeros.contains(pasajero)) {
           pasajeros.remove(pasajero);
       }
       System.out.println("Este pasajero no existe");

    }

    //devuelva los asignados a pasajeros
    public ArrayList<Asiento> asientos(){
        ArrayList<Asiento> asientos = new ArrayList<>();
        for (Pasajero p : pasajeros) {
            if(p.getAsiento() != null) {
                asientos.add(p.getAsiento());
            }
        }

        return asientos;
    }

    //reservaAsiento
    public void reservaAsinto(Pasajero pasajero){
        if (vuelo.verificarDisponiblilidad(tipoAsiento) <= 0) {
            Asiento asiento = vuelo.buscarAsintosDisponible(tipoAsiento);
            if (asiento != null) {
                Pasajero pasajero1 = new Pasajero(pasajero);
                vuelo.ocupadoAsinto(asiento, pasajero1);
                pasajeros.add(pasajero1);
                System.out.println("Reserva correctamente:");
                System.out.println("Nombre: " + pasajero1.getNombre());
                System.out.println("Asinto:" + pasajero1.getAsiento());
            }
        }else {
            System.out.println("No hay asientos disponibles en esta tipo");
        }


    }
    public void reservaAsiento(Pasajero pasajero) {
        // Verificar si hay disponibilidad de asientos del tipo indicado
        if (vuelo.verificarDisponiblilidad(tipoAsiento) > 0) {
            // Buscar un asiento libre del tipo solicitado
            Asiento asientoDisponible = vuelo.buscarAsintosDisponible(tipoAsiento);

            if (asientoDisponible != null) {
                // Clonar el pasajero usando su constructor copia
                Pasajero pasajeroClonado = new Pasajero(pasajero);

                // Ocupar el asiento con el pasajero clonado
                vuelo.ocupadoAsinto(asientoDisponible, pasajeroClonado);

                // Agregar el pasajero clonado a la lista de la reserva
                pasajeros.add(pasajeroClonado);

                System.out.println("Reserva realizada con éxito. Pasajero: " + pasajeroClonado.getNombre() +
                        ", Asiento: " + asientoDisponible.getCodigo());
            } else {
                System.out.println("No hay asientos disponibles del tipo solicitado.");
            }
        } else {
            System.out.println("No hay disponibilidad de asientos del tipo " + tipoAsiento);
        }
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
