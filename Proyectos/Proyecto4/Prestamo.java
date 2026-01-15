package AntonioRecio.PescadoFresco.Proyecto4;

public class Prestamo {
    // Definimos los atributos
    Libro libro;
    Usuario usuario;
    int diasPrestamo;
    // Inicializamos los atributos con un contructor
    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;

        // Cambiar automáticamente el estado del libro a PRESTADO
        libro.cambiarEstado(EstadoPrestamo.PRESTADO);
    }
        // Imprimir los detalles del libro
    void mostrarDetalle() {
        System.out.println("Libro: " + libro.titulo);
        System.out.println("Usuario: " + usuario.nombre);
        System.out.println("Días de préstamo: " + diasPrestamo);
        System.out.println("Estado del libro: " + libro.estado);
    }
        // Marcar libro con retraso
    void marcarRetraso() {
        System.out.println("El préstamo está en retraso.");
    }
}
