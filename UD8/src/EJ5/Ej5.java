/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package EJ5;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Ej5 {
    public static void main(String[] args) {

        // 1. Crear conjunto vacío
        Set<Integer> conjunto = new HashSet<>();

        // 2. Añadir primeros 5 números naturales
        for (int i = 1; i <= 5; i++) {
            conjunto.add(i);
        }

        // 3. Imprimir el conjunto
        System.out.println("Conjunto: " + conjunto);

        // 4. Añadir un número repetido
        conjunto.add(3);
        System.out.println("Tras añadir repetido (3): " + conjunto);

        // 5. Añadir null
        conjunto.add(null);
        System.out.println("Tras añadir null: " + conjunto);

        // 6. Crear nuevo conjunto con los dos primeros números primos
        Set<Integer> primos = new HashSet<>();
        primos.add(2);
        primos.add(3);

        // Comprobar si es subconjunto
        boolean esSubconjunto = conjunto.containsAll(primos);
        System.out.println("¿Primos es subconjunto?: " + esSubconjunto);

        // 7. Lista final a partir del conjunto
        final List<Integer> lista = new ArrayList<>(conjunto);

        System.out.println("Lista inicial: " + lista);

        // Modificaciones en la lista
        lista.add(100);
        lista.remove(0);
        lista.set(0, 999);

        System.out.println("Lista modificada: " + lista);
    }
}

/*
RESPUESTAS:

- ¿Imprime referencia o valor?
  Imprime el contenido (valores) del conjunto, no la referencia de memoria.

- ¿Permite duplicados?
  No. Un Set no permite elementos duplicados.

- ¿Permite nulos?
  Sí, HashSet permite un único valor null.

- ¿El segundo conjunto es subconjunto?
  Sí, usamos containsAll() para comprobarlo.

- ¿La lista final es inmutable?
  No. El modificador final solo impide cambiar la referencia de la lista,
  pero sí se pueden añadir, eliminar o modificar elementos.
*/