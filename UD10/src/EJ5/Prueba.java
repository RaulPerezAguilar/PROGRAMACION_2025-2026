package EJ5;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Prueba {

    public static void main(String[] args) {

        // Crear nueva BD eventos.odb
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("objectdb:db/eventos.odb");

        EntityManager em = emf.createEntityManager();

        try {

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

            // =========================================
            // 1. IMPRIMIR PRIMER EVENTO POR ID
            // =========================================

            Long idEvento1 = evento1.getId();

            EventoMusical eventoBuscado =
                    em.find(EventoMusical.class, idEvento1);

            System.out.println("EVENTO POR ID:");
            System.out.println(eventoBuscado);

            // =========================================
            // 2. JPQL - QUERY ESTÁTICA
            // =========================================

            TypedQuery<EventoMusical> consultaEstatica =
                    em.createQuery(
                            "SELECT e FROM EventoMusical e WHERE e.nombre = 'Rock Night'",
                            EventoMusical.class
                    );

            EventoMusical resultado1 =
                    consultaEstatica.getSingleResult();

            System.out.println("\nJPQL ESTÁTICA:");
            System.out.println(resultado1);

            // =========================================
            // 3. JPQL - QUERY DINÁMICA
            // =========================================

            String nombreEvento = "Rock Night";

            TypedQuery<EventoMusical> consultaDinamica =
                    em.createQuery(
                            "SELECT e FROM EventoMusical e WHERE e.nombre = :nombre",
                            EventoMusical.class
                    );

            consultaDinamica.setParameter("nombre", nombreEvento);

            EventoMusical resultado2 =
                    consultaDinamica.getSingleResult();

            System.out.println("\nJPQL DINÁMICA:");
            System.out.println(resultado2);

        } finally {

            // CERRAR RECURSOS
            em.close();
            emf.close();
        }
    }
}