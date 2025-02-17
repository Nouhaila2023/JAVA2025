package Tema4.Practica1.BladeOfDarkess;

public class Arma {

    private String nombre;
    private int puntpsD;//Puntod de daño
    private boolean dosManos;

    public Arma() {

    }

    public enum tipo {Espada, Hacha, Baston, Arco};
    private tipo tipoArco;


    public Arma(String nombre, int puntpsD, boolean dosManos, tipo tipoArco) {
        this.nombre = nombre;
        this.puntpsD = puntpsD;
        this.dosManos = dosManos;
        this.tipoArco = tipoArco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntpsD() {
        return puntpsD;
    }

    public void setPuntpsD(int puntpsD) {
        this.puntpsD = puntpsD;
    }

    public boolean isDosManos() {
        return dosManos;
    }

    public void setDosManos(boolean dosManos) {
        this.dosManos = dosManos;
    }

    public tipo getTipoArco() {
        return tipoArco;
    }

    public void setTipoArco(tipo tipoArco) {
        this.tipoArco = tipoArco;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", puntpsD=").append(puntpsD);
        sb.append(", dosManos=").append(dosManos);
        sb.append(", tipoArco=").append(tipoArco);
        sb.append('}');
        return sb.toString();
    }
}
