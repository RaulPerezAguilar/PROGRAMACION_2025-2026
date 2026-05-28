package EJ4;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * Clase sencilla que representa un artista.
 */

@Embeddable
public class Artista implements Serializable {

    // Nombre artístico
    private String nombreArtistico;

    // País del artista
    private String paisOrigen;

    /**
     * Constructor vacío.
     */
    public Artista() {
    }

    /**
     * Constructor completo.
     */
    public Artista(String nombreArtistico, String paisOrigen) {
        this.nombreArtistico = nombreArtistico;
        this.paisOrigen = paisOrigen;
    }

    // =========================
    // GETTERS Y SETTERS
    // =========================

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * Método toString().
     */
    @Override
    public String toString() {
        return nombreArtistico + " (" + paisOrigen + ")";
    }
}