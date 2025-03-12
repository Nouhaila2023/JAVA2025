package Tema6.reservasDeVuelos.servicios;

import Tema6.reservasDeVuelos.entidades.Asiento;
import Tema6.reservasDeVuelos.entidades.Pasajero;
import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;
import Tema6.reservasDeVuelos.entidades.enums.TipoTarifa;

import java.util.ArrayList;
import java.util.UUID;

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
    public ReservaVuelo( Vuelo vuelo, TipoTarifa tipoTarifa, TipoAsiento tipoAsiento) {
        this.id = Long.valueOf(UUID.randomUUID().toString());
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
    public ArrayList<Asiento> getAsientos(){
        ArrayList<Asiento> asientos = new ArrayList<>();
        for (Pasajero p : pasajeros) {
            asientos.add(p.getAsiento());
        }

        return asientos;
    }

    //reservaAsiento
    public boolean reservaAsinto(Pasajero pasajero){
        if (this.getVuelo().verificarDisponiblilidad(this.tipoAsiento) >= 0) {
            Asiento asiento = this.vuelo.buscarAsintosDisponible(this.tipoAsiento);

            Pasajero nuevo = new Pasajero(pasajero);
            this.getVuelo().ocupadoAsinto(asiento, nuevo);
            this.addPasajero(nuevo);

            return true;

        }else {
            System.out.println("No hay asientos disponibles en esta tipo");
            return false;
        }

    }


    public double calcularPrecioTotal(){
        Double precioTotal = 0d;
        for (Asiento asiento : this.getAsientos()){
            if (this.tipoTarifa.equals(TipoTarifa.CONFORT)){
                precioTotal += 1.15 * asiento.calcularPrecio();
            }

            if (this.tipoTarifa.equals(TipoTarifa.OPTIMA)){
                precioTotal += 1.1 * asiento.calcularPrecio();
            }

            if (this.tipoTarifa.equals(TipoTarifa.FLEXIBLE)){
                precioTotal += 1.30 * asiento.calcularPrecio();
            }
        }
        return precioTotal;
    }


    public String imprimirBilletes(){
        StringBuffer sb = new StringBuffer();
        for (Pasajero pasajero :this.getPasajeros()){
            sb.append(pasajero.getDireccion());
            sb.append(" -> ");
            sb.append(pasajero.getAsiento().getCodigo());
            sb.append("\n");
        }

        sb.append("Precio total = ");
        sb.append(this.calcularPrecioTotal());

        return sb.toString();
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
        sb.append("billeter=").append(this.imprimirBilletes());
        sb.append('}');
        return sb.toString();
    }
}
