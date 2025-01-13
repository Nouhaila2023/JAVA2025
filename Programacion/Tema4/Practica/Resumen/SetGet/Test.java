package Tema4.Practica.Resumen.SetGet;

public class Test {

    public static void main(String[] args) {
        Persona persona = new Persona();

        // Usando setter para asignar valores
        persona.setNombre("Juan");
        persona.setEdad(0);

        // Usando getter para obtener valores
        System.out.println("Nombre: " + persona.getNombre());  // Imprime: Juan
        System.out.println("Edad: " + persona.getEdad());      // Imprime: 30
    }

}
