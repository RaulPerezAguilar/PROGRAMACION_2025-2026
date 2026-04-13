package EJ3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal para gestionar una lista de nombres.
 * Permite:
 * - Añadir nombres
 * - Mostrar la lista
 * - Eliminar nombres
 * - Contar elementos
 */
public class EJ3 {

    public static void main(String[] args) {

        // Crear lista de nombres
        List<String> nombres = new ArrayList<>();

        // Añadir nombres iniciales
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Sofía");

        // Mostrar nombres
        mostrarNombres(nombres);

        Scanner scanner = new Scanner(System.in);

        // Añadir nuevo nombre
        System.out.print("Introduce un nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        nombres.add(nuevoNombre);

        // Mostrar lista actualizada
        System.out.println("\nLista tras añadir:");
        mostrarNombres(nombres);

        // Eliminar nombre
        System.out.print("\nIntroduce el nombre a eliminar: ");
        String nombreEliminar = scanner.nextLine();

        if (nombres.contains(nombreEliminar)) {
            nombres.remove(nombreEliminar);
            System.out.println("Nombre eliminado correctamente.");
        } else {
            System.out.println("El nombre no se encuentra en la lista.");
        }

        // Mostrar lista final
        System.out.println("\nLista final:");
        mostrarNombres(nombres);

        // Mostrar número total de nombres
        System.out.println("\nNúmero total de nombres: " + nombres.size());

        scanner.close();
    }

    /**
     * Método que muestra todos los nombres de la lista
     * usando un bucle for-each.
     */
    public static void mostrarNombres(List<String> nombres) {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}