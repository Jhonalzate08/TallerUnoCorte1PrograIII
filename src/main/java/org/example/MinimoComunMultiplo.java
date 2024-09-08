package org.example;

import java.util.Scanner;

public class MinimoComunMultiplo {

    // Método de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Método para calcular el MCM utilizando la fórmula MCM(a, b) = (a * b) / MCD(a, b)
    public static int calcularMCM(int a, int b) {
        return Math.abs(a * b) / calcularMCD(a, b);  // Valor absoluto para manejar signos negativos
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número (b): ");
        int b = scanner.nextInt();

        // Calcular el MCM
        int mcm = calcularMCM(a, b);

        System.out.println("El MCM de " + a + " y " + b + " es: " + mcm);

        scanner.close();
    }
}

