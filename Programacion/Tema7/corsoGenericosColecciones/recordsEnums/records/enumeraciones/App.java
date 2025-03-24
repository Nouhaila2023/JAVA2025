package Tema7.corsoGenericosColecciones.recordsEnums.records.enumeraciones;

public class App {
    public static void main(String[] args) {

        DiaSemana diaSemana = DiaSemana.JUEVES;
        System.out.println(diaSemana);

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(((dia.ordinal()+1) + dia.name() ));
            System.out.println( saludoSia(dia));
        }

        EstadoPedido estadoPedido = EstadoPedido.PREPARADO;
        System.out.println("Descripcion: " + estadoPedido.getDescripcion());
        System.out.println("Plazo Maximo: " + estadoPedido.getPlazoMaxi());
        System.out.println("Plazo Minimo: " + estadoPedido.getPlazoMini());


    }



    public static String saludoSia(DiaSemana diaSemana) {
        String msg = switch (diaSemana){
            case LUNES -> "Los lunes son duros";
            case MARTES -> "La martes son duros";

            default -> "Ni fu , ni fa";
        };

        return msg;
    }




}
