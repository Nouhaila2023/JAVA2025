package Tema6.PracticaDeClase;

public class Equipamiento extends ProductoBasa{

    //Atributos
    private  String deporte;
    private  String marca;

    @Override
    public int getStock() {
        return 0;
    }

    //Constructor
    public Equipamiento(String codigo, String nombre, double precion, int stock, String deporte, String marca) {
        super(codigo, nombre, precion, stock);
        this.marca = marca;
        this.deporte = deporte;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipamiento{");
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append("deporte='").append(deporte).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", codigo='").append(codigo).append('\'');
        sb.append(", precion=").append(precion);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }
}
