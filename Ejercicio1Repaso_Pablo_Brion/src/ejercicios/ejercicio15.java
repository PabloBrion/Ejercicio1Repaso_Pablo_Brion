package ejercicios;
// Calcular el área de un círculo
public class ejercicio15 {
    public static void main(String[] args) {
        // Declaración de la variable
        double radio = 7; // Variable 'radio' con valor 7

        // Definir el valor de PI
        double pi = Math.PI;

        // Cálculo del área usando la fórmula: área = pi * radio^2
        double area = pi * Math.pow(radio, 2);

        // Impresión del resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}
