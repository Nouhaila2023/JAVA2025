package Tema7.corsoGenericosColecciones.genericos.practica.ejercicio2;

import java.util.Arrays;

public class Vector <T>{
    /**
     * Atributos
     */
    private T[] elements;
    private int size;

    /**
     * Constructor con tamaño 10
     */
    public Vector() {
        this(10);
    }

    /**
     * Otro con la capacidad inicial del vector
     */
    public Vector(int i) {
        if (i<0){
            i=10;
        }
        elements = (T[]) new Object[i];
        size = 0;
    }


    /**
     * añadir
     */
    public void add(T element) {
        if (size==elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    /**
     * eleminar
     */
    public void remove(int element) {
        if (element < size && element >= 0) {
            for (int i = element; i < size -1 ; i++) {
                elements[i] = elements[i+1];
            }
            elements[size - 1] = null;
            size--;
        }
    }

    /**
     * emplementar eñ metodo get
     */
    public T get(int element) {
        if (element < size && element >= 0) {
           return elements[element];
        }
        return null;
    }


    public int size() {
        return size;
    }






}
