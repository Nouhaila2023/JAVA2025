package Tema7_3.practica3Fincas.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Lectura {
    /**
     * Atributos
     */
    private int id;
    private double temperatura;
    private double humedad;
    private LocalDateTime momento;
    private Finca finca;


    /**
     * Constructor
     * @param id
     * @param temperatura
     * @param humedad
     * @param momento
     * @param finca
     */
    public Lectura(int id, double temperatura, double humedad, LocalDateTime momento, Finca finca) {
        this.id = id;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.momento = momento;
        this.finca = finca;
    }

    /**
     * Getter and Setter
     */
    public int getId() {
        return id;
    }

    public Lectura setId(int id) {
        this.id = id;
        return this;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public Lectura setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        return this;
    }

    public double getHumedad() {
        return humedad;
    }

    public Lectura setHumedad(double humedad) {
        this.humedad = humedad;
        return this;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public Lectura setMomento(LocalDateTime momento) {
        this.momento = momento;
        return this;
    }

    public Finca getFinca() {
        return finca;
    }




    /**
     * toStirng
     */
    @Override
    public String toString() {
        return id + "," + temperatura + "," + humedad + "," + momento + "," + finca.getId();
    }

    /**
     * equals con id
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lectura lectura = (Lectura) o;
        return id == lectura.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
