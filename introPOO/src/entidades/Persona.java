
package entidades;
import entidades.Producto;

public class Persona {
    // Atributos
    private String DNI;                 // 23.376.467
    private String nombre;            //Pablo Maximiliano Brión
    private int efectivo;             // 1000
    private boolean tieneSueno;        //false
    private boolean tieneHambre;            //true

    public Persona(String DNI, String nombre, int efectivo, boolean tieneSueno, boolean tieneHambre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.efectivo = efectivo;
        this.tieneSueno = tieneSueno;
        this.tieneHambre = tieneHambre;
    }

    // Metodos
    public void comprar(Producto producto){
        if(producto.stock==0){
            System.out.println("Prosducto sin stock");
        } else {
            if(producto.precio<=efectivo){
                System.out.println("Voy a comprar un "+producto.nombre);
                efectivo= efectivo - producto.precio;
                System.out.println("Me queda de saldo: $"+ efectivo);
            }
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public boolean isTieneSueno() {
        return tieneSueno;
    }

    public void setTieneSueno(boolean tieneSueno) {
        this.tieneSueno = tieneSueno;
    }

    public boolean isTieneHambre() {
        return tieneHambre;
    }

    public void setTieneHambre(boolean tieneHambre) {
        this.tieneHambre = tieneHambre;
    }
}
