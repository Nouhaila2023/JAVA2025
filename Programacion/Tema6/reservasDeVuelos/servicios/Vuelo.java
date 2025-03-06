package Tema6.reservasDeVuelos.servicios;

import Tema6.reservasDeVuelos.entidades.Asiento;
import Tema6.reservasDeVuelos.entidades.AsientoBusiness;
import Tema6.reservasDeVuelos.entidades.AsientoTurista;
import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;

import java.time.LocalDate;
import java.time.LocalTime;
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
    public Vuelo(String codigo, String origen, String destino, LocalDate fecha, LocalTime hora, Double precioBase, Integer asientosDisponibles) {
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
        for (int i = 0; i < (asientosDisponibles - asintosBusiness); i++) {
            Asiento asiento = new AsientoTurista(11L+i, this.precioBase, 2,"Z", false);
            asientos.add(asiento);
        }

    }

    /**
     * Metodos Extra:
     */


    //
    public int verificarDisponiblilidad(TipoAsiento tipoAsiento){
        int cont = 0;

        for (Asiento asiento: asientos){
            if (asiento.getTipo().equals(tipoAsiento) && asiento.getPasajero() == null) {
                cont++;
            }
        }
        return cont;
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
