package EJ6;

import java.util.Scanner;

public class EJ6 {

    public static void main(String[] args) {

        // Scanner permite leer datos introducidos por teclado
        Scanner sc = new Scanner(System.in);

        // Pedimos el nombre al usuario
        System.out.println("¿Cuál es tu nombre?");
        
        // nextLine() lee una línea completa de texto
        String nombre = sc.nextLine();

        // Pedimos la edad que cree que vivirá
        System.out.println("¿Cuántos años crees que vivirás?");
        
        // nextInt() lee un número entero
        int años = sc.nextInt();

        // Mostramos el mensaje final
        // Se suma 10 a la cantidad indicada por el usuario
        System.out.println("Hola " + nombre +
                ", segun las leyendas urbanas vas a morir a los "
                + (años + 10)
                + " por culpa de comer sentado");

        // Cerramos el Scanner para liberar recursos
        sc.close();
    }
}
