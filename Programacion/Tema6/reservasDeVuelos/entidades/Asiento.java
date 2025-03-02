package Tema6.reservasDeVuelos.entidades;

import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;

import java.util.Objects;

public abstract class Asiento {

    /**
     * Atributos
     */
    protected Long id;
    protected Pasajero pasajero;
    protected double precioBase;
    protected Integer fila;
    protected String letra;
    protected TipoAsiento tipo;

    /**
     * Constructor sin pasajero ni tipo asiento
     */
    public Asiento(Long id, double precioBase, Integer fila, String letra) {
        this.id = id;
        this.precioBase = precioBase;
        this.fila = fila;
        this.letra = letra;
        this.pasajero = null;
        this.tipo = null;
    }

    /**
     * Metodos Extra
     */
    public String getCodigo(){
        return fila.toString() + letra.toString();
    }

    public abstract double calcularPrecio();

    /**
     * Getter Setter
     */
    public Long getId() {
        return id;
    }

    public Asiento setId(Long id) {
        this.id = id;
        return this;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Asiento setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
        return this;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Asiento setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
        return this;
    }

    public Integer getFila() {
        return fila;
    }

    public Asiento setFila(Integer fila) {
        this.fila = fila;
        return this;
    }

    public String getLetra() {
        return letra;
    }

    public Asiento setLetra(String letra) {
        this.letra = letra;
        return this;
    }

    public TipoAsiento getTipo() {
        return tipo;
    }

    public Asiento setTipo(TipoAsiento tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asiento{");
        sb.append("id=").append(id);
        sb.append(", pasajero=").append(pasajero);//
        sb.append(", precioBase=").append(precioBase);
        sb.append(", fila=").append(fila);
        sb.append(", letra='").append(letra).append('\'');
        sb.append(", tipo=").append(tipo);//
        sb.append('}');
        return sb.toString();
    }

    /**
     * Equals por id
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return Objects.equals(id, asiento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
