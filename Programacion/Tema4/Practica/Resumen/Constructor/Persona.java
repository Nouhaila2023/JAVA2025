package Tema4.Practica.Resumen.Constructor;

public class Persona {
    String nombre;
    int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Nouhaila";
        this.edad = 22;
    }

    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor copia
    public Persona(Persona otraPersona) {
        this.nombre = otraPersona.nombre;
        this.edad = otraPersona.edad;
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }


}
