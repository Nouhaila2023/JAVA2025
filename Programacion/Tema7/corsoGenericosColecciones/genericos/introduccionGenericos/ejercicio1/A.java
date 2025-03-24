package Tema7.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio1;

public class A {
    private String a;

    public A(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public A setA(String a) {
        this.a = a;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("A{");
        sb.append("a='").append(a).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
