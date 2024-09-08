package org.example;

import java.util.Scanner;

public class SumaDeDigitos {

    // Método para sumar todos los dígitos de un número
    public static int sumarDigitos(int n) {
        int suma = 0;
        int numero = Math.abs(n); // Tomar el valor absoluto para manejar números negativos

        // Sumar cada dígito del número
        while (numero > 0) {
            suma += numero % 10; // Obtener el último dígito
            numero /= 10;        // Eliminar el último dígito
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número
        System.out.print("Ingrese un número para sumar sus dígitos: ");
        int n = scanner.nextInt();

        // Calcular la suma de los dígitos
        int resultado = sumarDigitos(n);

        // Mostrar el resultado
        System.out.println("La suma de los dígitos de " + n + " es: " + resultado);

        scanner.close();
    }
}

