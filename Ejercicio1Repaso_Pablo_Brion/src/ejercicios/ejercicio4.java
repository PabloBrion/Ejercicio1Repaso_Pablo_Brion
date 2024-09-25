package ejercicios;
// Números primos
public class ejercicio4 {
    public static void main(String[] args) {
        // Declaración de la variable
        int a = 29; // Variable 'a' con valor 29

        // Variable para almacenar el resultado de si es primo o no
        boolean esPrimo = true; // Inicialmente asumimos que 'a' es primo

        // Verificación de si el número es primo
        if (a <= 1) {
            esPrimo = false; // Los números menores o iguales a 1 no son primos
        } else {
            // Iteramos desde 2 hasta la raíz cuadrada de 'a'
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    esPrimo = false; // Si 'a' es divisible por algún número, no es primo
                    break; // No es necesario seguir verificando
                }
            }
        }

        // Impresión del resultado
        if (esPrimo) {
            System.out.println(a + " es un número primo.");
        } else {
            System.out.println(a + " no es un número primo.");
        }
    }
}
