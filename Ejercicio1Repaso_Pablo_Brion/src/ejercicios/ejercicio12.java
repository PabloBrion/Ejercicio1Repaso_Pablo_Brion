package ejercicios;
//Inversión de un número
public class ejercicio12 {
    public static void main(String[] args) {
        // Declaración de la variable
        int a = 54321; // Variable 'a' con valor 54321

        // Convertir el número entero a una cadena
        String numeroComoCadena = Integer.toString(a);

        // Invertir la cadena usando un bucle
        String numeroInvertido = "";
        for (int i = numeroComoCadena.length() - 1; i >= 0; i--) {
            numeroInvertido += numeroComoCadena.charAt(i); // Agregar cada carácter desde el final al principio
        }

        // Impresión del resultado
        int numInv= Integer.valueOf(numeroInvertido);
        System.out.println("El número invertido es: " + numInv);
    }
}
