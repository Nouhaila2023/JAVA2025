package Tema4.Practica.Arma;

import Tema4.Practica.Personaje.Personaje;

/**
 * 1. Crear una nueva clase Arma
 *
 *     Propiedades:
 *     - nombre de tipo String
 *     - tipo de tipo enum TipoArma
 *     - golpe de tipo Integer
 *
 *     Para crear un enum -> enum TipoArma { ESPADA, MARTILLO, HACHA }
 *
 *     Constructor:
 *     - con todas las propiedades
 *     - vacío sin valores (que tome los valores por defecto) -> dejar en blanco el constructor
 *
 *     Métodos:
 *     - Getter y Setter y toString
 *     - public void golpear(Personaje personaje) {
 *         personaje.setVida(personaje.getVida() - this.golpe);
 *       }
 *
 * 2. Crear una clase TestArma, creando una espada y un martillo
 *    Crear un personaje como en el ejercicio anterior
 *    Golpear con la espada a ese personaje
 *    Pintar la espada, el martillo y el personaje
 */


public class Arma {

    //PROPIEDADES
    public enum  TipoArma {ESPADA, MARTILLO, HACHA};

    private  String nombre;
    private TipoArma tipo;
    private int golpe;

    //Constructor
    public Arma(String nombre, TipoArma tipo, int golpe) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.golpe = golpe;
    }

    //Constructor vacio

    public Arma() {
    }

    //Metodos

    //Get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }

    public int getGolpe() {
        return golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    //to String
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", golpe=").append(golpe);
        sb.append('}');
        return sb.toString();
    }

    //Metodo de golpear
    public void  golpear(Personaje personaje){
        personaje.setVida(personaje.getVida() - this.golpe);
    }



}
