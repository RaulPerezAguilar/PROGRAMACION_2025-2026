package EJ2;

import java.time.LocalDate;

public class TestEventoMusical {

    public static void main(String[] args) {

        // Creamos el evento musical
        EventoMusical evento = new EventoMusical(
                1L,
                "Summer Music Festival",
                LocalDate.of(2026, 8, 20),
                250000.75,
                GeneroMusical.ROCK
        );

        // Creamos artistas
        Artista artista1 = new Artista("The Fire Band", "España");
        Artista artista2 = new Artista("DJ Nova", "Francia");

        // Añadimos artistas al evento
        evento.agregarArtista(artista1);
        evento.agregarArtista(artista2);

        // Mostramos la información
        System.out.println(evento);
    }
}