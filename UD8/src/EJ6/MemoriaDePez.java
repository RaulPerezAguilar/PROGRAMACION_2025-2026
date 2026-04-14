package EJ6;

import java.util.LinkedHashSet;
import java.util.Set;

public class MemoriaDePez {
    public static void main(String[] args) {

        Set<String> colores = new LinkedHashSet<>();

        // Añadimos en orden "aleatorio"
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Negro");

        System.out.println("Colores en orden de inserción:");
        System.out.println(colores);
    }
}