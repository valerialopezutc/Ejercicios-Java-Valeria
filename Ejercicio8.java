// Permite leer datos del teclado//

import java.util.Scanner; 
public class Ejercicio8 {

    public static void main(String[] args) {

        // Crea el Scanner para ingresar los segundos.
        Scanner input = new Scanner(System.in);

        // Pide una cantidad grande de segundos//
        System.out.print("Ingresa una cantidad grande de segundos (ej. 5000): ");
        int total = input.nextInt();

        // Calcula cuántas horas hay en el total//
        int r1 = total / 3600;

        // Obtiene los segundos que sobran después de calcular las horas.
        int residuo = total % 3600;

        // Convierte los segundos restantes a minutos//
        int r2 = residuo / 60;

        // Obtiene los segundos que sobran después de calcular los minutos//
        int r3 = residuo % 60;

        // Muestra el resultado en horas, minutos y segundos//
        System.out.println("Conversión final: " + r1 + " h : " + r2 + " m : " + r3 + " s");

        // Cierra el Scanner//
        input.close();
    }
}
