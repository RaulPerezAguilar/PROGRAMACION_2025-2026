package EJ7;

import java.util.LinkedHashSet;
import java.util.Set;

public class EJ7 {
    public static void main(String[] args) {

        // 1. Crear conjunto vacío (usando interfaz)
        Set<String> alumnos = new LinkedHashSet<>();

        // 2. Añadir nombres
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("Carlos");
        alumnos.add("Marta");
        alumnos.add("Lucia");

        // 3. Imprimir conjunto
        System.out.println("Conjunto: " + alumnos);

        // 4. Añadir repetido
        alumnos.add("Ana");
        System.out.println("Tras añadir repetido: " + alumnos);

        // 5. Añadir null
        alumnos.add(null);
        System.out.println("Tras añadir null: " + alumnos);

        // 6. Recorrer conjunto en orden de inserción
        System.out.println("Recorrido con prefijo:");
        for (String alumno : alumnos) {
            System.out.println("D. " + alumno);
        }
    }
}

/*
RESPUESTAS:

- ¿Imprime referencia o valor?
  Imprime los valores del conjunto, no la referencia.

- ¿Permite duplicados?
  No, LinkedHashSet no permite duplicados.

- ¿Permite nulos?
  Sí, permite un único valor null.

- Orden de recorrido:
  LinkedHashSet mantiene el orden de inserción (igual que se añadieron).

- Comparación con HashSet:
  HashSet NO mantiene el orden, los elementos aparecerían en orden aleatorio.
*/