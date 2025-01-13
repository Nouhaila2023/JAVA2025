package Tema4.EjerciciosPracticos.Ejercicio2;

public class Coche {

    private int velocidad; //Atributo

    Coche(){
        velocidad = 0;
    }

    //Int getVelocidad(). Este metodo devuelve ña velocidad actual.
    public int getVelocidad() {
        return velocidad;
    }

   //Void acelera(int mas). este metodo actualiza la velocidad a mas km mas (suma).

    public void acelera(int mas){
        velocidad += mas;
    }

    //Void frena(int menos). Este metodo actualiza la velocidad a menos km menos (restar).

    public void frena(int menos){
        velocidad -= menos;

        if (velocidad < 0 ){
            velocidad = 0; //Para no sea negativa
        }
    }




}
