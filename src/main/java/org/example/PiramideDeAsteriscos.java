package org.example;

import java.util.Scanner;

public class PiramideDeAsteriscos {

    // Método para dibujar la pirámide de asteriscos
    public static void dibujarPiramide(int n) {
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios para alinear los asteriscos
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Mover a la siguiente línea
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de niveles
        System.out.print("Ingrese el número de niveles para la pirámide: ");
        int n = scanner.nextInt();

        // Dibujar la pirámide
        dibujarPiramide(n);

        scanner.close();
    }
}

