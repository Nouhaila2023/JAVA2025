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






public class Percsonaje {

    private String nombre;
    private String clase;
    private String sexo;
    private  int vida;


    //Constructor
    public Percsonaje(String nombre, String clase, String sexo, int vida) {
        this.nombre = nombre;
        this.clase = clase;
        this.sexo = sexo;
        this.vida = vida;
    }

    //COnstructor vacio

    public Percsonaje(String nouhaila) {
        this.nombre = "SinNombre";
        this.clase = "nodefinido";
        this.sexo = "hombre";
        this.vida = 10;
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


    //toString
    @Override
    public String toString() {
        return "Percsonaje{" +
                "nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", sexo='" + sexo + '\'' +
                ", vida=" + vida +
                '}';
    }




}
