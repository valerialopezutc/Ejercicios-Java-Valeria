// Permite leer datos del teclado//
import java.util.Scanner; 

public class Ejercicio10 {

    public static void main(String[] args) {

        // Crea el Scanner para leer los dato//
        Scanner sc = new Scanner(System.in);

        // Pide la temperatura que se quiere converti//
        System.out.print("Introduce un valor numérico de temperatura: ");
        double temp = sc.nextDouble();

        // Muestra las opciones de conversión//
        System.out.println("Selecciona una opción (1 o 2):");
        System.out.println("1. Transformación Tipo X");
        System.out.println("2. Transformación Tipo Y");

        // Lee la opción elegida//
        int opcion = sc.nextInt();

        // Inicializa la variable del resultado//
        double resultado = 0;

        // Ejecuta la conversión según la opción//
        switch (opcion) {

            case 1:
                // Convierte de Celsius a Fahrenhet//
                resultado = (temp * 9 / 5) + 32;
                System.out.println("Resultado de la transformación: "
                        + resultado + " Unidades_F");
                break;

            case 2:
                // Convierte de Fahrenheit a Celsius//
                resultado = (temp - 32) * 5 / 9;
                System.out.println("Resultado de la transformación: "
                        + resultado + " Unidades_C");
                break;

            default:
                // Se muestra si la opción no es 1 ni 2//
                System.out.println("Error: Opción no registrada en el sistema.");
        }

        // Cierra el Scanner//
        sc.close();
    }
}
