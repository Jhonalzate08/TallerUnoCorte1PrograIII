package org.example;

import java.util.Scanner;

public class SumaDeNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número Par: ");
        int n = scanner.nextInt();

        int suma = calcularSumaPares(n);

        System.out.println("La suma de los números pares entre 1 y " + n + " es: " + suma);

        scanner.close();
    }

    public static int calcularSumaPares(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }
}
