package Tema5.EjercicioPOO.Ejercicio2;

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
}
