package Tema7_1.prueva.clasesGenericas;

public class RobotCarrera extends Robot{

    /**
     * Atributos
     */
    private Integer velocidad;


    public RobotCarrera(String nombre, Integer energia, Integer velocidad) {
        super(nombre, energia);
        this.velocidad = velocidad;
    }
}
