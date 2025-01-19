package Tema4.EjerciciosPracticos.Ejercicio2;

public class Coche {

    private int velocidad; //Atributo

    Coche(){
        velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelera(int mas){
        velocidad += mas;
    }


    public void frena(int menos){
        velocidad -= menos;

        if (velocidad < 0 ){
            velocidad = 0; //Para no sea negativa
        }
    }




}
