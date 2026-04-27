package EJ15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EJ15 {

	public static void main(String[] args) {

		// 1. Crear lista con 6 puntuaciones desordenadas
		List<Integer> puntuaciones = new ArrayList<>();

		puntuaciones.add(450);
		puntuaciones.add(1200);
		puntuaciones.add(300);
		puntuaciones.add(800);
		puntuaciones.add(1500);
		puntuaciones.add(100);

		System.out.println("Lista original:");
		System.out.println(puntuaciones);

		// 2. Ordenar de menor a mayor
		Collections.sort(puntuaciones);
		System.out.println("\nLista ordenada:");
		System.out.println(puntuaciones);

		// 3. Máximo y mínimo
		int max = Collections.max(puntuaciones);
		int min = Collections.min(puntuaciones);

		System.out.println("\nMáxima puntuación: " + max);
		System.out.println("Mínima puntuación: " + min);

		// 4. Desordenar lista
		Collections.shuffle(puntuaciones);
		System.out.println("\nLista desordenada (shuffle):");
		System.out.println(puntuaciones);
	}
}