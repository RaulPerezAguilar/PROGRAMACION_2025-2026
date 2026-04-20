package EJ12;

import java.util.*;

public class EJ12 {

    public static void main(String[] args) {

        // Lista con valores iniciales
        ArrayList<Integer> lista = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
        );

        ListIterator<Integer> it = lista.listIterator();

        System.out.println("Recorrido hacia adelante:");

        while (it.hasNext()) {
            int valor = it.next();

            // Mostrar índice actual
            System.out.println("Índice: " + it.previousIndex() + " Valor: " + valor);

            // Multiplicar por 2 si es mayor que 50
            if (valor > 50) {
                it.set(valor * 2); // modifica el valor actual
            }
        }

        System.out.println("\nLista tras modificaciones:");
        System.out.println(lista);

        System.out.println("\nRecorrido hacia atrás:");

        while (it.hasPrevious()) {
            int valor = it.previous();

            // Mostrar índice
            System.out.println("Índice: " + it.nextIndex() + " Valor: " + valor);

            // Si es menor que 30, añadir 25 después
            if (valor < 30) {
                it.add(25); 
                // IMPORTANTE:
                // add inserta el elemento en la posición actual del iterador
            }
        }

        System.out.println("\nLista final tras inserciones:");
        System.out.println(lista);
    }
}