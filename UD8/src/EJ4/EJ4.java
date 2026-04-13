package EJ4;

import java.util.ArrayList;

/**
 * Procesador de calificaciones usando clases envoltorio
 */
public class EJ4 {

    public static void main(String[] args) {

        // Array de entrada (Strings)
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // Conversión (Parsing)
        ArrayList<Double> notas = convertirNotas(notasEntrada);

        // Mostrar notas convertidas
        System.out.println("Notas convertidas: " + notas);

        // Cálculo de la media (Unboxing automático)
        double media = calcularMedia(notas);
        System.out.println("Nota media: " + media);

        // Filtrado de aprobados
        ArrayList<Double> aprobados = filtrarAprobados(notas);
        System.out.println("Notas aprobadas: " + aprobados);
    }

    // Convierte un array de String a ArrayList<Double>
    public static ArrayList<Double> convertirNotas(String[] entrada) {
        ArrayList<Double> notas = new ArrayList<>();
        for (String nota : entrada) {
            // Parsing usando clase envoltorio
            notas.add(Double.valueOf(nota));
        }
        return notas;
    }

    // Calcula la media de una lista de notas
    public static double calcularMedia(ArrayList<Double> notas) {
        double suma = 0.0;
        for (Double nota : notas) {
            // Unboxing automático
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
