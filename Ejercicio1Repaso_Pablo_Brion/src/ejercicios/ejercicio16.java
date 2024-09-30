package ejercicios;

public class ejercicio16 {
    public static void main(String[] args) {
        // Declaración de la variable
        int a = 5678; // Variable 'a' con valor 5678

        // Variable para almacenar la suma de los dígitos
        int suma = 0;

        // Proceso de sumar los dígitos del número
        while (a != 0) {
            int digito = a % 10; // Obtener el último dígito de 'a'
            //System.out.println("dígito: " + digito);
            suma += digito;      // Sumar el dígito a la variable 'suma'
            a /= 10;             // Eliminar el último dígito de 'a'
            //System.out.println("estado de la variable: " + a);
        }

        // Impresión del resultado
        System.out.println("La suma de los dígitos es: " + suma);
    }
}
