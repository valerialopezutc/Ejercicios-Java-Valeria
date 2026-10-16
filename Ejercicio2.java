
import java.util.Scanner; // Importa Scanner para leer datos del teclado.

public class Ejercicio2 {

    public static void main(String[] args) {

        // Crea un Scanner para recibir datos del usuario.
        Scanner scanner = new Scanner(System.in);

        // Pide un número entero positivo.
        System.out.print("Introduce un número entero positivo: ");
        int x = scanner.nextInt();

        // Inicializa la variable y en cero.
        int y = 0;

        // Repite el bloque mientras x sea mayor que cero.
        while (x > 0) {

            // Suma el valor actual de x a y.
            y += x;

            // Disminuye x en una unidad.
            x--;
        }

        // Muestra el resultado final calculado.
        System.out.println("El valor final calculado es: " + y);

        // Cierra el Scanner.
        scanner.close();
    }
}
