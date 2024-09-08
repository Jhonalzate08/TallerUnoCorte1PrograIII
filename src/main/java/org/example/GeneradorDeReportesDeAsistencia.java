package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneradorDeReportesDeAsistencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        // Verificar que la cantidad sea positiva
        if (cantidadEstudiantes <= 0) {
            System.out.println("La cantidad de estudiantes debe ser un número positivo.");
            return;
        }

        // Crear un array para la asistencia
        int[] asistencia = new int[cantidadEstudiantes];

        // Solicitar al usuario que ingrese los datos de asistencia
        System.out.println("Ingrese 1 para presente y 0 para ausente para cada estudiante:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            asistencia[i] = scanner.nextInt();
            // Verificar que el valor ingresado sea 0 o 1
            if (asistencia[i] != 0 && asistencia[i] != 1) {
                System.out.println("Valor inválido. Debe ingresar 0 o 1.");
                return;
            }
        }

        // Calcular el porcentaje de asistencia, el número de ausencias y la lista de presentes
        Reporte resultado = generarReporte(asistencia);

        // Mostrar el reporte
        System.out.printf("Porcentaje de asistencia: %.2f%%%n", resultado.porcentajeAsistencia);
        System.out.println("Número de ausencias: " + resultado.numeroAusencias);
        System.out.println("Lista de estudiantes presentes: " + resultado.listaPresentes);

        scanner.close();
    }

    // Método para generar el reporte de asistencia
    public static Reporte generarReporte(int[] asistencia) {
        int totalEstudiantes = asistencia.length;
        int cantidadPresentes = 0;
        List<Integer> listaPresentes = new ArrayList<>();

        // Contar presentes y ausentes
        for (int i = 0; i < totalEstudiantes; i++) {
            if (asistencia[i] == 1) {
                cantidadPresentes++;
                listaPresentes.add(i + 1); // +1 para representar el estudiante (empezando desde 1)
            }
        }

        int numeroAusencias = totalEstudiantes - cantidadPresentes;
        double porcentajeAsistencia = (double) cantidadPresentes / totalEstudiantes * 100;

        return new Reporte(porcentajeAsistencia, numeroAusencias, listaPresentes);
    }

    // Clase para almacenar el reporte de asistencia
    static class Reporte {
        double porcentajeAsistencia;
        int numeroAusencias;
        List<Integer> listaPresentes;

        Reporte(double porcentajeAsistencia, int numeroAusencias, List<Integer> listaPresentes) {
            this.porcentajeAsistencia = porcentajeAsistencia;
            this.numeroAusencias = numeroAusencias;
            this.listaPresentes = listaPresentes;
        }
    }
}

