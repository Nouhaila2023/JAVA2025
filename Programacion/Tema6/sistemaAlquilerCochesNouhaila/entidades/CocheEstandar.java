package Tema6.sistemaAlquilerCochesNouhaila.entidades;

import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCoche;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCombustible;

public class CocheEstandar extends Coche {

    /**
     * Atributos
     */
    private boolean aireAcondicionado;

    /**
     * Constructor
     *
     * @param id
     * @param marca
     * @param modelo
     * @param matricula
     * @param anio
     * @param combustible
     * @param coche
     * @param precioBase
     */
    public CocheEstandar(Long id, String marca, String modelo, String matricula, int anio, TipoCombustible combustible,
                         TipoCoche coche, Double precioBase, boolean aireAcondicionado) {
        super(id, marca, modelo, matricula, anio, combustible, coche, precioBase);
        this.aireAcondicionado = aireAcondicionado;
        tipos(coche);

    }

    /**
     * Establezca el tipo de Coche en SEDAN o SUV
     * @param tipo
     */
    public void tipos(TipoCoche tipo){
        if (TipoCoche.SEDAN.equals(tipo) || TipoCoche.SUV.equals(tipo));
    }

    /**
     * Colcular el precio
     * 1: devuelve le precio base * dias
     * 2:Suma 5€ si quiere el aire
     * @param dias
     * @return
     */
    @Override
    public double calcularPrecioAlquiler(int dias) {

        double total = 0;
        if (aireAcondicionado){
            total = (precioBase * dias) + (dias * 5);
            return  total;
        }
        return getPrecioBase() * dias;
    }


    /**
     * Getter Setter
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }



    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CocheEstandar{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", coche=").append(coche);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append(", aireAcondicionado=").append(aireAcondicionado);
        sb.append('}');
        return sb.toString();
    }


}
