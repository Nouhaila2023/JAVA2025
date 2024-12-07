package Ejercicios_Udemy.TipoStringCadenas;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long incio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            //Manera mas rapida
            //c = c.concat(a).concat(b).concat("\n");
            //otra manera
            //c += a + b + "\n";
            //Otra manera con StringBuilder y es la mas rapido

            sb.append(a).append(b).append("\n");
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - incio + "m/s");
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());


    }
}
