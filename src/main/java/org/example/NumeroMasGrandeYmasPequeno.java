package org.example;

import java.util.Scanner;

public class NumeroMasGrandeYmasPequeno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Verificar que la cantidad sea positiva
        if (n <= 0) {
            System.out.println("La cantidad de números debe ser mayor que 0.");
            return;
        }

        // Inicializar variables para el número más grande y más pequeño
        int max = Integer.MIN_VALUE; // Valor mínimo posible para inicialización
        int min = Integer.MAX_VALUE; // Valor máximo posible para inicialización

        // Leer los números y encontrar el máximo y el mínimo
        System.out.println("Ingrese " + n + " números:");
        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();
            if (numero > max) {
                max = numero; // Actualizar el número más grande
            }
            if (numero < min) {
                min = numero; // Actualizar el número más pequeño
            }
        }

        // Mostrar los resultados
        System.out.println("El número más grande es: " + max);
        System.out.println("El número más pequeño es: " + min);

        scanner.close();
    }
}

