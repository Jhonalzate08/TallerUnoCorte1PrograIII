package org.example;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        boolean adivinado = false;

        System.out.println("¡Adivina el número entre 1 y 100!");

        // Bucle para permitir al usuario adivinar hasta acertar
        while (!adivinado) {
            System.out.print("Ingresa tu adivinanza: ");
            intento = scanner.nextInt();

            // Comparar la adivinanza con el número secreto
            if (intento == numeroSecreto) {
                System.out.println("¡Correcto! Has adivinado el número.");
                adivinado = true;
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número secreto es menor. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
