package EJ7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class EventoMusical implements java.io.Serializable {

    private static Long contadorIds = 10L;

    @Id
    private Long id;

    @Transient
    private int control;

    private String nombre;
    private LocalDate fecha;
    private Double recaudacion;

    @Enumerated(EnumType.STRING)
    private GeneroMusical genero;

    @ElementCollection
    private List<Artista> artistasConfirmados;

    public EventoMusical() {
        this.id = contadorIds;
        contadorIds += 10;
        artistasConfirmados = new ArrayList<>();
    }

    public EventoMusical(String nombre,
                         LocalDate fecha,
                         Double recaudacion,
                         GeneroMusical genero) {

        this.id = contadorIds;
        contadorIds += 10;

        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;

        artistasConfirmados = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
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

    public void agregarArtista(Artista artista) {
        artistasConfirmados.add(artista);
    }

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