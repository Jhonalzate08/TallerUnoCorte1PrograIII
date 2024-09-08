package org.example;
import java.util.Scanner;

public class NumeroPrimo {

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        // Casos especiales
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true; // 2 es el único número par primo
        }
        if (n % 2 == 0) {
            return false; // Si es par y distinto de 2, no es primo
        }

        // Verificar desde 3 hasta la raíz cuadrada de n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // Si encontramos un divisor, no es primo
            }
        }
        return true; // Si no encontramos divisores, es primo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }
}

