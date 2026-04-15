package EJ9;

import java.util.*;

public class EJ9 {
    public static void main(String[] args) {

        // TreeSet: no permite duplicados y mantiene orden natural (Comparable)
        Set<Persona> personas = new TreeSet<>();

        // Añadimos personas (el duplicado no se guardará)
        personas.add(new Persona("David", "Lopez"));
        personas.add(new Persona("Fran", "Garcia"));
        personas.add(new Persona("Luis", "Martinez"));
        personas.add(new Persona("Fran", "Garcia")); // duplicado
        

        // Mostramos: aparecen ordenadas alfabéticamente por nombre
        System.out.println("TreeSet:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        // Creamos dos objetos iguales para probar equals y hashCode
        Persona p1 = new Persona("Ana", "Garcia");
        Persona p2 = new Persona("Ana", "Garcia");

        // equals: comprueba si son "la misma persona" lógicamente
        System.out.println("\n¿Iguales? " + p1.equals(p2));

        // hashCode: necesario para colecciones hash (consistente con equals)
        System.out.println("Hash p1: " + p1.hashCode());
        System.out.println("Hash p2: " + p2.hashCode());

        // LinkedHashSet: mantiene orden de inserción (no ordena)
        Set<Persona> personasInsercion = new LinkedHashSet<>(personas);

        // Mostramos: respeta el orden en que se insertaron
        System.out.println("\nLinkedHashSet:");
        for (Persona p : personasInsercion) {
            System.out.println(p);
        }
    }
}