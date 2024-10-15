package ejercicios;
// Máximo de tres números
public class ejercicio5 {
    public static void main(String[] args) {
        // Declaración de las variables
        int a = 5;  // Variable 'a' con valor 5
        int b = 12; // Variable 'b' con valor 12
        int c = 9;  // Variable 'c' con valor 9

        // Encontrar el máximo de los tres números
        int maximo;

        if (a >= b && a >= c) {
            // Si 'a' es mayor o igual que 'b' y 'c', entonces 'a' es el mayor
            maximo = a;
        } else if (b >= a && b >= c) {
            // Si 'b' es mayor o igual que 'a' y 'c', entonces 'b' es el mayor
            maximo = b;
        } else {
            // Si ninguna de las anteriores es verdadera, entonces 'c' es el mayor
            maximo = c;
        }

        // Impresión del resultado
        System.out.println("El mayor número entre " + a + ", " + b + " y " + c + " es: " + maximo);
    }

}
