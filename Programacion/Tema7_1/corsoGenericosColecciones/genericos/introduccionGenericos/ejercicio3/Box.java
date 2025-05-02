package Tema7_1.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio3;

public class Box <T>{

    public static final Box<?> EMPTY ;

    static {
        EMPTY = new Box<>(true);
    }

    private T value;
    private boolean empty;

    private Box(boolean empty) {
        this.empty = empty;
    }
    public Box(T value) {
        this.value = value;
        if (this.value == null) {
            this.empty = true;
        }else {
            this.empty = false;
        }
    }

    public T getValue() {
        return value;
    }

    public Box<T> setValue(T value) {
        this.value = value;
        return this;
    }

    public boolean isEmpty() {
        return empty;
    }

    public Box<T> setEmpty(boolean empty) {
        this.empty = empty;
        return this;
    }
}
