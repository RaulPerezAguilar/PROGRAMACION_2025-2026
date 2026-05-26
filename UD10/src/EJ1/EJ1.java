package EJ1;

// Importamos LocalDate para crear fechas
import java.time.LocalDate;

public class EJ1 {

    public static void main(String[] args) {

        // Creamos un objeto EventoMusical
        EventoMusical evento = new EventoMusical(
                "Festival Rock 2026",      // Nombre del evento
                LocalDate.of(2026, 7, 15), // Fecha: 15 de julio de 2026
                125000.50                  // Recaudación
        );

        // Mostramos los datos del evento por consola
        System.out.println(evento);

        // También podemos acceder a cada atributo usando getters
        System.out.println("Nombre: " + evento.getNombre());
        System.out.println("Fecha: " + evento.getFecha());
        System.out.println("Recaudación: " + evento.getRecaudacion() + " €");
    }
}