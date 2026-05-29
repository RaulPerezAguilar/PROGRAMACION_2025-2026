package EJ5;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * Clase embebida que representa un artista.
 */

@Embeddable
public class Artista implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String pais;

    /**
     * Constructor vacío obligatorio para JPA.
     */
    public Artista() {
    }

    /**
     * Constructor completo.
     */
    public Artista(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    // =========================
    // GETTERS Y SETTERS
    // =========================

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}