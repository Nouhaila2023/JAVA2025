package Tema5.EjercicioPOO.Ejercicio1;

import java.util.Objects;

public class Persona {

    //Atributos private
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;
    private char sexo;

    //valor por defecto
    private static final char SEXO = 'H';


    //Constructores
    //Constructor por defecto
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.peso = 0.0;
        this.altura = 0.0;
        this.sexo = 'H';
    }

    //Un constructor con el nombre, edad, dni, sexo, y el resto por defecto.

    public Persona(String nombre, int edad, String dni, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = 0.0;//valor por defecto
        this.peso = 0.0;//
    }

    //o Un constructor con todos los miembros como parámetro.
    public Persona(String nombre, int edad, String dni, double peso, double altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        this.setSexo(sexo);
    }

    //o Un constructor copia.
    public Persona(Persona otraPersona){
        this.nombre = otraPersona.nombre;
        this.edad = otraPersona.edad;
        this.dni = otraPersona.dni;
        this.peso = otraPersona.peso;
        this.altura = otraPersona.altura;
        this.sexo = otraPersona.sexo;
    }

    //Metodos

    //Setter and Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        //Si el sexo es uno de esto se vale
       if (sexo == 'H' || sexo == 'M' || sexo == 'O'){
           this.sexo = sexo;
       }else {
           //Si no vuelva H
           this.sexo = SEXO;
       }
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append(", sexo=").append(sexo);
        sb.append('}');
        return sb.toString();
    }

    //equals (Solo por el dni)
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    /*
    calcularIMC(): indicará si la persona está en su peso ideal. Para ello, puedesutilizar la
fórmula: peso(en kg) /altura2(en m)
El metodo devolverá 1 si el resultado de aplicar la fórmula es un valor menor que20, lo
que quiere decir que la persona está en su peso ideal; el método devolverá
0 si el resultado de la fórmula es un número entre 20 y 25 (incluidos), lo que significa que la
persona está por debajo de su peso ideal; y devolverá -1 si el resultado de la fórmula es
mayor que 25, lo que significa que tiene sobrepeso.
     */

    /*si es menor de 20 devolvera 1 (es que la persona es en su peso ideal)
    * si es esntre de 20 y 25 devolvera 0 (es qie la persona esta debajo de el peso ideal)
    * si es mayor que 25 devolvera -1 (es que la persona est aen sobrepeso)*/

    public int calcularIMC(){
        double formula = this.peso/ Math.pow(altura, 2);

        if (formula < 20){
            return 1;
        }else if (formula > 25){
            return -1;
        }else {
            return 0;
        }

    }

    // esMayordeEdad(): indica si la persona es mayor de edad.

    public boolean esMayorEdad(){
        if (this.edad >= 18){
            return true;
        }else {
            return false;
        }
    }

}
