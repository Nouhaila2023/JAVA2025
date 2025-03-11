package Tema6.reservasDeVuelos.entidades;

import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;

public class AsientoBusiness extends Asiento{
    /**
     * Atributos
     */
    private boolean comida;

    /**
     * Constructor sin pasajero ni tipo asiento
     *
     * @param id
     * @param precioBase
     * @param fila
     * @param letra
     */
    public AsientoBusiness(Long id, double precioBase, Integer fila, String letra, boolean ventana) {
        super(id, precioBase, fila, letra);
        this.comida = ventana;
        this.setTipo(TipoAsiento.BUSINESS);
    }

    /**
     * Metodos extra
     *
     * @return
     */
    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        if (comida){
           return precioBase*1.25 +30;
        }
        return precioFinal = (precioBase * 1.25) ;
    }

    /**
     * Getter Setter
     */
    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }

    /**
     * toString no estoy segura
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoBusiness{");
        sb.append("codigo=").append(this.getCodigo());
        sb.append(", precioBase=").append(this.calcularPrecio());
        sb.append(", tipo=").append(tipo);
        sb.append(", pasajero=").append(this.getPasajero());
        sb.append(", ventana=").append(comida);
        sb.append('}');
        return sb.toString();
    }
}
