package org.example;

import java.util.Scanner;

public class Palindromo {

    // Método para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String texto) {
        // Convertir a minúsculas y eliminar espacios y signos de puntuación
        String textoLimpio = texto.toLowerCase().replaceAll("[^a-z0-9]", "");

        int longitud = textoLimpio.length();

        // Comparar caracteres desde los extremos hacia el centro
        for (int i = 0; i < longitud / 2; i++) {
            if (textoLimpio.charAt(i) != textoLimpio.charAt(longitud - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        // Verificar si la cadena es un palíndromo
        if (esPalindromo(texto)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        scanner.close();
    }
}

