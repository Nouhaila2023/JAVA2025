package Tema4.Practica.BladeOfDarkness;

public class Arma {
    /*Propiedades*/
    private String nombre;
    private int puntosD;
    private boolean dosManos;
    enum Tipo {ESPADA, HACHA, BASTON, ARCO};
    private Tipo ipo;

    /*Constructor*/

    public Arma(String nombre, int puntosD, boolean dosManos, Tipo ipo) {
        this.nombre = nombre;
        this.puntosD = puntosD;
        this.dosManos = dosManos;
        this.ipo = ipo;
    }
    /*Getter and setter*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    public boolean isDosManos() {
        return dosManos;
    }

    public void setDosManos(boolean dosManos) {
        this.dosManos = dosManos;
    }

    public Tipo getIpo() {
        return ipo;
    }

    public void setIpo(Tipo ipo) {
        this.ipo = ipo;
    }
    /*toString*/

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", puntosD=").append(puntosD);
        sb.append(", dosManos=").append(dosManos);
        sb.append(", ipo=").append(ipo);
        sb.append('}');
        return sb.toString();
    }
}
