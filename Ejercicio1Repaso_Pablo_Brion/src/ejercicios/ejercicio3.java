package ejercicios;
// Número par o impar
public class ejercicio3 {

    public static void main(String[] args) {
        // Declaración de la variable
        int a = 15; // Variable 'a' con valor 15

        // Verificación si el número es par o impar
        if (a % 2 == 0) {
            // Si el resto de 'a' dividido entre 2 es 0, el número es par
            System.out.println(a + " es un número par.");
        } else {
            // Si no, el número es impar
            System.out.println(a + " es un número impar.");
        }
    }

}
