package org.example;

import java.util.Scanner;

public class TablaDeMultiplicar {

    // Método para generar y mostrar la tabla de multiplicar de n
    public static void generarTablaMultiplicar(int n) {
        System.out.println("Tabla de multiplicar del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número n
        System.out.print("Ingrese un número para generar su tabla de multiplicar: ");
        int n = scanner.nextInt();

        generarTablaMultiplicar(n);

        scanner.close();
    }
}

