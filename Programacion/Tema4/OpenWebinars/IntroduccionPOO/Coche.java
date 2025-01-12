package Tema4.OpenWebinars.IntroduccionPOO;

public class Coche {
//Atributos
    private  String marca;
    private String modelo;
    private int anio;
    private  double velocidadActual;
    private double litrosEndeposito;

    private Coche(){}


    //Constructor
    public Coche(String marca, String modelo, int anio, int velocidadActual , int litrosEndeposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = velocidadActual;
        this.litrosEndeposito = litrosEndeposito;
    }

    public Coche(String marca , String modelo){
        this(marca, modelo, 2020, 0, 0);
    }

    public Coche(String marca ,int anio){
        this(marca, null, anio, 0, 0);
    }
    //metudo arrancar
    public void arrancar(){
        if (this.litrosEndeposito > 0) {
            System.out.println("El coche ha arrancado".formatted(
                    modelo, marca, anio));
        }else {
            System.out.println("El coche no ha arrancado".formatted(
                    modelo, marca, anio));
        }
    }


}
