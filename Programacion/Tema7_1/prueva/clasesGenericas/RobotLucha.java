package Tema7_1.prueva.clasesGenericas;

public class RobotLucha extends Robot{

    /**
     * Atributos
     */
    private Integer fuerza;

    public RobotLucha(String nombre, Integer energia, Integer fuerza) {
        super(nombre, energia);
        this.fuerza = fuerza;
    }

}
