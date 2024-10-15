package presentacion;

import entidades.Persona;
import entidades.Producto;


public class Inicio {
    public static void main(String[] args) {
        // tipo de dato nombrevariable  =  valor
            int         a               =   10;
            Persona     p1              = new Persona("23.376.467","Pablo",1000,true,true);
        //Producto papasLays= new Producto();  //Constructor por defecto, o Constructor sin parámetros
        Producto papasLays= new Producto("Papas Lays 125 grs","Papas fritas",150,3);
        Producto lataPepsi= new Producto("Pepsi Zero","Bibida lata 350 ml",50,1);
        //Producto otroProducto = new Producto();
        //otroProducto.setStock(10);


        System.out.println("a es un entero y almacena  = " + a);
        System.out.println("p1 es un objeto y almacena  = " + p1);




        System.out.println("Ingrese DNI del cliente: ");
        String dniCliente= Leer.dato();
        System.out.println("Ingrese nombre del cliente: ");
        String nombreCliente= Leer.dato();
        System.out.println("Ingrese saldo del cliente: ");
        Integer saldoCliente= Leer.datoInt();
        System.out.println("¿Tiene hambre?: ");
        Boolean hambreCliente= Leer.datoBoolean();
        System.out.println("¿Tiene sueño?: ");
        Boolean suenioCliente= Leer.datoBoolean();

    }
}

