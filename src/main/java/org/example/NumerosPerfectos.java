package org.example;

import java.util.Scanner;

public class NumerosPerfectos {

    // Método para verificar si un número es perfecto
    public static boolean esPerfecto(int n) {
        if (n <= 0) {
            return false; // Números negativos y cero no son considerados perfectos
        }

        int sumaDivisores = 0;

        // Encontrar los divisores propios de n
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificar si la suma de los divisores es igual al número
        return sumaDivisores == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número n
        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int n = scanner.nextInt();

        // Verificar si el número es perfecto
        if (esPerfecto(n)) {
            System.out.println(n + " es un número perfecto.");
        } else {
            System.out.println(n + " no es un número perfecto.");
        }

        scanner.close();
    }
}

