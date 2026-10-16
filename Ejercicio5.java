import java.util.Scanner; // Permite leer datos del teclado.

public class Ejercicio5 {

    public static void main(String[] args) {

        // Crea el Scanner para leer el código que ingrese el usuario.
        Scanner s = new Scanner(System.in);

        // Guarda el código correcto e inicializa el intento.
        int claveSecreta = 7;
        int intento;

        // Muestra un mensaje de bienvenida.
        System.out.println("¡Bienvenido al sistema de verificación!");

        // Pide el código al menos una vez.
        do {
            System.out.print("Introduce el código numérico de acceso (del 1 al 10): ");
            intento = s.nextInt();

            // Si el código es incorrecto, muestra un mensaje.
            if (intento != claveSecreta) {
                System.out.println("Acceso denegado. Intenta de nuevo.");
            }

        // Repite mientras el código sea incorrecto.
        } while (intento != claveSecreta);

        // Muestra el mensaje cuando el código es correcto.
        System.out.println("¡Acceso concedido! Código correcto.");

        // Cierra el Scanner.
        s.close();
    }
}
