package EJ2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase POJO que representa un evento musical.
 *
 * Esta clase cumple las características necesarias
 * para poder persistirse en una Base de Datos:
 *
 * - Tiene constructor vacío.
 * - Los atributos son privados.
 * - Tiene getters y setters públicos.
 * - Implementa Serializable.
 * - Tiene un identificador (id).
 */
public class EventoMusical implements java.io.Serializable {

    // Identificador único del evento
    // Normalmente en BD sería la clave primaria
    private Long id;

    // Nombre del evento
    private String nombre;

    // Fecha del evento
    private LocalDate fecha;

    // Cantidad recaudada
    private Double recaudacion;

    // Género musical del evento
    // Usamos un enum porque solo puede haber
    // un conjunto limitado de géneros
    private GeneroMusical genero;

    // Lista de artistas confirmados
    // Aunque Artista es una clase,
    // NO será una entidad persistente independiente
    private List<Artista> artistasConfirmados;

    /**
     * Constructor vacío obligatorio en muchos frameworks
     * de persistencia como Hibernate o JPA.
     */
    public EventoMusical() {

        // Inicializamos la lista vacía para evitar errores NullPointerException
        artistasConfirmados = new ArrayList<>();
    }

    /**
     * Constructor completo.
     */
    public EventoMusical(Long id, String nombre, LocalDate fecha,
                         Double recaudacion, GeneroMusical genero) {

        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;

        // Inicializamos la lista
        artistasConfirmados = new ArrayList<>();
    }

    // =========================
    // GETTERS Y SETTERS
    // =========================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    /**
     * Método para añadir un artista a la lista.
     */
    public void agregarArtista(Artista artista) {
        artistasConfirmados.add(artista);
    }

    /**
     * Método toString().
     * Permite mostrar toda la información del objeto.
     */
    @Override
    public String toString() {
        return "EventoMusical{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                ", genero=" + genero +
                ", artistasConfirmados=" + artistasConfirmados +
                '}';
    }
}