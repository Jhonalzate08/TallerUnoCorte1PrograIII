package org.example;

import java.util.Scanner;

public class NumeroAnstrong {

    // Método para verificar si un número es Armstrong
    public static boolean esArmstrong(int n) {
        int originalNumber = n;
        int suma = 0;
        int numDigitos = Integer.toString(n).length();

        // Calcular la suma de los dígitos elevados a la potencia del número de dígitos
        while (n > 0) {
            int digito = n % 10;
            suma += Math.pow(digito, numDigitos);
            n /= 10;
        }

        // Comparar la suma con el número original
        return suma == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número n
        System.out.print("Ingrese un número para verificar si es Armstrong: ");
        int n = scanner.nextInt();

        // Verificar si el número es Armstrong
        if (esArmstrong(n)) {
            System.out.println(n + " es un número Armstrong.");
        } else {
            System.out.println(n + " no es un número Armstrong.");
        }

        scanner.close();
    }
}

