package EJ4;

/**
 * Clase auxiliar con métodos para procesar calificaciones.
 */
import java.util.ArrayList;

public class EJ4 {

    // Convierte un array de String a ArrayList<Double>
    public static ArrayList<Double> convertirNotas(String[] entrada) {
        ArrayList<Double> notas = new ArrayList<>();
        for (String nota : entrada) {
            notas.add(Double.parseDouble(nota));
        }
        return notas;
    }

    // Calcula la media de una lista de notas
    public static double calcularMedia(ArrayList<Double> notas) {
        double suma = 0.0;
        for (Double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    // Filtra las notas aprobadas (>= 5.0)
    public static ArrayList<Double> filtrarAprobados(ArrayList<Double> notas) {
        ArrayList<Double> aprobados = new ArrayList<>();
        for (Double nota : notas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }
        return aprobados;
    }
}