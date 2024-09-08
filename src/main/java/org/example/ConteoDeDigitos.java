package org.example;

import java.util.Scanner;

public class ConteoDeDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Convertir el número a una cadena y contar la longitud
        int numeroDigitos = String.valueOf(Math.abs(numero)).length();

        // Mostrar el resultado
        System.out.println("El número " + numero + " tiene " + numeroDigitos + " dígitos.");

        scanner.close();
    }
}

