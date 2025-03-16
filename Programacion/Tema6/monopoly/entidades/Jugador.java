package Tema6.monopoly.entidades;

import java.util.ArrayList;

public class Jugador {

    /**
     * Atributos:
     */
    private String nombre;
    private Casilla token;
    private Double cantidadDinero;
    private ArrayList<Propiedad> propiedades;

    /**
     * Constructor
     */
    public Jugador(String nombre,Casilla token) {
        this.token = token;
        this.cantidadDinero = 100.0;
        this.propiedades = new ArrayList<>();
        this.nombre = nombre;
    }
    
    public void comprar(Propiedad propiedade) {
        if(cantidadDinero >= propiedade.getPrecioCompra()){
            this.propiedades.add(propiedade);
            this.cantidadDinero -= propiedade.getPrecioCompra();
            propiedade.setConprada(true);
            System.out.println(nombre + " compró " + propiedade.getNombre());
        }
        
    }



    /**
     * Getter Setter
     */
    public Casilla getToken() {
        return token;
    }

    public Jugador setToken(Casilla token) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nomre=").append(nombre);
        sb.append(", token=").append(token);
        sb.append(", cantidadDinero=").append(cantidadDinero);
        sb.append(", propiedades=").append(propiedades);
        sb.append('}');
        return sb.toString();
    }
}
