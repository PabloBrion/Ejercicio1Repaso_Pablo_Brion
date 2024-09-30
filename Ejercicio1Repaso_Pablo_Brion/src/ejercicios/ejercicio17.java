package ejercicios;
// Suma de números pares en un rango
public class ejercicio17 {
    public static void main(String[] args) {
        // Declaración de la variable
        int suma = 0;
        for (int i=1;i <=100; i++){
            int resto = i % 2;
            if (resto==0 ) {
                suma = suma + i;
            }

        }
        // Impresión del resultado
        System.out.println("La suma de los dígitos pares es: " + suma);
    }

    }
