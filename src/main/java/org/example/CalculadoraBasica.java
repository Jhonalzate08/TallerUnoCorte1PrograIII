package org.example;

import java.util.Scanner;

public class CalculadoraBasica {

    public static double calcular(int a, int b, char operacion) {
        switch (operacion) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / (double)b; // Convertir a double para una división precisa
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN; // Valor no numérico
                }
            default:
                System.out.println("Operación no válida.");
                return Double.NaN; // Retorna un valor inválido si la operación no es reconocida
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los valores de a, b y la operación al usuario
        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número (b): ");
        int b = scanner.nextInt();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        // Realizar el cálculo
        double resultado = calcular(a, b, operacion);

        // Mostrar el resultado
        if (!Double.isNaN(resultado)) {
            System.out.println("El resultado de " + a + " " + operacion + " " + b + " es: " + resultado);
        }

        scanner.close();
    }
}

