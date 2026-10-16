// Permite leer datos del teclado//

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Crea el Scanner para ingresar las medidas//
        Scanner sc = new Scanner(System.in);

        // Pide la longitud del lado A//
        System.out.print("Ingresa la longitud del lado A: ");
        double a = sc.nextDouble();

        // Pide la longitud del lado B//
        System.out.print("Ingresa la longitud del lado B: ");
        double b = sc.nextDouble();

        // Pide la longitud del lado C//
        System.out.print("Ingresa la longitud del lado C: ");
        double c = sc.nextDouble();

        // Comprueba si las medidas pueden formar un triángulo//
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            // Se muestra si las medidas son válidas//
            System.out.println("Resultado del análisis: ESTRUCTURA_VÁLIDA");
        } else {
            // Se muestra si las medidas no son válidas//
            System.out.println("Resultado del análisis: ESTRUCTURA_INVÁLIDA");
        }

        // Cierra el Scanner//
        sc.close();
    }
}

