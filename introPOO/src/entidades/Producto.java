
package entidades;

public class Producto {
    // Atributos
    String nombre;
    private String descripcion;
    int precio;
    int stock;

    public Producto(String nombre,String descripcion,int precio,int stock){
        this.nombre=nombre;
        this.descripcion= descripcion;
        this.precio= precio;
        this.stock= stock;

    }
}
