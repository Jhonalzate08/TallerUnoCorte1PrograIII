package org.example;
import java.util.Scanner;

public class ContadorDeVocales {


        public static int contarVocales(String texto) {
            int contador = 0;
            texto = texto.toLowerCase();  // Convertir el texto a minúsculas para facilitar la comparación

            // Recorrer cada carácter de la cadena
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);  // Obtener el carácter en la posición i
                if (esVocal(c)) {  // Verificar si es una vocal
                    contador++;  // Incrementar el contador de vocales
                }
            }

            return contador;
        }

        // Método auxiliar para verificar si un carácter es una vocal
        private static boolean esVocal(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un texto: ");
            String texto = scanner.nextLine();

            int cantidadVocales = contarVocales(texto);
            System.out.println("La cantidad de vocales en el texto es: " + cantidadVocales);

            scanner.close();
        }
    }
