package Tema7.corsoGenericosColecciones.recordsEnums.records.ejercicio2;

public class Libro {
    private LibroR[] libros;
    private int cantidadLibros;

    public Libro( int cantidadLibros) {
        this.libros = new LibroR[cantidadLibros];
        this.cantidadLibros = 0;
    }
}
