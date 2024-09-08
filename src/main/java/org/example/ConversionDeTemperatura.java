package org.example;

import java.util.Scanner;

public class ConversionDeTemperatura {

    // Método para convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura en Celsius
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertir a Fahrenheit
        double fahrenheit = celsiusAFahrenheit(celsius);

        // Mostrar el resultado
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}

