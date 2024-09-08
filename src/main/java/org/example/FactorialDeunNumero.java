package org.example;

import java.util.Scanner;

public class FactorialDeunNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero no negativo para calcular su factorial: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Error: El factorial no está definido para números negativos.");
        } else {
            long factorial = calcularFactorial(n);
            System.out.println("El factorial de " + n + " es: " + factorial);
        }

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
