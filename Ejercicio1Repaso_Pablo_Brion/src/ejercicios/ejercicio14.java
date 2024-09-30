package ejercicios;
// Conversión de decimal a binario
public class ejercicio14 {
    public static void main(String[] args) {
        // Declaración de la variable
        int a = 45; // Variable 'a' con valor 45

        // Convertir el número decimal a binario usando el método Integer.toBinaryString()
        String binario = Integer.toBinaryString(a);

        // Impresión del resultado
        System.out.println("El número " + a + " en binario es: " + binario);
    }
}
