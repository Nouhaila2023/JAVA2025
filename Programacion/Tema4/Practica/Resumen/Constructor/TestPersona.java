package Tema4.Practica.Resumen.Constructor;

public class TestPersona {
    public static void main(String[] args) {
        // Usando el constructor por defecto
        Persona p1 = new Persona();
        p1.mostrarInfo();  // Nombre: Desconocido, Edad: 0

        // Usando el constructor parametrizado
        Persona p2 = new Persona("Juan", 30);
        p2.mostrarInfo();  // Nombre: Juan, Edad: 30

        // Usando el constructor copia
        Persona p3 = new Persona(p2);
        p3.mostrarInfo();  // Nombre: Juan, Edad: 30
    }
}
