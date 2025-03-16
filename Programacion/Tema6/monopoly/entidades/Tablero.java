package Tema6.monopoly.entidades;

import java.util.ArrayList;


public class Tablero {
    /**
     * metodo para generar numero aleatorio
     * @param min
     * @param max
     * @return
     */
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    /**
     * Atributos
     */
    private ArrayList<Casilla> casillas;

    /*public void moverToken(){
        int tirada = numero_aleatorio(1,6);

        for (Casilla c : casillas){
            int mover = c.getPosicion()+tirada;

            /*if (mover<=casillas.size()){
                c.setPosicion(mover);
            }else if (mover>casillas.size()){
                c.setPosicion(1);
           }
       }
    }*/

    public void mover(Propiedad p){
        int tirada = numero_aleatorio(1,6);
        if (!p.getComprada()){

        }

    }


    /**
     * Constructor
     */
    public Tablero() {
        casillas = new ArrayList<>(15);
    }
}
