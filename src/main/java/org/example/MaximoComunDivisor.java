package org.example;
import java.util.Scanner;

public class MaximoComunDivisor {

        // Método de Euclides
        public static int calcularMCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer número (a): ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el segundo número (b): ");
            int b = scanner.nextInt();

            // Calcular el MCD
            int mcd = calcularMCD(a, b);

            System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);

            scanner.close();
        }
    }
