package EJ4;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EJ4.EventoMusical;
import EJ4.GeneroMusical;

public class Prueba {

    public static void main(String[] args) {

        // Crear nueva BD eventos.odb
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("objectdb:db/eventos.odb");

        EntityManager em = emf.createEntityManager();

        // INICIAR TRANSACCIÓN
        em.getTransaction().begin();

        // =========================
        // PRIMER EVENTO
        // =========================

        EventoMusical evento1 = new EventoMusical(
                "Summer Fest",
                LocalDate.of(2026, 7, 10),
                50000.0,
                GeneroMusical.REGGAETON
        );

        Artista badBunny = new Artista(
                "Bad Bunny",
                "Puerto Rico"
        );

        evento1.agregarArtista(badBunny);

        // =========================
        // SEGUNDO EVENTO
        // =========================

        EventoMusical evento2 = new EventoMusical(
                "Rock Night",
                LocalDate.of(2026, 9, 20),
                72000.0,
                GeneroMusical.ROCK
        );

        Artista arcangel = new Artista(
                "Arcangel",
                "Puerto Rico"
        );

        evento2.agregarArtista(arcangel);

        // =========================
        // GUARDAR EN LA BD
        // =========================

        em.persist(evento1);
        em.persist(evento2);

        // CONFIRMAR TRANSACCIÓN
        em.getTransaction().commit();

        // CERRAR
        em.close();
        emf.close();
    }
}