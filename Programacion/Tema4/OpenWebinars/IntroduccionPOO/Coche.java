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
    //reciver los enformasiones
    public Coche(String marca, String modelo, int anio, int velocidadActual , int litrosEndeposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = velocidadActual;
        this.litrosEndeposito = litrosEndeposito;
    }

    //costroctor que recive solo la marca y el modelo pero el año,
    // velocidaactual y litrosEndeposito se ponen en defectoa 2020 , 0 ,0
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
            //System.out.println("El coche " + modelo + " " + marca + " del año " + anio + " ha arrancado.");
        }else {
            System.out.println("El coche no ha arrancado".formatted(
                    modelo, marca, anio));
        }
    }

//Incrementamos el deposito del coche con el numero de litros indicado

    public double repostar(double cantidad){
        this.litrosEndeposito += cantidad;
        return this.litrosEndeposito;
    }


    public double acelerar(double incrementoVelocidad){
        this.velocidadActual += incrementoVelocidad;
        return this.velocidadActual;
    }

    public double viajar(double km){
        //Comprobamos que el coche puede hacer el viaje
        if (km * 0.07 <= litrosEndeposito){
            double tiempoHora = km / velocidadActual;
            double tiempoSegundo = tiempoHora * 60 * 60;
            this.litrosEndeposito -= km * 0.07;
            System.out.println("Tras el viaje, el deposito ha quedado con:" + litrosEndeposito + " litros");
            return this.litrosEndeposito;
        }else {
            System.out.println("Para poder haver ese viaje debes repostar");
            return  0;
        }

    }

    //set and get
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getLitrosEndeposito() {
        return litrosEndeposito;
    }

    public void setLitrosEndeposito(double litrosEndeposito) {
        this.litrosEndeposito = litrosEndeposito;
    }
}
