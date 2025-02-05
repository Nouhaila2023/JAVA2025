package Tema5.EjercicioPOO.Ejercicio2;

import Tema5.Practica.StringBuffer.StringBuffer1;

public class Pssword {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    //Miembros
    private int longitud;
    private String contraseña;

    //Constructores

    //Constructor por defecto
    public Pssword() {
        this.longitud = 8;
        this.contraseña = "";
    }

    /*Un constructor que reciba como parámetro la longitud y que genera una
    contraseña aleatoria con esa longitud.*/



    //- Constructor copia.
    public Pssword (Pssword otraPersona){
        this.longitud = otraPersona.longitud;
        this.contraseña = otraPersona.contraseña;
    }

    //Getter and Setter
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pssword{");
        sb.append("longitud=").append(longitud);
        sb.append(", contraseña='").append(contraseña).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private String generarPassword() {
        StringBuffer sb = new StringBuffer(this.longitud);
        int tipo, valor;

        for (int i = 0; i < this.longitud; i++) {
            tipo = Pssword.numero_aleatorio(4,1);
            switch (tipo){
                case 1:
                    valor = numero_aleatorio(90,65);
                    sb.append((char) valor);
                    break;
                case 2:
                    valor = numero_aleatorio(122,97);
                    sb.append((char) valor);
                    break;
                case 3:
                    valor = numero_aleatorio(57,48);
                    sb.append((char) valor);
                    break;
                case 4:
                    valor = numero_aleatorio(47,33);
                    sb.append((char) valor);
                    break;
            }
        }
        return sb.toString();
    }

}
