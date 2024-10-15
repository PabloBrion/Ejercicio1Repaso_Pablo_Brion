package ejercicios;
import java.util.ArrayList;
public class ejercicio6 {

        public static void main(String[] args) {
            // Declaración de las variables
            int a = 4;
            int b = 9;
            int c = 13;

            // Crear una lista de arrays para almacenar los tres números
            ArrayList<Integer> numeros = new ArrayList<>();

            // Agregar los números a la lista
            numeros.add(a);
            numeros.add(b);
            numeros.add(c);

            // Calcular la suma de los elementos en la lista
            int suma = 0; // Variable para almacenar la suma
            for (int numero : numeros) {
                suma += numero; // Se suma cada número de la lista
            }

            // Calcular el promedio
            double promedio = (double) suma / numeros.size(); // División de la suma por la cantidad de números

            // Impresión del resultado
            System.out.println("El promedio de " + a + ", " + b + " y " + c + " es: " + promedio);
        }
}
