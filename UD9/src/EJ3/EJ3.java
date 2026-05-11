package EJ3;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {

    	// Scanner para leer texto del teclado
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario que escriba su nombre
        System.out.println("Introduzca su nombre y después pulse intro para finalizar");

        // nextLine() permite leer una cantidad indeterminada de caracteres
        String nombre = teclado.nextLine();
        String nombre2 = teclado.next();
        String nombre3 = teclado.next();
        

        // Mostramos el saludo
        System.out.println("Hola " + nombre + "!");
        System.out.println("Hola " + nombre2 + "!");
        System.out.println("Hola " + nombre3 + "!");

    }
}