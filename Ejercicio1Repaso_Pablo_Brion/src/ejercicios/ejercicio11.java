package ejercicios;
// Fibonacci
public class ejercicio11 {
    public static void main(String[] args) {
        // Declaración de la variable
        int n=10;
        int fiboAntes=0;
        int fiboActual=1;
        System.out.println("Nro fibonacci " + fiboAntes);
        System.out.println("Nro fibonacci " + fiboActual);
        // llega a n-1, porque trabaja en suma al ultimo valor
        for (int i = 2; i <= n-1; i++){

            int fibo= fiboAntes + fiboActual;
            System.out.println("Nro fibonacci " + fibo);
            fiboAntes=fiboActual;
            fiboActual=fibo;
        }
    }
}
