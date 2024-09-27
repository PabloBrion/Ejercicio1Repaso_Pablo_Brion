package ejercicios;
// Suma de los primeros N números naturales
public class ejercicio9 {
    public static void main(String[] args) {
        // Declaración de la variable
        int N = 50; // Variable 'N' con valor 50

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
