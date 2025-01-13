package Tema4.OpenWebinars.IntroduccionPOO;

public class Test2Alumno {
    public static void main(String[] args) {

        //Utilizando la clase Alumno del ejercicio1, crea un programa
        // en java que tenga un array de objetos de esta clase y nos indican cual es
        //el alumno mas joven de todos


        Alumno[] alumnos = new Alumno[3];
        alumnos[0] = new Alumno("Nouhaila", "EL Halouui", 22);
        alumnos[1] = new Alumno("Jose", "Andres", 17);
        alumnos[2] = new Alumno("Ana", "Ana", 10);

        Alumno alumnoMasJoven = alumnos[0];

        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getEdad() < alumnoMasJoven.getEdad()) {
                alumnoMasJoven = alumnos[i];
            }
        }
        System.out.println("El alumno menor edad es:" + alumnoMasJoven.getNombre() + " " + alumnoMasJoven.getApellido() );



    }
}
