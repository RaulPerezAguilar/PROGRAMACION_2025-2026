/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco.Proyecto4;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creamos varios libros
        Libro Mauricio = new Libro("ABC123","Mauricio","Mariano",1920,EstadoPrestamo.PRESTADO);
        Libro Colmenero = new Libro("123ABC","Colmenero","Chicoque",1980,EstadoPrestamo.DISPONIBLE);
        Libro Pastores = new Libro("CBA321","Las aventuras de Enrique el pastor de juventud y tiempo libre","Antonio Recio Matamoros Hidalgo Asociados",1865,EstadoPrestamo.RETRASADO); 
        
        // Creamos los usuarios
        Usuario Fran = new Usuario();
        Fran.dni = "2F";
        Fran.nombre = "Francisco de la cuesta alta";
        Fran.edad = 75;
        Usuario mauricio = new Usuario();
        mauricio.dni = "2M";
        mauricio.nombre = "Mauricio de la bajada baja";
        mauricio.edad = 80;
        Usuario Vicente = new Usuario();
        Vicente.dni = "2V";
        Vicente.nombre = "Vicente de la recta media";
        Vicente.edad = 75;
        // Añadimos Prestamos
        Prestamo Prestamo1 = new Prestamo(Mauricio, Fran);
        Prestamo Prestamo12 = new Prestamo(Mauricio, mauricio);
        Prestamo Prestamo123 = new Prestamo(Mauricio, Vicente);
        // Mostramos Informacion antes y despues de modificacion
        System.out.println(Mauricio.estado);
        Mauricio.estado = EstadoPrestamo.DISPONIBLE;
        System.out.println(Mauricio.estado);
    }
    
}
