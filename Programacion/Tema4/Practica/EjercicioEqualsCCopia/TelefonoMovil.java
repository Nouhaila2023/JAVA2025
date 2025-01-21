package Tema4.Practica.EjercicioEqualsCCopia;

import java.util.Objects;

public class TelefonoMovil {
    private String modelo;
    private String numero;
    private String codigoPais;
    private double peso;


    //Constructor con las cuatros propiedades
    public TelefonoMovil(String modelo, double peso, String codigoPais, String numero) {
        this.modelo = modelo;
        this.peso = peso;
        this.codigoPais = codigoPais;
        this.numero = numero;
    }

    //Constructor Copia
    public TelefonoMovil(TelefonoMovil otro) {
        this.modelo = otro.modelo;
        this.numero = otro.numero;
        this.codigoPais = otro.codigoPais;
        this.peso = otro.peso;
    }

    //Get and Set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TelefonoMovil{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", codigoPais='").append(codigoPais).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    //equals que compara los cuatros parametros
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelefonoMovil that = (TelefonoMovil) o;
        return Double.compare(peso, that.peso) == 0 && Objects.equals(modelo, that.modelo) && Objects.equals(numero, that.numero) && Objects.equals(codigoPais, that.codigoPais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, numero, codigoPais, peso);
    }
}
