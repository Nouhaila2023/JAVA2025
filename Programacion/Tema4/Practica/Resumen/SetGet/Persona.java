package Tema4.Practica.Resumen.SetGet;

public class Persona {
    private String nombre;  // Atributo privado
    private int edad;      // Atributo privado

    // Getter para 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Setter para 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para 'edad'
    public int getEdad() {
        return edad;
    }

    // Setter para 'edad'
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;  // Asigna el valor solo si es mayor que 0
        } else {
            System.out.println("Edad no válida");
        }
    }
}
