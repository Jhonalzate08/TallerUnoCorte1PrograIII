package org.example;

import java.util.Scanner;

public class SumaDeParesYimpares {

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

        // Inicializar variables para las sumas
        int sumaPares = 0;
        int sumaImpares = 0;

        // Leer los números y sumarlos por categoría
        System.out.println("Ingrese " + n + " números:");
        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                sumaPares += numero; // Sumar números pares
            } else {
                sumaImpares += numero; // Sumar números impares
            }
        }

        // Mostrar los resultados
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);

        scanner.close();
    }
}

