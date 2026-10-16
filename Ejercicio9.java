// Permite leer datos del teclado//
import java.util.Scanner; 

public class Ejercicio9 {

    public static void main(String[] args) {

        // Crea el Scanner para ingresar el límite//     
         Scanner s = new Scanner(System.in);

        // Pide el número límite máximo.
        System.out.print("Piensa en un número límite máximo: ");
        int limite = s.nextInt();

        // Avisa que se generarán cinco números.
        System.out.println("Generando 5 números especiales bajo el límite...");

        // Repite el proceso cinco veces//
        for (int i = 0; i < 5; i++) {

            // Genera un número aleatorio desde 1 hasta el límite//
            int resultado = (int) (Math.random() * limite) + 1;

            // Muestra el número generado//
            System.out.println("Número [" + (i + 1) + "]: " + resultado);
        }

        // Cierra el Scanner//
        s.close();
    }
}
