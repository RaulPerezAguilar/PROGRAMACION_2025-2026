package EJ7;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Prueba {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("objectdb:db/eventos.odb");

        EntityManager em = emf.createEntityManager();

        try {

            // =========================
            // CREAR EVENTOS
            // =========================

            em.getTransaction().begin();

            EventoMusical evento1 = new EventoMusical(
                    "Summer Fest",
                    LocalDate.of(2026, 7, 10),
                    50000.0,
                    GeneroMusical.REGGAETON
            );

            evento1.agregarArtista(
                    new Artista("Bad Bunny", "Puerto Rico")
            );

            EventoMusical evento2 = new EventoMusical(
                    "Rock Night",
                    LocalDate.of(2026, 9, 20),
                    72000.0,
                    GeneroMusical.ROCK
            );

            evento2.agregarArtista(
                    new Artista("Arcangel", "Puerto Rico")
            );

            em.persist(evento1);
            em.persist(evento2);

            em.getTransaction().commit();

            // =========================================
            // 1. COPIAR EL PRIMER EVENTO Y BORRARLO POR ID
            // =========================================

            em.getTransaction().begin();

            EventoMusical original =
                    em.find(EventoMusical.class, evento1.getId());

            EventoMusical copia = new EventoMusical(
                    original.getNombre(),
                    original.getFecha(),
                    original.getRecaudacion(),
                    original.getGenero()
            );

            copia.setArtistasConfirmados(
                    original.getArtistasConfirmados()
            );

            em.persist(copia);

            em.remove(original);

            em.getTransaction().commit();

            System.out.println("Primer evento copiado y eliminado por ID.");

            // =========================================
            // 2. ELIMINAR SEGUNDO EVENTO CON JPQL ESTÁTICA
            // =========================================

            em.getTransaction().begin();

            Query borradoEstatico =
                    em.createQuery(
                            "DELETE FROM EventoMusical e " +
                            "WHERE e.nombre = 'Rock Night'"
                    );

            int filas1 = borradoEstatico.executeUpdate();

            em.getTransaction().commit();

            System.out.println(
                    "Eventos eliminados con JPQL estática: "
                            + filas1
            );

            // =========================================
            // VOLVER A INSERTAR EVENTO 2
            // PARA PROBAR LA JPQL DINÁMICA
            // =========================================

            em.getTransaction().begin();

            EventoMusical evento3 = new EventoMusical(
                    "Rock Night",
                    LocalDate.of(2026, 9, 20),
                    72000.0,
                    GeneroMusical.ROCK
            );

            evento3.agregarArtista(
                    new Artista("Arcangel", "Puerto Rico")
            );

            em.persist(evento3);

            em.getTransaction().commit();

            // =========================================
            // 3. ELIMINAR CON JPQL DINÁMICA
            // =========================================

            em.getTransaction().begin();

            String nombreEvento = "Rock Night";

            Query borradoDinamico =
                    em.createQuery(
                            "DELETE FROM EventoMusical e " +
                            "WHERE e.nombre = :nombre"
                    );

            borradoDinamico.setParameter(
                    "nombre",
                    nombreEvento
            );

            int filas2 = borradoDinamico.executeUpdate();

            em.getTransaction().commit();

            System.out.println(
                    "Eventos eliminados con JPQL dinámica: "
                            + filas2
            );

        } finally {

            em.close();
            emf.close();
        }
    }
}