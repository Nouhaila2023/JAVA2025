package Tema5.EjercicioPOO.Ejercicio4;

import java.util.Objects;

public class Producto {
    //Propiedades
    private int id;
    private String descripcion;//ya sif montaj
    private double precio_unitario;
    private int unidades_disponibles;//cantidad que hay en el macen
    private int stok_maximo;
    private double descuento;


    //Constructor por defecto
    public Producto() {
        this.id = 0;
        this.descripcion = "";
        this.precio_unitario = 0;
        this.unidades_disponibles = 0;
        this.stok_maximo = 0;
        this.descuento = 0;
    }

    //Constructor con parametros
    public Producto(int id, String descripcion, double precio_unitario, int unidades_disponibles, int stok_maximo, double descuento) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio_unitario = precio_unitario;
        this.unidades_disponibles = unidades_disponibles;
        this.stok_maximo = stok_maximo;
        this.descuento = 0.25;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getUnidades_disponibles() {
        return unidades_disponibles;
    }

    public void setUnidades_disponibles(int unidades_disponibles) {
        if (this.unidades_disponibles > 0 && this.unidades_disponibles <= this.stok_maximo){
            this.unidades_disponibles = unidades_disponibles;
        }else {
            System.out.println("Error.no existe producto:)");
        }

    }

    public int getStok_maximo() {
        return stok_maximo;
    }

    public void setStok_maximo(int stok_maximo) {
        this.stok_maximo = stok_maximo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        descuento /= 100;
        if (descuento > 0 && descuento < 1 ) {
            this.descuento = descuento;
        }
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("id=").append(id);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio_unitario=").append(precio_unitario);
        sb.append(", unidades_disponibles=").append(unidades_disponibles);
        sb.append(", stok_maximo=").append(stok_maximo);
        sb.append(", descuento=").append(descuento);
        sb.append('}');
        return sb.toString();
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /*Metodo public boolean vender(int cantidad) que decrementa el atributo unidades disponibles.
    No se puede vender una cantidad negativa de un producto.

    Si no existe producto suficiente significa que no se ha podido realizar la operación y se devolverá false.

    En caso de existir suficiente producto se restará de las unidades disponibles y sedevolverá true para indicar que
    se realizó correctamente la operación*/

    public boolean vender(int cantidad){
/**
 * أقل من أو تساوي الصفر → يتم رفض العملية وطباعة رسالة خطأ.
 * أكبر من عدد الوحدات المتاحة → يتم رفض العملية وطباعة رسالة خطأ.
 * ضمن العدد المتاح → يتم خصم الكمية وإرجاع true للإشارة إلى نجاح العملية.
 */

        if (cantidad <= 0){
            System.out.println("No existe esta producto.");
            return false;
        }else if(cantidad > unidades_disponibles){
            System.out.println("La cantidad que quieres no existe");
            return false;
        }else{
            System.out.println("Tu pedido es valido");
            unidades_disponibles -= cantidad;
            return true;
        }
    }
/**
 * Método public int reponer() que repone un producto para que alcance su stock máximo. Para
 * ello se calcula la diferencia entre el stock máximo y las unidades disponibles, devolviendo esta
 * cantidad. Una vez repuesto un producto el stock máximo y las unidades disponibles deben
 * coincidir.
 */

    // تحسب الفرق بين الحد الأقصى والمخزون الحال
    // تضيف الوحدات الناقصة ليصل المخزون إلى الحد الأقصى
    // تُرجع عدد الوحدات التي تمت إضافتها

    public int reponer(){
        int cantidad = this.stok_maximo - this.unidades_disponibles;
        //this.unidades_disponibles += cantidad;
        this.unidades_disponibles = this.stok_maximo;
        return cantidad;
    }





}
