package Tema4.EjerciciosPracticos.Ejercicio8;

public class Consumo {

    /**
     * . Implementa una clase Consumo, que es parte de la centralita electrónica de un coche, con estas características:
     * - Atributos:
     * - kms. Kilómetros recorridos por el coche.
     * - litros. Litros de combustible consumido.
     * - vmed. Velocidad media.
     * - pgas. Precio de la gasolina.
     * - Métodos:
     * - getTiempo. Indicará el tiempo empleado en realizar el viaje.
     * - consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).
     * - consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
     * - setKms, setLitros, setVmed y setPgas, los cuales podrán modificar los valores de los
     * atributos de la clase.
     * Prueba todo en una clase TestConsumo.
     */


    private int kms;
    private int litros;
    private double vmed;
    private double peso;

    public double getTiempo() {
        if (vmed == 0){
            return 0;
        }
        return kms / vmed;
    }

    public double consumoMedio(){
        if (kms == 0){
            return 0;
        }
        return (litros/(double)kms)*100;//Si no pongo el double me sale la resulta0
    }

    public double consumoEuros(){
        if (kms == 0){
            return 0;
        }
        return (litros/(double)kms)*100*peso;
    }


    public Consumo(int kms, double vmed, int litros, double peso) {
        this.kms = kms;
        this.vmed = vmed;
        this.litros = litros;
        this.peso = peso;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public double getVmed() {
        return vmed;
    }

    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Consumo{");
        sb.append("kms=").append(kms);
        sb.append(", litros=").append(litros);
        sb.append(", vmed=").append(vmed);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }




}
