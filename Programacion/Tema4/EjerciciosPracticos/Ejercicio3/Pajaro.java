package Tema4.EjerciciosPracticos.Ejercicio3;

/**
 * ¿Está correctamente definida la siguiente clase?
 * ¿Compilará o habrá que modificarla para poder
 * generar el fichero class?
 */
public class Pajaro {

    /*public void setedad(int e){edad = e;}
    public void printedad(){System.out.println(edad);}
    public void setcolor(char c){color = c;}
    private int edad;
    private String color;*/

    private int edad;
    private String color;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>0){
            this.edad = edad;
        }else {
            System.out.println("La edad negativa");
            this.edad = 0;
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printedad(){
        System.out.println(edad);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pajaro{");
        sb.append("edad=").append(edad);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
