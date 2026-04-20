package EJ10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EJ10 {
	public class Main {
	    public static void main(String[] args) {

	        List<Persona> personas = new ArrayList<>();

	        personas.add(new Persona("Ana", "Lopez", 30));
	        personas.add(new Persona("Juan", "Perez", 25));
	        personas.add(new Persona("Luis", null, 40));
	        personas.add(new Persona("Ana", "Garcia", 20));
	        personas.add(new Persona("Carlos", null, 35));

	        // Orden por edad
	        Collections.sort(personas, new ComparadorEdad());
	        System.out.println("Orden por edad:");
	        System.out.println(personas);

	        // Orden por apellido
	        Collections.sort(personas, new ComparadorApellido());
	        System.out.println("\nOrden por apellido:");
	        System.out.println(personas);

	        // Orden completo
	        Collections.sort(personas, new ComparadorCompleto());
	        System.out.println("\nOrden completo (apellido, nombre, edad):");
	        System.out.println(personas);
	    }
	}
}
