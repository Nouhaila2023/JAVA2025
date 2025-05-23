package Tema5.Practica2.Ejercicio1;

import Tema5.Practica2.Ejercicio1.enums.TipoMonstruo;

public class MonstruoFinalNivel extends Monstruo{

    // Propiedades
    private int golpeEspecial;
    private int usosGolpeEspecial =3;


    //Construres
    public MonstruoFinalNivel(String nombre, int puntosD, TipoMonstruo tipo) {
        super(nombre, puntosD, tipo);
    }

    // Getters y Setters
    public int getGolpeEspecial() {
        return golpeEspecial;
    }

    public void setGolpeEspecial(int golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    public int getUsosGolpeEspecial() {
        return usosGolpeEspecial;
    }

    public void setUsosGolpeEspecial(int usosGolpeEspecial) {
        this.usosGolpeEspecial = usosGolpeEspecial;
    }

    // toString


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MonstruoFinalNivel{");
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append("salud=").append(salud);
        sb.append(", nivel=").append(nivel);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", usosGolpeEspecial=").append(usosGolpeEspecial);
        sb.append(", golpeEspecial=").append(golpeEspecial);
        sb.append('}');
        return sb.toString();
    }



    @Override
    public void golpear(Personaje personaje) {
        if (this.usosGolpeEspecial > 0){
            personaje.reducirVida(this.golpeEspecial);
            this.usosGolpeEspecial--;
        }else {
            super.golpear(personaje);
            System.out.print("No te quedan golpes especiales");
        }

    }
}
