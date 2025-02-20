package Tema6.PracticaDeClase;

public class RopaDeportiva extends ProductoBasa{

    //atributos
    private String talla;
    private String material;

    //Constructor
    public RopaDeportiva(String codigo, String nombre, double precion, int stock, String talla, String material) {
        super(codigo, nombre, precion, stock);
        this.talla = talla;
        this.material = material;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RopaDeportiva{");
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append("talla='").append(talla).append('\'');
        sb.append(", material='").append(material).append('\'');
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
