package org.example;

import java.util.Scanner;

public class BucleDeSumaHastaCero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int numero;

        System.out.println("Ingrese números para sumar. Ingrese 0 para finalizar.");

        // Bucle para ingresar números y sumar hasta que se ingrese un cero
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma += numero; // Acumulación de la suma
        } while (numero != 0);

        // Mostrar el resultado de la suma
        System.out.println("La suma de los números ingresados es: " + suma);

        scanner.close();
    }
}

