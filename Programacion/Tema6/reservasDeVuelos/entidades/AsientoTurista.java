package Tema6.reservasDeVuelos.entidades;

import Tema6.reservasDeVuelos.entidades.enums.TipoAsiento;

public class AsientoTurista extends Asiento {
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
    public AsientoTurista(Long id, double precioBase, Integer fila, String letra, boolean ventana) {
        super(id, precioBase, fila, letra);
        this.ventana = ventana;
        this.tipo = TipoAsiento.TURISTA;
    }

    /**
     * Metodos Extra:
     * el metodo devuelva el presio
     * si es ventana sumamos 10 al precio
     */
    @Override
    public double calcularPrecio() {
        if (ventana) {
            return precioBase + 10;
        }
        return precioBase;
    }

    /**
     * Getter Setter
     * @return
     */
    public boolean isVentana() {
        return ventana;
    }

    public AsientoTurista setVentana(boolean ventana) {
        this.ventana = ventana;
        return this;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoTurista{");
        sb.append("codigo=").append(this.getCodigo());
        sb.append(", precioBase=").append(this.calcularPrecio());
        sb.append(", tipo=").append(tipo);
        sb.append(", ventana=").append(ventana);
        sb.append(", pasajero=").append(this.getPasajero().getDniPasaporte());
        sb.append('}');
        return sb.toString();
    }



}
