package Tema7_1.corsoGenericosColecciones.records.enumeraciones;

public enum EstadoPedido {
    PEDIDO("PEDIDO REALIZADO" , 0 ,0),
    PREPARADO("lISTA PARA LA ENTREGA", 0, 2),
    ENTREGADO("ENTREGADO" , 1, 5);


    private EstadoPedido(String descripcion, int plazoMini, int plazoMaxi) {
        this.descripcion = descripcion;
        this.plazoMaxi = plazoMaxi;
        this.plazoMini = plazoMaxi;
    }

    private final String descripcion;
    private final int plazoMini;
    private  final int plazoMaxi;

    public String getDescripcion() {
        return descripcion;
    }

    public int getPlazoMini() {
        return plazoMini;
    }

    public int getPlazoMaxi() {
        return plazoMaxi;
    }
}
