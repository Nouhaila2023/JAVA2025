package Ejercicios_Udemy.TipoStringCadenas;

public class EjemploString {
    public static void main(String[] args) {
        
        String ciudad1 = "Granada";
        String ciudad2 = "Granada";
        String ciudad3 = new String("Granada");

        System.out.println(ciudad1 == ciudad2);
        System.out.println(ciudad1 == ciudad3);
        System.out.println(ciudad1.equals(ciudad2));
        System.out.println(ciudad1.equalsIgnoreCase(ciudad2)); //Para comparam mayuscola y menoscula


        
        
        
        
    }
}
