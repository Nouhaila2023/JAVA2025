package Tema6.PracticaDeClase;

public class Equipamiento extends ProductoBasa{

    //Atributos
    private  String deporte;
    private  String marca;

    //Constructor
    public Equipamiento(String codigo, String nombre, double precion, int stock, String deporte, String marca) {
        super(codigo, nombre, precion, stock);
        this.marca = marca;
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    @Override
    public String getInfo() {
        return "";
    }
}
