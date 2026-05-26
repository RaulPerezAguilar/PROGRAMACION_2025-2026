package EJ3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase POJO que representa un evento musical.
 */
public class EventoMusical implements java.io.Serializable {

    // =========================================
    // ATRIBUTO ESTÁTICO PARA GENERAR IDS
    // =========================================

    // Variable compartida por todos los objetos
    // Se incrementará de 10 en 10
    private static Long contadorIds = 10L;

    // =========================================
    // CLAVE PRIMARIA
    // =========================================

    // Identificador único del evento
    private Long id;

    // =========================================
    // ATRIBUTO NO PERSISTENTE
    // =========================================

    // Variable usada solo para lógica interna
    // NO deberá almacenarse en la BD
    transient int control;

    // =========================================
    // RESTO DE ATRIBUTOS
    // =========================================

    private String nombre;

    private LocalDate fecha;

    private Double recaudacion;

    private GeneroMusical genero;

    private List<Artista> artistasConfirmados;

    /**
     * Constructor vacío.
     */
    public EventoMusical() {

        // Generamos automáticamente el ID
        this.id = contadorIds;

        // Aumentamos de 10 en 10
        contadorIds += 10;

        artistasConfirmados = new ArrayList<>();
    }

    /**
     * Constructor completo.
     */
    public EventoMusical(String nombre,
                         LocalDate fecha,
                         Double recaudacion,
                         GeneroMusical genero) {

        // Generación automática del ID
        this.id = contadorIds;

        // Incremento de 10 en 10
        contadorIds += 10;

        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;

        artistasConfirmados = new ArrayList<>();
    }

    // =========================
    // GETTERS Y SETTERS
    // =========================

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(Double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public List<Artista> getArtistasConfirmados() {
        return artistasConfirmados;
    }

    public void setArtistasConfirmados(List<Artista> artistasConfirmados) {
        this.artistasConfirmados = artistasConfirmados;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    /**
     * Método para añadir artistas.
     */
    public void agregarArtista(Artista artista) {
        artistasConfirmados.add(artista);
    }

    /**
     * Método toString().
     */
    @Override
    public String toString() {
        return "EventoMusical{" +
                "id=" + id +
                ", control=" + control +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                ", genero=" + genero +
                ", artistasConfirmados=" + artistasConfirmados +
                '}';
    }
}