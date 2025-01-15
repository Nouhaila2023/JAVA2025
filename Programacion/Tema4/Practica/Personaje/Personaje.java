package Tema4.Practica.Personaje;

/*1. Crear una clase Personaje
   Propiedades: (private)
   - nombre de tipo String
   - clase de tipo String (elfo, bárbaro, ...)
   - sexo de tipo String (hombre, mujer, nodefinido)
   - vida de tipo Integer (0 - 100)

   Constructor
   - Todas las propiedades -> new Personaje("Aragorn", "Guerrero", "hombre", 50)
   - Vacío -> new Personaje() -> que ponga por defecto ("SinNombre", "Humano", "nodefinido",10)

   Métodos
   - Getter
   - Setter
   - ToString

2. Crear una clase TestPersonaje
   - Crear un objeto jugador1 con los valores que queráis.
   - Crear un objeto jugador2 con los valores por defecto.
   - Cambiar la clase de jugador1 a "Enano"
   - Cambiar la vida de jugador2 a 75
   - Pintar jugador1 y jugador2
   */


import Tema4.Practica.Arma.Arma;

/**
 * 1. Modifica la clase Personaje
 *  - Añande una propiedad nueva de tipo Arma
 *  - Cambia el constructor para añadirle una Arma
 *  - Añade getter y setter de la nueva propiedad
 *  - Borra el método toString y vuelve a generarlo para que pinte el Arma
 *
 * 2. Modifica la clase TestPersonaje, para que los personajes lleven un Arma.
 *  - Jugador1 que lleve un martillo
 *  - Jugador2 que lleve una espada
 *
 * 3. Pinta jugador1 y jugador2
 *
 * 4. Nivel Pro:
 *  - Añade un método en Personaje que sea golpear
 *  public void golpear(Personaje personaje) {
 *     this.arma.golpear(personaje);
 *  }
 *  - Probar en TestPersonaje que jugador1 golpee a jugador2 con su arma
 *  - Pinta los jugadores antes y después de golpear
 */


public class Personaje {

    private String nombre;
    private String clase;
    private String sexo;
    private  int vida;
    private Arma arma;
    private static final int MAX_VIDA=100;//no pude cambiar
    private static int numPersonajes=0; //Propiedad común a todos los objetos Personaje


    //Constructor
    public Personaje(String nombre, String clase, String sexo, int vida, Arma arma) {
        this.nombre = nombre;
        this.clase = clase;
        this.sexo = sexo;
        this.vida = vida;
        this.arma = arma;
        Personaje.numPersonajes++;
    }

    //COnstructor vacio

    public Personaje(String nouhaila) {
        this.nombre = "SinNombre";
        this.clase = "nodefinido";
        this.sexo = "hombre";
        this.vida = 10;
        this.arma = null;
        Personaje.numPersonajes++;
    }


    //Merodos

    //Geter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public static int getNumPersonajes() {
        return numPersonajes;
    }

    public static void setNumPersonajes(int numPersonajes) {
        Personaje.numPersonajes = numPersonajes;
    }




    //toString


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Percsonaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", arma=").append(arma);
        sb.append('}');
        return sb.toString();
    }

    public void golpear(Personaje personaje) {
         this.arma.golpear(personaje);
    }



}
