package EJ15;

/*
 * Clase Persona
 * Representa un contacto de la agenda.
 */
public class Persona {

    private String nombre;
    private String direccion;
    private String telefono;

    // Constructor
    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}