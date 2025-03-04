package Tema6.reservasDeVuelos.entidades;

import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;

public class AsientoBusiness extends Asiento{
    /**
     * Atributos
     */
    private boolean ventana;

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
        this.ventana = ventana;
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

        return precioFinal = (precioBase * 1.25) ;
    }

    /**
     * Getter Setter
     */
    public boolean isVentana() {
        return ventana;
    }

    public AsientoBusiness setVentana(boolean ventana) {
        this.ventana = ventana;
        return this;
    }

    /**
     * toString no estoy segura
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoBusiness{");
        sb.append("id=").append(id);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", tipo=").append(tipo);
        sb.append(", pasajero=").append(pasajero);
        sb.append(", ventana=").append(ventana);
        sb.append('}');
        return sb.toString();
    }
}
