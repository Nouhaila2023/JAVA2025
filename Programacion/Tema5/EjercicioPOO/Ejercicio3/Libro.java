package Tema5.EjercicioPOO.Ejercicio3;

public class Libro {

    //miembros
    private String titulo;
    private String ISBN;//10 digitos
    private String autor;
    private int numero_paginas;
    //Los dos precios se ponen en 0
    private double precio_compra = 0.0;
    private double precio_venta = 0.0;
    private boolean vendido;

    //Constructor

    public Libro(String titulo, String ISBN, String autor, int numero_paginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.numero_paginas = numero_paginas;
    }

    //Metodos

    //Metodo para el ISBN digito de 10
    private boolean esValido(String isbn){
        //No tiene que estar null o menor o mayor de 10 numeros
        if(isbn == null || isbn.length() != 10){
            return false;
        }else {
            //si no
            for (char numISBN : isbn.toCharArray()) {
                //EL character.isDigito() para estar solo numero entre 0 y 9
                if(!Character.isDigit(numISBN)){
                    return false;
                }
            }
            return true;
        }
    }

    //Getter and Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
        if (esValido(ISBN)){
            this.ISBN = ISBN;
        }else {
        System.out.println("El ISBN no es valido");
        }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libro{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", ISBN=").append(ISBN);
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", numero_paginas=").append(numero_paginas);
        sb.append(", precio_compra=").append(precio_compra);
        sb.append(", precio_venta=").append(precio_venta);
        sb.append(", vendido=").append(vendido);
        sb.append('}');
        return sb.toString();
    }
}
