package org.example;

import java.util.Scanner;

public class ImpresionDeMatrizIdentidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = scanner.nextInt();

        // Validar que el tamaño sea positivo
        if (n <= 0) {
            System.out.println("El tamaño de la matriz debe ser un entero positivo.");
            return;
        }

        // Crear y llenar la matriz identidad
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;  // Elementos de la diagonal principal
                } else {
                    matriz[i][j] = 0;  // Todos los demás elementos
                }
            }
        }

        // Imprimir la matriz identidad
        System.out.println("Matriz Identidad de tamaño " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

