package org.example;

import java.util.Scanner;

public class NumerosDediasEnunMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el mes y el año
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int ano = scanner.nextInt();

        // Verificar si el mes es válido
        if (mes < 1 || mes > 12) {
            System.out.println("Mes inválido. Debe estar entre 1 y 12.");
            return;
        }

        // Determinar si el año es bisiesto
        boolean esBisiesto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        // Determinar el número de días en el mes
        int dias;
        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero
                dias = esBisiesto ? 29 : 28;
                break;
            default:
                dias = 0; // Esto nunca debería pasar debido a la verificación anterior
                break;
        }

        // Mostrar el número de días en el mes
        System.out.println("El mes " + mes + " del año " + ano + " tiene " + dias + " días.");

        scanner.close();
    }
}
