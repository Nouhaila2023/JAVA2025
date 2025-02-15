package Tema5.Ejercicio;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private static int tiempoEquipo = 0;
    private String pais;
    private List<Ciclista> ciclistas;

    //Constructor
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getTiempoEquipo() {
        return tiempoEquipo;
    }

    public static void setTiempoEquipo(int tiempoEquipo) {
        Equipo.tiempoEquipo = tiempoEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Ciclista> getCiclistas() {
        return ciclistas;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", ciclistas=").append(ciclistas);
        sb.append('}');
        return sb.toString();
    }

    //Añader un ciclista a una equipo
    public void addCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        //Cada ciclista tiene su tiempo
        //Añademos el tiempo al tiempoEquipo
        tiempoEquipo += ciclista.getTiempoAcumulado();
    }

    //Calcular el total de tiempos de los ciclistas del equipo (suma de los tiempos de carrera de sus
    //ciclistas, su atributo estático).
    public int totalTiempo(){
        for (Ciclista ciclista : ciclistas) {
            tiempoEquipo += ciclista.getTiempoAcumulado();
        }
        return tiempoEquipo;
    }

    //Listar los nombres de todos los ciclistas que conforman el equipo.
    public void listarNombre(){
        if (this.ciclistas.size() == 0){
            System.out.println("Equipo vacio");
        }else {
            for (Ciclista ciclista : ciclistas) {
                System.out.println(ciclista.getNombreCiclista());
            }
        }
    }

    //Dado un identificador de un ciclista por teclado, es necesario imprimir en pantalla los datos
    //del ciclista. Si no existe, debe aparecer el mensaje correspondiente.
    public Ciclista byscarCiclista(int id){
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == id){
                System.out.println("Ciclista encontrado con el identificador: " + id);
                return ciclista;
            }
        }
        System.out.println("Ciclista no encontrado con el identificador: " + id);
        return null;
    }


}
