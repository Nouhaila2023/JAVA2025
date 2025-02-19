package Tema5.Practica3;

public class EquipoMOBA extends Equipo{

    //Atributo
    private int estrategia; //entre 1 y 5

    //Constructor
    public EquipoMOBA(String nombre, int nivel, int estrategia) {
        super(nombre, nivel);
        this.estrategia = estrategia;
    }

    //getter and setter
    public int getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(int estrategia) {
        if (estrategia >= 0 && estrategia <= 5) {
            this.estrategia = estrategia;
        }else {
            System.out.println("El estrategia no es valido debe estar entre 1y5:)");
        }

    }

    //Sobrescribe calcularPuntos() para devolver: nivel * estrategia.
    @Override
    public int calcularPuntos() {
        return nivel*estrategia;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EquipoMOBA{");
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append("estrategia=").append(estrategia);
        sb.append('}');
        return sb.toString();
    }
}
