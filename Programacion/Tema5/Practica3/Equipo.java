package Tema5.Practica3;

public abstract class Equipo {

    //atributos
    protected static String nombre;
    protected int nivel;//entre 1 y 100

    //Constructor
    public Equipo(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    //getter and setter


    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Equipo.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 100) {
            this.nivel = nivel;
        }else {
            System.out.println("El nivel no puede ser entre 1 y 100:)");
        }
    }

    //Metodo abstracto
    public abstract int calcularPuntos();


    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }
}
