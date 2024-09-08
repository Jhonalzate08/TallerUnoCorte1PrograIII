package org.example;

import java.util.Scanner;

public class Ordenar3Numeros {

    // Método para ordenar tres números de menor a mayor
    public static void ordenarTresNumeros(int a, int b, int c) {
        int temp;

        // Comparar y ordenar los números
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        // Mostrar los números ordenados
        System.out.println("Los números ordenados de menor a mayor son: " + a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los tres números
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = scanner.nextInt();

        // Ordenar y mostrar los números
        ordenarTresNumeros(a, b, c);

        scanner.close();
    }
}

