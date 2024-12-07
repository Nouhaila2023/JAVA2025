package Ejercicios_Udemy.TipoStringCadenas;

public class EjemplosStringMetodoa {

    public static void main(String[] args) {

        String nombre = "Nouhaila";

        System.out.println("Metodo length: " + nombre.length());
        System.out.println("Metodo toUpperCase: " + nombre.toUpperCase());
        System.out.println("Metodo toLowerCase: " + nombre.toLowerCase());
        System.out.println("Metodo equals (\"Nouhaila\"): " + nombre.equals("Nouhaila"));
        System.out.println("Metodo equals (\"NOUHAILA\"): " + nombre.equals("NOUHAILA"));
        System.out.println("Metodo equalsIgnoreCase (\"NOUHAIL\"): " + nombre.equalsIgnoreCase("NOUHAILA"));
        System.out.println("Metodo compareTo: " + nombre.compareTo("Nouhaila"));
        System.out.println("Metodo comparTo Con otro nombre: " + nombre.compareTo("Ale"));
        System.out.println("Metodo charAt: " +nombre.charAt(0));
        System.out.println("Metodo charAt: " +nombre.charAt(1));
        System.out.println("Metodo charAt: " +nombre.charAt(2));
        System.out.println("Metodo charAt: " +nombre.charAt(3));
        System.out.println("Metodo charAt: " +nombre.charAt(4));
        System.out.println("Metodo charAt: " +nombre.charAt(5));
        System.out.println("Metodo charAt: " +nombre.charAt(6));
        System.out.println("Metodo charAt: " +nombre.charAt(7));
        /*Para poner el ultimo metodo*/
        System.out.println("Metodo charAt(nombre.length()): " + nombre.charAt(nombre.length()-1));
        /*Par poner los tres ultimos metodo*/
        System.out.println("Metodo substring(3): " + nombre.substring(3));
        System.out.println("Metodo substring(1,4): " + nombre.substring(1,4));
        /*Otra forma para tener los dos ultimos caracteres*/
        System.out.println("Metodo substring(nombre.length()-2): " + nombre.substring(nombre.length()-2));



    }

}
