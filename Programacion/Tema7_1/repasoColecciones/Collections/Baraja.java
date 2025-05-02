package Tema7_1.repasoColecciones.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    //Numeros: A 2,3,4,5,6,7,8,9,J,Q,K
    //Palos: Dimantes, Corazones, DTraboles, Picas
    private ArrayList<Carta> cartas;

    public Baraja() {

        this.cartas = new ArrayList<>();

        //Añadir cartas
        for (int i = 0; i < 12; i++) {
            this.cartas.add(new Carta("Dimantes", i));
            this.cartas.add(new Carta("Corazones", i));
            this.cartas.add(new Carta("Traboles", i));
            this.cartas.add(new Carta("Picas", i));
        }
        //Para mesclal
        Collections.shuffle(cartas);
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Baraja{");
        sb.append("cartas\n=");
        for (Carta c : cartas){
            switch (c.getNumero()){
                case 1:
                    System.out.println("As de"+ c.getPalo());
                    break;
                case 2,3,4,5,6,7,8,9:
                    sb.append(c.getNumero() + " de " + c.getNumero()).append("\n");
                    break;
                case 10:
                    System.out.println("Jota de " + c.getNumero());
                case 11:
                    System.out.println("Dama de "+ c.getPalo());
                    break;
                case 12:
                    System.out.println("Rey de "+ c.getPalo());
                    break;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Carta sacarAriba(){
        return this.cartas.removeFirst();
    }

    public Carta sacarAbajo(){
        return this.cartas.removeLast();
    }


    public  void bajar(){
        Collections.shuffle(cartas);
    }

    public void ordenar(){
        //Collections.sort(Comparator.comparing(Carta::getPalo));
    }



}




















