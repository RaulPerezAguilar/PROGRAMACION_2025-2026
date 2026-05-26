package EJ3;

import java.time.LocalDate;

public class TestEventoMusical {

    public static void main(String[] args) {

        // Primer evento
        EventoMusical evento1 = new EventoMusical(
                "Summer Music Festival",
                LocalDate.of(2026, 8, 20),
                250000.75,
                GeneroMusical.ROCK
        );

        // Segundo evento
        EventoMusical evento2 = new EventoMusical(
                "Electro Night",
                LocalDate.of(2026, 9, 10),
                180000.50,
                GeneroMusical.ELECTRONICA
        );

        // Modificamos variable de control
        evento1.setControl(5);

        // Creamos artistas
        Artista artista1 = new Artista("The Fire Band", "España");
        Artista artista2 = new Artista("DJ Nova", "Francia");

        // Añadimos artistas
        evento1.agregarArtista(artista1);
        evento1.agregarArtista(artista2);

        // Mostramos resultados
        System.out.println(evento1);
        System.out.println(evento2);
    }
}