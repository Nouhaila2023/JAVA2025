package Tema7.prueva.clasesGenericas;

public class Test {
    public static void main(String[] args) {

        // Liga de lucha
        Generica<RobotLucha> ligaLucha = new Generica<>("Liga de Lucha");
        RobotLucha r1 = new RobotLucha("Titan", 100, 80);
        RobotLucha r2 = new RobotLucha("Destructor", 90, 95);
        RobotLucha r3 = new RobotLucha("Titan", 100, 80); // mismo nombre que r1

        ligaLucha.add(r1);
        ligaLucha.add(r2);
        ligaLucha.add(r3); // no debería añadirse porque ya existe

        System.out.println("Participantes de " + ligaLucha.getNombre() + ":");
        ligaLucha.mostrar();

        System.out.println();

        // Liga de carrera
        Generica<RobotCarrera> ligaCarrera = new Generica<>("Liga de Carrera");
        RobotCarrera c1 = new RobotCarrera("Speedy", 85, 120);
        RobotCarrera c2 = new RobotCarrera("FlashBot", 75, 110);

        ligaCarrera.add(c1);
        ligaCarrera.add(c2);

        System.out.println("Participantes de " + ligaCarrera.getNombre() + ":");
        ligaCarrera.mostrar();

    }
}
