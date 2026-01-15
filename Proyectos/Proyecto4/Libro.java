/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AntonioRecio.PescadoFresco.Proyecto4;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Libro {
    // Definicion de atributos
    String isbn;
    String titulo;
    String autor;
    int anioPublicacion;
    EstadoPrestamo estado;
    // Inicializamos los atributos con el constructor
    public Libro(String isbn,String titulo,String autor,int anioPublicacion,EstadoPrestamo estado) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
    this.estado = estado;
    }
    // Mostrar la informacion del Libro
    void mostrarInformacion() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Estado: " + estado);
    }
    // Mirar si el libro es antiguo o no
    boolean esAntiguo() {
        return (2026 - anioPublicacion) > 20;
    }
    // Cambia el estado del libro
    void cambiarEstado(EstadoPrestamo nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
