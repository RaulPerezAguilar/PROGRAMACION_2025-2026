package EJ9;

import java.util.*;

// Clase Persona
class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Orden natural por nombre (alfabético)
    @Override
    public int compareTo(Persona o) {
//    	return this.getNombre().compareTo(((persona)p).getNombre());
        return this.nombre.compareTo(o.nombre);
    }

    // Igualdad por nombre y apellido
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        Persona p = (Persona) obj;
        return Objects.equals(nombre, p.nombre) &&
               Objects.equals(apellido, p.apellido);
    }

    // Hash consistente con equals
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}