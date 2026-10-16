
import java.util.Scanner; // Importa Scanner para leer datos del teclado.

public class Ejercicio1 {

    public static void main(String[] args) {

        // Crea un objeto Scanner para recibir datos del usuario.
        Scanner s = new Scanner(System.in);

        // Pide el primer número entero y lo guarda en la variable a.
        System.out.print("Ingresa un número entero: ");
        int a = s.nextInt();

        // Pide el segundo número entero y lo guarda en la variable b.
        System.out.print("Ingresa otro número entero: ");
        int b = s.nextInt();

        // Comprueba si el primer número es mayor o igual a 18.
        if (a >= 18) {

            // Si a cumple la condición, comprueba si b es mayor o igual a 80.
            if (b >= 80) {
                System.out.println("Resultado: STATUS_A");

            } else {
                // Si b es menor que 80, muestra STATUS_B.
                System.out.println("Resultado: STATUS_B");
            }

        } else {
            // Si a es menor que 18, muestra STATUS_C.
            System.out.println("Resultado: STATUS_C");
        }

        // Cierra el Scanner al terminar de utilizarlo.
        s.close();
    }
}
