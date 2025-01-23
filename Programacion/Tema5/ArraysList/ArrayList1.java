package Tema5.ArraysList;
import java.util.ArrayList;
import java.util.List;


public class ArrayList1 {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Nouhe", 21));
        lista.add(new Persona(2, "Fati", 22));
        lista.add(new Persona(3, "Ale", 23));
        lista.add(new Persona(4, "Jose", 24));

        //Recorrer por indice

        System.out.println("-----------Con For----------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }

        System.out.println("-----------Con ForEach------------");

        for(Persona persona: lista){
            System.out.println(persona.getNombre());
        }


    }
}
