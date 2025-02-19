package Tema5.Practica3;

public class EquipoFPS extends Equipo{

    //atributos
    private int punteria; //entre 1 y 10

    //Constructor
    public EquipoFPS(String nombre, int nivel, int punteria) {
        super(nombre, nivel);
        this.punteria = punteria;
    }

    //getter and setter
    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        if (punteria >= 1 && punteria <= 10) {
            this.punteria = punteria;
        } else {
            System.out.println("El punteria debe ser entre 1 y 10");
        }
    }

    /*Sobrescribe calcularPuntos() para devolver: nivel +(punteria * 5).*/
    @Override
    public int calcularPuntos() {
        return nivel+(punteria*5);
    }


    //toString


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EquipoFPS{");
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append("punteria=").append(punteria);
        sb.append('}');
        return sb.toString();
    }
}
