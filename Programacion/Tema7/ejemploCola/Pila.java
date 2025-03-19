package Tema7.ejemploCola;

import java.util.LinkedList;

public class Pila <E>{


    LinkedList<E> elementos;

    /**
     * Constructor
     */
    public Pila() {
        this.elementos = new LinkedList<>();
    }


    /**
     * Push
     */

    public void push(E elemento){
        this.elementos.push(elemento);
    }

    /**
     * pop
     *
     * @return
     */
    public void pop(){
        this.elementos.pop();
    }

    /**
     * peek
     */
    public void peek(){
        this.elementos.peek();
    }





}
