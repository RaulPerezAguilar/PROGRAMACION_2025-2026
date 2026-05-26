package EJ1;

// Importamos LocalDate para trabajar con fechas de forma moderna y segura
import java.time.LocalDate;

/**
 * Clase POJO (Plain Old Java Object) que representa un evento musical.
 * Un POJO es una clase sencilla que solo contiene atributos, constructores,
 * getters/setters y métodos básicos.
 */
public class EventoMusical {

    // Nombre del evento musical
    private String nombre;

    // Fecha del evento
    // Usamos LocalDate porque es el tipo más adecuado para guardar fechas
    // sin hora (día, mes y año)
    private LocalDate fecha;

    // Dinero recaudado en el evento
    // Usamos Double porque permite almacenar números decimales
    private Double recaudacion;

    /**
     * Constructor de la clase.
     * Sirve para crear objetos EventoMusical inicializando sus atributos.
     *
     * @param nombre Nombre del evento
     * @param fecha Fecha del evento
     * @param recaudacion Cantidad recaudada
     */
    public EventoMusical(String nombre, LocalDate fecha, Double recaudacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    // =========================
    // GETTERS Y SETTERS
    // =========================

    // Devuelve el nombre del evento
    public String getNombre() {
        return nombre;
    }

    // Modifica el nombre del evento
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve la fecha del evento
    public LocalDate getFecha() {
        return fecha;
    }

    // Modifica la fecha del evento
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Devuelve la recaudación
    public Double getRecaudacion() {
        return recaudacion;
    }

    // Modifica la recaudación
    public void setRecaudacion(Double recaudacion) {
        this.recaudacion = recaudacion;
    }

    /**
     * Método toString().
     * Sirve para mostrar la información del objeto de forma legible.
     */
    @Override
    public String toString() {
        return "EventoMusical{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                '}';
    }
}