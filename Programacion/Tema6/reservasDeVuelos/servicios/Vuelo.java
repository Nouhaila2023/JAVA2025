package Tema6.reservasDeVuelos.servicios;

import Tema6.reservasDeVuelos.entidades.Asiento;
import Tema6.reservasDeVuelos.entidades.AsientoBusiness;
import Tema6.reservasDeVuelos.entidades.AsientoTurista;
import Tema6.reservasDeVuelos.entidades.Pasajero;
import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;

public class Vuelo {
    /**
     * Atributos:
     */
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Double precioBase;
    private Integer asientosDisponibles;
    private ArrayList<Asiento> asientos;

    /**
     * Constructor
     */
    public Vuelo(String codigo, String origen, String destino, LocalDate fecha,
                 LocalTime hora, Double precioBase, Integer asientosDisponibles) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precioBase = precioBase;
        this.asientosDisponibles = asientosDisponibles;
        this.asientos = new ArrayList<>();
        //30% Business, 70% Turista
        double asintosBusiness = asientosDisponibles * 0.3;
        for (int i = 0; i < asintosBusiness; i++) {
            Asiento asiento = new AsientoBusiness(1L+i, this.precioBase, 1, "A", true);
            asientos.add(asiento);
        }
        for (int i = (int) asintosBusiness; i < (asientosDisponibles - asintosBusiness); i++) {
            Asiento asiento = new AsientoTurista(11L+i, this.precioBase, 2,"B", false);
            asientos.add(asiento);
        }

    }

    /**
     * Metodos Extra:
     */


    //devuelve el numero de asientos disponible del tipo
    //indicado y que no tiene Pasajero asignado
    //Usamos el getTipo()
    public int verificarDisponiblilidad(TipoAsiento tipoAsiento){
        int cont = 0;

        for (Asiento asiento: asientos){
            if (asiento.getTipo().equals(tipoAsiento) && asiento.getPasajero() == null) {
                cont++;
            }
        }
        return cont;
    }

    //devuelve el primer asiento libre enel vuelo del tipo indicado
    //Usamos el metodo getTipo()
    public Asiento buscarAsintosDisponible(TipoAsiento tipoAsiento){
        for (Asiento asiento: asientos){
            if (asiento.getTipo().equals(tipoAsiento) && asiento.getPasajero() == null){
                return asiento;
            }
        }
        return null;
    }

    //Si ese asiento esta desponible, se pone que el Pasajero tiene
    //Asinto, y que el Asinto es ocupado por el Pasajero
    public boolean ocupadoAsinto(Asiento asiento, Pasajero pasajero){

        for (Asiento asientos : asientos){
            if (asientos.getPasajero().equals(pasajero) && asientos.getPasajero() != null){
                System.out.println("El asiento es ocupado");
                return false;
            }
        }
        pasajero.setAsiento(asiento);
        asiento.setPasajero(pasajero);
        System.out.println("El pasajero " + pasajero.getNombre() + " se ha ocupado el asiento");
        return true;
    }

    //se quita el Pasajero del Asinto, y del Pasajero su Asinto queda null
    //si el asiento tiene pasajero previamente
    public void liblarAsinto(Asiento asiento){

        if (asiento.getPasajero() == null){
            System.out.println("El asiento no puede estar vacio");
        }

        asiento.getPasajero().setAsiento(null);
        asiento.setPasajero(null);
        System.out.println("El asiento es ocupado");
    }

    //devuelve los dias que falta para el vuelo
    public long diasFaltanVuelo() {
        return ChronoUnit.DAYS.between(LocalDate.now(), this.getFecha());
    }

    //devuelve la lista de pasajerod del vuelo
    public ArrayList<Pasajero> getPasajeros() {
        ArrayList<Pasajero> pasajeros = new ArrayList<>();
        for (Asiento asiento : asientos) {
            if (asiento.getPasajero() != null) {
                pasajeros.add(asiento.getPasajero()); // Agregar el pasajero correctamente
                System.out.println("El asiento es ocupado por: " + asiento.getPasajero().getNombre());
            }
        }
        return pasajeros;
    }

    /**
     * Getter Setter
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(Integer asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vuelo{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", origen='").append(origen).append('\'');
        sb.append(", destino='").append(destino).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", asientosDisponibles=").append(asientosDisponibles);
        sb.append(", asientos=").append(asientos);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals del codigoAvion
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codigo, vuelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
