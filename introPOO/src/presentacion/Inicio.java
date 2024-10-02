package presentacion;

import entidades.Persona;

public class Inicio {
    public static void main(String[] args) {
        // tipo de dato nombrevariable  =  valor
            int         a               =   10;
            Persona     p1              = new Persona();

            p1.nombre="Pablo";
            p1.DNI= "23.376.467";
            p1.efectivo=1000;
            p1.tieneHambre=true;
            p1.tieneSueno=false;
        System.out.println("a es un entero y almacena  = " + a);
        System.out.println("p1 es un objeto y almacena  = " + p1);
    }
}
