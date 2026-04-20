package EJ10;

import java.util.*;

// Clase Persona
class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }

    // Orden natural: por nombre
    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }

    // equals y hashCode para evitar duplicados correctamente
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        Persona p = (Persona) obj;
        return Objects.equals(nombre, p.nombre) &&
               Objects.equals(apellido, p.apellido) &&
               edad == p.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad);
    }

    @Override
    public String toString() {
        return nombre + " " + (apellido == null ? "(sin apellido)" : apellido) + " (" + edad + ")";
    }
}

// Comparador por edad
class ComparadorEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

// Comparador por apellido
class ComparadorApellido implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        // Controlamos null para evitar errores
        if (p1.getApellido() == null && p2.getApellido() == null) return 0;
        if (p1.getApellido() == null) return -1;
        if (p2.getApellido() == null) return 1;

        return p1.getApellido().compareTo(p2.getApellido());
    }
}

// Comparador compuesto: apellido -> nombre -> edad
class ComparadorCompleto implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {

        // 1. Comparar por apellido (los null primero)
        if (p1.getApellido() == null && p2.getApellido() != null) return -1;
        if (p1.getApellido() != null && p2.getApellido() == null) return 1;

        int cmpApellido = 0;
        if (p1.getApellido() != null && p2.getApellido() != null) {
            cmpApellido = p1.getApellido().compareTo(p2.getApellido());
        }

        if (cmpApellido != 0) return cmpApellido;

        // 2. Comparar por nombre
        int cmpNombre = p1.getNombre().compareTo(p2.getNombre());
        if (cmpNombre != 0) return cmpNombre;

        // 3. Comparar por edad
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}