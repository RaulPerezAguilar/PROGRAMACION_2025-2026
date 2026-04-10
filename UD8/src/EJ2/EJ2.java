package EJ2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class EJ2 {

    public static void main(String[] args) {

        // Lista original (ArrayList)
        List<Persona> lista = new ArrayList<>();

        Persona p1 = new Persona("Paco");
        Persona p2 = new Persona("Ana");
        Persona p3 = new Persona("Luis");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println("Lista original: " + lista);

        // 1️⃣ Copiar a LinkedList
        List<Persona> listaLinked = new LinkedList<>(lista);
        System.out.println("LinkedList copiada: " + listaLinked);

        // 2️⃣ Intercambiar primera y última
        if(!listaLinked.isEmpty()) {
            int primero = 0;
            int ultimo = listaLinked.size() - 1;
            listaLinked.set(ultimo, listaLinked.get(primero));
        }

        System.out.println("Intercambio primera y ultima: " + listaLinked);

        // 3️⃣ Modificar nombre de la primera persona
        listaLinked.get(0).setNombre("NombreModificado");
        System.out.println("Modificar primera persona: " + listaLinked);

        // 4️⃣ Eliminar persona central
        int indiceCentral = listaLinked.size() / 2;
        listaLinked.remove(indiceCentral);
        System.out.println("Eliminar central: " + listaLinked);

        // 5️⃣ Recorrer con for clásico
        System.out.println("Recorrido con for:");
        for (int i = 0; i < listaLinked.size(); i++) {
            System.out.println(listaLinked.get(i).getNombre());
        }

        // 6️⃣ Añadir persona y comprobar
        Persona nueva = new Persona("Ale");
        listaLinked.add(nueva);

        if (listaLinked.contains(nueva)) {
            System.out.println("Ale esta en la lista");
        }

        System.out.println("Lista tras nueva: " + listaLinked);

        // 7️⃣ Vaciar lista
        listaLinked.clear();

        if (listaLinked.isEmpty()) {
            System.out.println("La lista esta vacia");
        }

        System.out.println("Lista final: " + listaLinked);
    }
}