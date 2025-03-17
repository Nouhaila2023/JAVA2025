package Tema6.sistemaAlquilerCochesNouhaila.entidades;

import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCoche;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCombustible;

import java.util.Objects;

public abstract class Coche {

    /**
     * Atributos
     */

    protected Long id;
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected int anio;
    protected TipoCombustible combustible;
    protected TipoCoche coche;
    protected Double precioBase;
    protected boolean disponible;

    /**
     * Constructor
     */
    public Coche(Long id, String marca, String modelo, String matricula, int anio, TipoCombustible combustible, TipoCoche coche, Double precioBase) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = anio;
        this.combustible = combustible;
        this.coche = coche;
        this.precioBase = precioBase;
        this.disponible = true;
    }


    /**
     * Metodo abstracta
     */
    public abstract double calcularPrecioAlquiler(int dias);


    /**
     * Getter Setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoCoche getCoche() {
        return coche;
    }

    public void setCoche(TipoCoche coche) {
        this.coche = coche;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * toString
     */

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Coche{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", coche=").append(coche);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals con el id
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(id, coche.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
