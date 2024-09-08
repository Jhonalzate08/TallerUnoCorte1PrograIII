package org.example;

import java.util.Scanner;

public class PromediodeNnumeros {

    // Método para calcular el promedio de n números
    public static double calcularPromedio(int cantidad, int[] numeros) {
        int suma = 0;

        // Sumar todos los números
        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }

        // Calcular el promedio
        return (double) suma / cantidad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        // Verificar que la cantidad sea positiva
        if (cantidad <= 0) {
            System.out.println("La cantidad de números debe ser mayor que 0.");
            return;
        }

        // Crear un arreglo para almacenar los números
        int[] numeros = new int[cantidad];

        // Solicitar los números al usuario
        System.out.println("Ingrese " + cantidad + " números:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Calcular el promedio
        double promedio = calcularPromedio(cantidad, numeros);

        // Mostrar el resultado
        System.out.println("El promedio de los " + cantidad + " números es: " + promedio);

        scanner.close();
    }
}

