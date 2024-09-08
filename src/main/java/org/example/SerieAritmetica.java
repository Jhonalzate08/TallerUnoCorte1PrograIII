package org.example;

import java.util.Scanner;

public class SerieAritmetica {

    // Método para calcular la suma de los primeros n términos de una serie aritmética
    public static int calcularSumaSerieAritmetica(int n, int a, int d) {
        // Fórmula de la suma de una serie aritmética
        return n * (2 * a + (n - 1) * d) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los valores de n, a y d
        System.out.print("Ingrese el número de términos (n): ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el primer término (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese la diferencia común entre terminos (d): ");
        int d = scanner.nextInt();

        // Calcular la suma de los primeros n términos de la serie aritmética
        int suma = calcularSumaSerieAritmetica(n, a, d);

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + n + " términos de la serie aritmética es: " + suma);

        scanner.close();
    }
}

