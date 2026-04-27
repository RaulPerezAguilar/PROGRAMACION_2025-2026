package EJ14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class EJ14 {

	public static void main(String[] args) {

		HashMap<String, Integer> aleatorio = new HashMap<>();
		LinkedHashMap<String, Integer> insercion = new LinkedHashMap<>();
		TreeMap<String, Integer> alfabetico = new TreeMap<>();

		aleatorio.put("Zoe", 85);
		aleatorio.put("Bernat", 92);
		aleatorio.put("Ana", 78);
		aleatorio.put("Mario", 88);

		insercion.put("Zoe", 85);
		insercion.put("Bernat", 92);
		insercion.put("Ana", 78);
		insercion.put("Mario", 88);

		alfabetico.put("Zoe", 85);
		alfabetico.put("Bernat", 92);
		alfabetico.put("Ana", 78);
		alfabetico.put("Mario", 88);

		mostrarMapa(aleatorio, "HashMap");
		mostrarMapa(insercion, "LinkedHashMap");
		mostrarMapa(alfabetico, "TreeMap");
	}

	public static void mostrarMapa(Map<String, Integer> mapa, String tipo) {

		System.out.println("\nMapa tipo: " + tipo);

		Iterator<Map.Entry<String, Integer>> it = mapa.entrySet().iterator();

		while (it.hasNext()) {

			Map.Entry<String, Integer> entrada = it.next();

			System.out.println(entrada.getKey() + " -> " + entrada.getValue());
		}
	}
}