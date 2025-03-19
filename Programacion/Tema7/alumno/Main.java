package Tema7.alumno;

public class Main {
    public static void main(String[] args) {

        Aula aula = new Aula("Aula1", "Clase", "ambas");
        Alumno alumno1 = new Alumno("1", "alumno1", "ap1", "alumno1@gmail.com", 18, "vera");
        Alumno alumno2 = new Alumno("2", "alumno2", "ap2", "alumno2@gmail.com", 19, "vera");
        Alumno alumno3 = new Alumno("3", "alumno3", "ap3", "alumno3@gmail.com", 17, "vera");
        Alumno alumno4 = new Alumno("4", "alumno4", "ap4", "alumno4@gmail.com", 16, "vera");
        Alumno alumno5 = new Alumno("5", "alumno5", "ap5", "alumno5@gmail.com", 15, "vera");

        aula.addAlumno(alumno1);


    }
}
