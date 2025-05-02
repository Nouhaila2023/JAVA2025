package Tema7_1.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio2;

public class Box {

    private Object valor;
    private boolean empty;

    public static final Box EMPTY;
    static {
        EMPTY = new Box(true);
    }

    private Box(boolean empty) {
        this.empty = empty;
    }
    public Box(Object valor) {
        this.valor = valor;
        if (this.valor == null) {
            this.empty = true;
        }else {
            this.empty = false;
        }
    }

    public Object getValor() {
        return valor;
    }

    public Box setValor(Object valor) {
        this.valor = valor;
        if (this.valor == null) {
            this.empty = true;
        }else {
            this.empty = false;
        }
        return this;
    }

    public boolean isEmpty() {
        return empty;
    }

    public Box setEmpty(boolean empty) {
        this.empty = empty;
        return this;
    }
}
