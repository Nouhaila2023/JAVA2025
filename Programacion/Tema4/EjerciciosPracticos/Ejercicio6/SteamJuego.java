package Tema4.EjerciciosPracticos.Ejercicio6;

public class SteamJuego {

    /***
     * Crea la clase SteamJuego, la cual servirá para abstraer la información de estadísticas de los juegos jugados en la
     * plataforma Steam. Las propiedades de esa clase serán: nombre, descripcionCorta), mediaJugadoresDiarios, int
     * diasDesdeSalida, precio (0 si es FreeToPlay), puestoMasVendidos. Debes crear el constructor parametrizado,
     * getters y setters. Añade un método que añada cuántos jugadores han jugado en otro día:
     * - void jugadoresDia(int jugadoresHoy): deberá actualizar la media de jugadores diarios con la siguiente
     * fórmula 
     * ((mediaJugadoresDiarios * diasDesdeSalida) + jugadoresHoy) / (diasDesdeSalida + 1)
     * Crea tres juegos diferentes y píntalos ordenados por el puesto en las ventas. Después llama a jugadoresDia para
     * los tres juegos indicando el número de jugadores que han jugado ese día, y muestra la nueva media de jugadores
     * diarios de cada juego
     */
    private String nombre;
    private String desceipcionCarta;
    private double mediaJugadoresDiarios;
    private int diasDesdeSalida;
    private double precio;//o si es freeeToPlay

    private static String puestoMasVendidos;

    public static Integer contadorJugadores = 0;


    //Constroctor
    public SteamJuego(String nombre, String desceipcionCarta, double mediaJugadoresDiarios, int diasDesdeSalida, double presio) {
        SteamJuego.contadorJugadores++;
        this.nombre = nombre;
        this.desceipcionCarta = desceipcionCarta;
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
        this.diasDesdeSalida = diasDesdeSalida;
        this.precio = presio;
    }


    //set and get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesceipcionCarta() {
        return desceipcionCarta;
    }

    public void setDesceipcionCarta(String desceipcionCarta) {
        this.desceipcionCarta = desceipcionCarta;
    }

    public int getDiasDesdeSalida() {
        return diasDesdeSalida;
    }

    public void setDiasDesdeSalida(int diasDesdeSalida) {
        this.diasDesdeSalida = diasDesdeSalida;
    }

    public double getMediaJugadoresDiarios() {
        return mediaJugadoresDiarios;
    }

    public void setMediaJugadoresDiarios(double mediaJugadoresDiarios) {
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static String getPuestoMasVendidos() {
        return puestoMasVendidos;
    }

    public static void setPuestoMasVendidos(String puestoMasVendidos) {
        SteamJuego.puestoMasVendidos = puestoMasVendidos;
    }

    public static Integer getContadorJugadores() {
        return contadorJugadores;
    }

    public static void setContadorJugadores(Integer contadorJugadores) {
        SteamJuego.contadorJugadores = contadorJugadores;
    }


    public void jugadoresDia(int jugadoresHoy){
        mediaJugadoresDiarios = ((mediaJugadoresDiarios * diasDesdeSalida) + jugadoresHoy) / (diasDesdeSalida + 1);
    }




}
