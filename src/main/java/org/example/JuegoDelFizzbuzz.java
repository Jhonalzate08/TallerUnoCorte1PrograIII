package org.example;

import java.util.Scanner;

public class JuegoDelFizzbuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        // Iterar desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // Múltiplo de 3 y 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                // Múltiplo de 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                // Múltiplo de 5
                System.out.println("Buzz");
            } else {
                // Número que no es múltiplo ni de 3 ni de 5
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

