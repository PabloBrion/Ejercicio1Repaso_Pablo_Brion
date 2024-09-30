package ejercicios;

import java.util.Scanner;
// Factorial de un número
public class ejercicio10 {
    public static void main(String[] args) {
        // Declaración de la variable
        int a=6;
        int totalf=1;
        //uso 1 porque todo nro multiplicado por cero es cero
        // (int i = valor inicial; i <= valor final; i = i + paso)
        for (int n = 1; n <= a; n++){
            totalf = totalf * n;
        }
        System.out.println("El factorial de " + a + " es igual a: " + totalf);
        }
    }
