package ejercicios;

import java.util.Scanner;

// Suma de los primeros N números naturales
public class ejercicio9conInput {
    public static void main(String[] args) {
        // Declaración de la variable
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese número natural hasta el cual sumar: ");
        int N = lectura.nextInt();

        // Variable para almacenar la suma
        int suma = 0;

        // Cálculo de la suma usando un bucle for
        for (int i = 1; i <= N; i++) {
            suma += i; // Se suma cada número desde 1 hasta N
        }

        // Impresión del resultado
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
    }
}
