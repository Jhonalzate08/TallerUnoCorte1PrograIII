package org.example;
import java.util.Scanner;

public class SecuenciaDeFibonacci {


        // Método para generar los primeros n términos de la secuencia de Fibonacci
        public static void generarFibonacci(int n) {
            int a = 0, b = 1;

            System.out.print("Secuencia de Fibonacci: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");

                // Calcular el siguiente número en la secuencia
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }

            System.out.println();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número entero: ");
            int n = scanner.nextInt();

            generarFibonacci(n);

            scanner.close();
        }
    }
