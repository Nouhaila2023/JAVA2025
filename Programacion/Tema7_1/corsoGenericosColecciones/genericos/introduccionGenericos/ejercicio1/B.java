package Tema7_1.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio1;

public class B {
    private Double b;

    public B(Double b) {
        this.b = b;
    }

    public Double getB() {
        return b;
    }

    public B setB(Double b) {
        this.b = b;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("B{");
        sb.append("b=").append(b);
        sb.append('}');
        return sb.toString();
    }
}
