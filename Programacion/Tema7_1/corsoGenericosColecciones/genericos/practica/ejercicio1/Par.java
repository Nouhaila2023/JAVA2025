package Tema7_1.corsoGenericosColecciones.genericos.practica.ejercicio1;

/**
 * Clase Generica
 * @param <T>
 * @param <U>
 */
public class Par <T , U>{

    /**
     * Atributos
     */
    private T primerObjeto;
    private U segundoObjeto;

    /**
     * Constructor
     * @param primerObjeto
     * @param segundoObjeto
     */
    public Par(T primerObjeto, U segundoObjeto) {
        this.primerObjeto = primerObjeto;
        this.segundoObjeto = segundoObjeto;
    }

    /**
     * Metodo of que volvet el par del tipo T y U
     */

    public static <T,U> Par<T,U> of (T primerObjeto, U segundoObjeto){
        return new Par<>(primerObjeto , segundoObjeto);
    }


    /**
     * Getter Setter
     * @return
     */
    public T getPrimerObjeto() {
        return primerObjeto;
    }

    public Par<T, U> setPrimerObjeto(T primerObjeto) {
        this.primerObjeto = primerObjeto;
        return this;
    }

    public U getSegundoObjeto() {
        return segundoObjeto;
    }

    public Par<T, U> setSegundoObjeto(U segundoObjeto) {
        this.segundoObjeto = segundoObjeto;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Par{");
        sb.append("primerObjeto=").append(primerObjeto);
        sb.append(", segundoObjeto=").append(segundoObjeto);
        sb.append('}');
        return sb.toString();
    }
}
