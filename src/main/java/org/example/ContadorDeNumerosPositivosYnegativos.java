package org.example;

import java.util.Scanner;

public class ContadorDeNumerosPositivosYnegativos {

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

        // Inicializar contadores
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        // Leer los números y contar positivos y negativos
        System.out.println("Ingrese " + n + " números:");
        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números positivos: " + contadorPositivos);
        System.out.println("Cantidad de números negativos: " + contadorNegativos);

        scanner.close();
    }
}
