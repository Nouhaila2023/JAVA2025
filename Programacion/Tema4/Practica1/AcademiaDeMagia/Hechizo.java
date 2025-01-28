package Tema4.Practica1.AcademiaDeMagia;

public class Hechizo {
    private String nombre;
    private int energiaNecesaria;
    private int potencia;

    /*Constructor*/
    public Hechizo(String nombre, int energiaNecesaria, int potencia) {
        this.nombre = nombre;
        this.energiaNecesaria = energiaNecesaria;
        this.potencia = potencia;
    }


    /*Setter and Setter*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    public void setEnergiaNecesaria(int energiaNecesaria) {
        this.energiaNecesaria = energiaNecesaria;
    }

    public int getPotencia() {
        return potencia;
    }


    public void setPotencia(int potencia) {
        this.potencia = potencia;
        if (potencia < 1 || potencia > 10){
            System.out.println("El potencia tiene que estar dentro de 1 y 10");
        }
    }


    /**
     * esEfectivo(Prueba prueba): Compara la potencia del hechizo con el nivel de dificultad de la prueba. Si es
     * mayor o igual, el hechizo es efectivo.
     * @param prueba
     * @return
     */
    public boolean esEfectivo(Prueba prueba){
        if (this.getPotencia() >= prueba.getNivelDificultad()){
            return true ;
        }else {
            return false;
        }
    }


}
