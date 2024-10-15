package ejercicios;
import java.util.ArrayList;
import java.util.Collections; // Para utilizar el método 'max'
// Máximo de tres números manejando arrays
public class ejercicio5array {
    public static void main(String[] args) {
        // Declaración de las variables
        int a = 5;  // Variable 'a' con valor 5
        int b = 12; // Variable 'b' con valor 12
        int c = 9;  // Variable 'c' con valor 9

        // Crear una lista de arrays para almacenar los tres números
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar los números a la lista
        numeros.add(a);
        numeros.add(b);
        numeros.add(c);

        // Encontrar el máximo utilizando Collections.max()
        int maximo = Collections.max(numeros);

        // Impresión del resultado
        System.out.println("El mayor número entre " + a + ", " + b + " y " + c + " es: " + maximo);
    }
}
