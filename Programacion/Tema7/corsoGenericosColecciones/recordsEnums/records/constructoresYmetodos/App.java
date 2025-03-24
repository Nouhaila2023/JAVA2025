package Tema7.corsoGenericosColecciones.recordsEnums.records.constructoresYmetodos;

public class App {
    public static void main(String[] args) {

        Cliente a = new Cliente("A", "A", "a@gmail.com");
        //Cliente b = new Cliente(null, "B", "b@gmail.com");

        System.out.println(a);
        //System.out.println(b); va salir error

        Cliente c = new Cliente("C", "C");
        System.out.println(c);

        Prudocto p = new Prudocto(1L, "Bola", 20.0);
        System.out.println(p);

        System.out.println(a.nombreCompleto());

    }
}
