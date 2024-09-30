package ejercicios;
// Palíndromo de un número
public class ejercicio13 {
    public static void main(String[] args) {
        // Declaración de la variable
        int a = 1221; // Variable 'a' con valor 1221

        // Convertir el número a una cadena
        String numeroComoCadena = Integer.toString(a);

        // Invertir la cadena
        String numeroInvertido = "";
        for (int i = numeroComoCadena.length() - 1; i >= 0; i--) {
            numeroInvertido += numeroComoCadena.charAt(i); // Agregar cada carácter desde el final al principio
        }

        // Comparar si la cadena original es igual a la invertida
        if (numeroComoCadena.equals(numeroInvertido)) {
            System.out.println("El número " + a + " es un palíndromo.");
        } else {
            System.out.println("El número " + a + " no es un palíndromo.");
        }
    }
}
