package Tema4.Practica.AcademiaDeMagia;

public class Hechizo {

    //Propiedades
    private String nombre;
    private int energiaNecisaria;
    private int potencia;

    //Constructor con todos los parametros
    public Hechizo(String nombre, int energiaNecisaria, int potencia) {
        this.nombre = nombre;
        this.energiaNecisaria = energiaNecisaria;
        this.potencia = potencia;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergiaNecisaria() {
        return energiaNecisaria;
    }

    public void setEnergiaNecisaria(int energiaNecisaria) {
        this.energiaNecisaria = energiaNecisaria;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hechizo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energiaNecisaria=").append(energiaNecisaria);
        sb.append(", potencia=").append(potencia);
        sb.append('}');
        return sb.toString();
    }


    /**
     * esEfectivo(Prueba prueba): Compara la potencia del hechizo con el nivel de dificultad de la prueba. Si es
     * mayor o igual, el hechizo es efectivo.*/
     public boolean esEfectivo(Prueba prueba){
         //IGual
         if (this.potencia >= prueba.getNivelDificultad()){
             return true;
         }
         return false;
     }



}
