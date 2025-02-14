package Tema5.Ejercicio;

public abstract class Ciclista {
    //Atributos
    private int identificador;
    private String nombreCiclista;
    private int tiempoAcumulado; //En min


    //Constructor
    public Ciclista(int identificador, String nombreCiclista, int tiempoAcumulado) {
        this.identificador = identificador;
        this.nombreCiclista = nombreCiclista;
        this.tiempoAcumulado = 0;
    }

    //Getter and Setter
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreCiclista() {
        return nombreCiclista;
    }

    public void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ciclista{");
        sb.append("identificador=").append(identificador);
        sb.append(", nombreCiclista='").append(nombreCiclista).append('\'');
        sb.append(", tiempoAcumulado=").append(tiempoAcumulado);
        sb.append('}');
        return sb.toString();
    }

    //Un ciclista tiene un metodo abstracto imprimirTipo que devuelve un String
   public abstract String imprimirTipo();






}
