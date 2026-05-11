package EJ9;
import java.io.File;
import java.io.IOException;

public class EJ9 {
    public static void main(String[] args) {

        // Crear objeto File
        File archivo = new File("notas.txt");

        try {

            // Verificar si el archivo existe
            if (archivo.exists()) {

                System.out.println("El archivo existe.");
                System.out.println("Nombre: " + archivo.getName());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

            } else {

                // Crear el archivo si no existe
                if (archivo.createNewFile()) {

                    System.out.println("El archivo no existía y ha sido creado.");
                    System.out.println("Nombre: " + archivo.getName());
                    System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

                } else {

                    System.out.println("No se pudo crear el archivo.");

                }
            }

        } catch (IOException e) {

            System.out.println("Se produjo un error al trabajar con el archivo.");
            e.printStackTrace();

        }
    }
}