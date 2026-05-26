package EJ3;

/**
 * Clase sencilla que representa un artista.
 *
 * Aunque es una clase independiente,
 * NO será una entidad persistente en la BD.
 */
public class Artista {

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