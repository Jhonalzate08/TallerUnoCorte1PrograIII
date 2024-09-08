package org.example;

import java.util.Scanner;

public class ConteoDePalabrasEnunaFrase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Dividir la frase en palabras usando el espacio como delimitador
        String[] palabras = frase.trim().split("\\s+");

        // Contar las palabras
        int conteoPalabras = palabras.length;

        // Mostrar el resultado
        System.out.println("La cantidad de palabras en la frase es: " + conteoPalabras);

        scanner.close();
    }
}

