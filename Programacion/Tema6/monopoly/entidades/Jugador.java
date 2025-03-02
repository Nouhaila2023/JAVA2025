package Tema6.monopoly.entidades;

import Tema6.monopoly.entidades.enum_.Token;

import java.util.ArrayList;

public class Jugador {

    /**
     * Atributos:
     */
    private Token token;
    private double cantidadDinero;
    private ArrayList<Propiedad> propiedades;

    /**
     * Constructor
     */
    public Jugador(Token token, double cantidadDinero) {
        this.token = token;
        this.cantidadDinero = cantidadDinero;
        this.propiedades = new ArrayList<>();
    }

    /**
     * Getter Setter
     */
    public Token getToken() {
        return token;
    }

    public Jugador setToken(Token token) {
        this.token = token;
        return this;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public Jugador setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
        return this;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("token=").append(token);
        sb.append(", cantidadDinero=").append(cantidadDinero);
        sb.append(", propiedades=").append(propiedades);
        sb.append('}');
        return sb.toString();
    }
}
