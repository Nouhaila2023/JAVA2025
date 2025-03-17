package Tema6.sistemaAlquilerCochesNouhaila.entidades;

import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCoche;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCombustible;

public class CochePremium extends Coche{

    /**
     * Atributos
     */
    private boolean gps;
    private boolean seguroExtra;


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
    public CochePremium(Long id, String marca, String modelo, String matricula, int anio,
                        TipoCombustible combustible, TipoCoche coche, Double precioBase,
                        boolean gps, boolean seguroExtra) {
        super(id, marca, modelo, matricula, anio, combustible, coche, precioBase);
        this.gps = true;
        this.seguroExtra = true;
        tipos(coche);
    }

    /**
     * Establezca el tipo de Coche en DEPORTIVO o FURGONETA
     * @param tipo
     */
    public void tipos(TipoCoche tipo){
        if (TipoCoche.DEPORTIVO.equals(tipo) || TipoCoche.FURGONETA.equals(tipo));
    }


    /**
     * Precio Bace * dias incrementado en un 0.2
     * gps + 10€
     * seguro extra + 15€
     * @param dias
     * @return
     */
    @Override
    public double calcularPrecioAlquiler(int dias) {
        double total = (precioBase * dias * 0.2) ;
        if (gps){
            total += 10 ;
        } else if (seguroExtra) {
            total *= 15;
        }
        return total;
    }


    /**
     * Getter Setter
     */
    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isSeguroExtra() {
        return seguroExtra;
    }

    public void setSeguroExtra(boolean seguroExtra) {
        this.seguroExtra = seguroExtra;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CochePremium{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", coche=").append(coche);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append(", gps=").append(gps);
        sb.append(", seguroExtra=").append(seguroExtra);
        sb.append('}');
        return sb.toString();
    }


}
