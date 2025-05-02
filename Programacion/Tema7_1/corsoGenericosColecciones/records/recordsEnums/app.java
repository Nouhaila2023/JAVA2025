package Tema7_1.corsoGenericosColecciones.records.recordsEnums;

public class app {
    public static void main(String[] args) {
        Alumno a = new Alumno("Noha", "El ha", 22);
        Alumno b = new Alumno("Noha", "El ha", 22);

        System.out.println(a);
        System.out.println(a.nombre() + a.apellidos());
        System.out.println(b);

        Alumno c = new Alumno("Nouhaila", "Elha", 23);
        System.out.println(c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));


    }
}
