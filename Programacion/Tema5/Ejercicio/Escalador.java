package Tema5.Ejercicio;

public class Escalador extends Ciclista{

    //Escalador: tiene nuevos atributos como aceleración promedio en subida (m/s2) y grado de
    //rampa soportada (grados) (ambos de tipo float).


    //Atributos
    private float aceleracionPromedio;
    private float gradoRampa;

    //Constructor
    public Escalador(int identificador, String nombreCiclista, int tiempoAcumulado, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombreCiclista, tiempoAcumulado);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "";
    }

    //Getter and Setter

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Escalador{");
        sb.append(super.toString());
        sb.append("aceleracionPromedio=").append(aceleracionPromedio);
        sb.append(", gradoRampa=").append(gradoRampa);
        sb.append('}');
        return sb.toString();
    }
}
