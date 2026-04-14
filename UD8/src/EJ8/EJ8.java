package EJ8;

import java.util.Set;
import java.util.TreeSet;

public class EJ8 {
    public static void main(String[] args) {

        // 1. Conjunto implementado con árbol (TreeSet)
        Set<Integer> numeros = new TreeSet<>();

        // 2. Añadir números en orden aleatorio
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);

        // 3. Recorrer e imprimir ordenados
        System.out.println("Números ordenados:");
        for (Integer num : numeros) {
            System.out.println(num);
        }

        // 4. Lo mismo con nombres de alumnos
        Set<String> alumnos = new TreeSet<>();

        alumnos.add("Carlos");
        alumnos.add("Ana");
        alumnos.add("Luis");

        System.out.println("Alumnos ordenados:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}

/*
CONCLUSIONES:

- TreeSet ordena automáticamente los elementos.
- En números: de menor a mayor.
- En Strings: orden alfabético.
- No permite duplicados.
- No permite null (lanza excepción).
*/