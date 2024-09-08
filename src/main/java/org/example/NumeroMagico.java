package org.example;

import java.util.Scanner;

public class NumeroMagico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Verificar si el número es mágico
        if (esMagico(numero)) {
            System.out.println("El número " + numero + " es mágico.");
        } else {
            System.out.println("El número " + numero + " no es mágico.");
        }

        scanner.close();
    }

    // Método para verificar si un número es mágico
    public static boolean esMagico(int numero) {
        // Obtener el valor absoluto del número para manejar números negativos
        numero = Math.abs(numero);

        // Si el número es 0, no es mágico
        if (numero == 0) {
            return false;
        }

        // Calcular la raíz digital
        int sumaDigitos = numero;
        while (sumaDigitos > 9) {
            sumaDigitos = sumaDigitosDeDigitos(sumaDigitos);
        }

        // Verificar si la raíz digital es 1
        return sumaDigitos == 1;
    }

    // Método para sumar los dígitos de un número
    public static int sumaDigitosDeDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}

