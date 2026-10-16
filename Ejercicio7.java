import java.util.Scanner; // Permite leer datos del teclado.

public class Ejercicio7 {

    public static void main(String[] args) {

        // Crea el Scanner para ingresar el año.
        Scanner scanner = new Scanner(System.in);

        // Pide un año al usuario.
        System.out.print("Introduce un año cualquiera (ej. 2024): ");
        int n = scanner.nextInt();

        // Inicializa la bandera en falso.
        boolean bandera = false;

        // Comprueba si el año es bisiesto.
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            bandera = true;
        }

        // Muestra el resultado dependiendo de la condición.
        if (bandera) {
            System.out.println("El año " + n + " tiene la propiedad: TIPO_A");
        } else {
            System.out.println("El año " + n + " tiene la propiedad: TIPO_B");
        }

        // Cierra el Scanner.
        scanner.close();
    }
}
