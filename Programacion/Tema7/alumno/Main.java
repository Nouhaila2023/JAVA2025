package Tema7.alumno;

public class Main {
    public static void main(String[] args) {

        Aula aula = new Aula("Aula1", "Clase A");
        Alumno alumno1 = new Alumno("1", "alumno1", "ap1", "alumno1@gmail.com", 18, "vera");
        Alumno alumno2 = new Alumno("2", "alumno2", "ap2", "alumno2@gmail.com", 19, "vera");
        Alumno alumno3 = new Alumno("3", "alumno3", "ap3", "alumno3@gmail.com", 17, "vera");
        Alumno alumno4 = new Alumno("4", "alumno4", "ap4", "alumno4@gmail.com", 16, "vera");
        Alumno alumno5 = new Alumno("5", "alumno5", "ap5", "alumno5@gmail.com", 15, "vera");

        aula.addAlumno(alumno1);
        aula.addAlumno(alumno2);
        aula.addAlumno(alumno3);
        aula.addAlumno(alumno4);
        aula.addAlumno(alumno5);


        aula.listarTodo();
        Alumno aRepetido = new Alumno("1", "alumno1", "ap1", "alumno1@gmail.com", 18, "vera");
        System.out.println("Aula Repetida ---------");
        aula.listarTodo();

        System.out.println("--------------------------------------------------------");

        AulaNueva aula2 = new AulaNueva("Aula2", "Clase B");
        aula2.addAlumno(alumno1);
        aula2.addAlumno(alumno2);
        aula2.addAlumno(alumno3);
        aula2.addAlumno(alumno4);
        aula2.addAlumno(alumno5);
        aula2.listarTodos();

        aula2.addAlumno(aRepetido); // No se añade

        aula2.listarTodos();



    }
}
