import java.util.Scanner; // Permite leer lo que escribe el usuario.

public class Ejercicio3 {

    public static void main(String[] args) {

        // Crea el Scanner para leer el texto.
        Scanner sc = new Scanner(System.in);

        // Pide una palabra o un texto corto.
        System.out.print("Escribe una palabra o texto corto: ");
        String texto = sc.nextLine();

        // Guarda el texto invertido.
        String resultado = "";

        // Recorre el texto desde el último carácter hasta el primero.
        for (int i = texto.length() - 1; i >= 0; i--) {

            // Agrega cada carácter al resultado.
            resultado += texto.charAt(i);
        }

        // Muestra el texto transformado.
        System.out.println("Texto transformado: " + resultado);

        // Cierra el Scanner.
        sc.close();
    }
}
