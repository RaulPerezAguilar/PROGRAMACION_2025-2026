package EJ6;

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
            // 1. CAMBIAR PRIMER EVENTO POR ID
            // =========================================

            em.getTransaction().begin();

            EventoMusical eventoModificar =
                    em.find(EventoMusical.class, evento1.getId());

            eventoModificar.setNombre(
                    eventoModificar.getNombre().toUpperCase()
            );

            em.getTransaction().commit();

            System.out.println("EVENTO 1 MODIFICADO POR ID:");
            System.out.println(eventoModificar);

            // =========================================
            // 2. JPQL - QUERY ESTÁTICA
            // =========================================

            em.getTransaction().begin();

            TypedQuery<EventoMusical> consultaEstatica =
                    em.createQuery(
                            "SELECT e FROM EventoMusical e WHERE e.nombre = 'Rock Night'",
                            EventoMusical.class
                    );

            EventoMusical resultado1 =
                    consultaEstatica.getSingleResult();

            resultado1.setNombre(
                    resultado1.getNombre().toUpperCase()
            );

            em.getTransaction().commit();

            System.out.println("\nJPQL ESTÁTICA:");
            System.out.println(resultado1);

            // =========================================
            // 3. JPQL - QUERY DINÁMICA
            // =========================================

            em.getTransaction().begin();

            String nombreEvento = "ROCK NIGHT";

            TypedQuery<EventoMusical> consultaDinamica =
                    em.createQuery(
                            "SELECT e FROM EventoMusical e WHERE e.nombre = :nombre",
                            EventoMusical.class
                    );

            consultaDinamica.setParameter("nombre", nombreEvento);

            EventoMusical resultado2 =
                    consultaDinamica.getSingleResult();

            resultado2.setNombre(
                    resultado2.getNombre().toUpperCase()
            );

            em.getTransaction().commit();

            System.out.println("\nJPQL DINÁMICA:");
            System.out.println(resultado2);

        } finally {

            // CERRAR RECURSOS
            em.close();
            emf.close();
        }
    }
}