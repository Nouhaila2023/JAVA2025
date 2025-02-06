package Tema5.EjercicioPOO.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    //array (ArrayList) de 1000
    private ArrayList<Libro> libros;

    //constructor para el arrayList

    public Libreria(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    //El metodo adquirir asignará
    //un precio_compra al libro y lo añadirá a la librerí

    public void adquirir (Libro libro, double precioCompra){
        if (libro. <  100){
            libro.setPrecio_compra(precioCompra);
            libro.add(libro);
        }
    }


}
