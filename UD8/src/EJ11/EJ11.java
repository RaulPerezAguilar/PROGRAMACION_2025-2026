package EJ11;

import java.util.*;

public class EJ11 {

    public static void main(String[] args) {

        // HashSet evita duplicados automáticamente.
        Set<String> libros = new HashSet<>();

        // Añadir libros
        libros.add("El Quijote");
        libros.add("1984");
        libros.add("Cien años de soledad");
        libros.add("1984"); // Duplicado (no se añadirá)

        System.out.println("Libros almacenados:");
        System.out.println(libros);

        // Recorrido con Iterator
        System.out.println("\nRecorrido con Iterator:");
        Iterator<String> it = libros.iterator();

        while (it.hasNext()) {
            String libro = it.next();
            System.out.println(libro);
        }

        // Recorrido con for-each
        System.out.println("\nRecorrido con for-each:");
        for (String libro : libros) {
            System.out.println(libro);
        }
    }
}

/*
REFLEXIÓN:

1. ¿Por qué HashSet no garantiza orden?
Porque está basado en una tabla hash, y los elementos se colocan según su hashCode,
no en el orden de inserción.

2. ¿Cuándo usar Iterator en lugar de for-each?
Cuando necesitas eliminar elementos durante la iteración (usando iterator.remove())
o tener más control del recorrido.

3. ¿Qué pasa si modificas el Set en un for-each?
Lanza una ConcurrentModificationException, porque no se permite modificar la colección
mientras se recorre de esa forma.
*/
