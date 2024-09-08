package org.example;
import java.util.Scanner;

public class NumeroInvertido {

        // Método para invertir un número
        public static int invertirNumero(int n) {
            int invertido = 0;
            int resto;

            while (n != 0) {
                resto = n % 10;  // Obtener el último dígito
                invertido = invertido * 10 + resto;  // Agregar el dígito al número invertido
                n /= 10;  // Eliminar el último dígito del número original
            }

            return invertido;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            // Llamar al método invertirNumero y mostrar el resultado
            int numeroInvertido = invertirNumero(numero);
            System.out.println("El número invertido es: " + numeroInvertido);

            scanner.close();
        }
    }
