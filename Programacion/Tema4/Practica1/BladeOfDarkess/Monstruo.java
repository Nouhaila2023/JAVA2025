package Tema4.Practica1.BladeOfDarkess;

public class Monstruo {
    private String nombre;
    private int nivel = 1;
    private int salud = 100;
    private int puntosD; //Puntos de daño que el monstruo al golpear
    enum Tipo {Goblin, Troll, Skall, Demonio, Fantasma};
    private Tipo tipo;

    /// //////////METODOS/////////////////////////

    //Construres
    public Monstruo(Tipo tipo, int puntosD, String nombre) {
        this.tipo = tipo;
        this.puntosD = puntosD;
        this.nombre = nombre;
    }
    /////////Get and Set /////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    ///////////////toString////////////////////////
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
}
