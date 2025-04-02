package Tema7.repasoColecciones.Collections;

public class Carta {

    private String palo;
    private Integer numero;

    public Carta(String palo, Integer numero) {
        this.numero = numero;
        this.palo = palo;

    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carta{");
        sb.append("palo='").append(palo).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }
}
