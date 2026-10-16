import java.util.Scanner; // Permite leer texto del teclado.

public class Ejercicio6 {

    public static void main(String[] args) {

        // Crea el Scanner para leer la frase.
        Scanner sc = new Scanner(System.in);

        // Pide una frase o un enunciado completo.
        System.out.println("Escribe una frase o un enunciado completo:");
        String entrada = sc.nextLine().trim();

        // Comprueba si la entrada está vacía.
        if (entrada.isEmpty()) {
            System.out.println("Resultado numérico: 0");

        } else {
            // Separa el texto usando los espacios.
            String[] bloques = entrada.split("\\s+");

            // Muestra cuántos bloques se encontraron.
            System.out.println("Resultado numérico: " + bloques.length);
        }

        // Cierra el Scanner.
        sc.close();
    }
}
