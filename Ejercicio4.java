
import java.util.Scanner; // Permite leer texto del teclado.

public class Ejercicio4 {

    public static void main(String[] args) {

        // Crea el Scanner para leer la frase.
        Scanner scanner = new Scanner(System.in);

        // Pide una frase y la convierte a minúsculas.
        System.out.print("Escribe una frase o palabra en minúsculas: ");
        String texto = scanner.nextLine().toLowerCase();

        // Inicializa el contador de vocales.
        int contador = 0;

        // Recorre cada carácter del texto.
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            // Comprueba si el carácter es una vocal.
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++; // Aumenta el contador si es vocal.
                    break;
            }
        }

        // Muestra el total de vocales encontradas.
        System.out.println("El total de elementos clave encontrados es: " + contador);

        // Cierra el Scanner.
        scanner.close();
    }
}
