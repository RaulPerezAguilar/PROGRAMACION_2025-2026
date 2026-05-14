package EJ12;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EJ12 {

    public static void main(String[] args) {

        // Crear objeto File
        File archivo = new File("abecedario.txt");

        try {

            // Si el archivo existe, eliminarlo
            if (archivo.exists()) {

                if (archivo.delete()) {
                    System.out.println("El archivo existente ha sido eliminado.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                    return;
                }
            }

            // Crear nuevo archivo
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado correctamente.");
            }

            // Abrir flujo de acceso aleatorio
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");

            // Introducir la cadena "defg"
            raf.writeBytes("defg");

            // Volver al inicio para leer el contenido
            raf.seek(0);

            // Leer contenido del fichero
            byte[] contenido = new byte[(int) raf.length()];
            raf.read(contenido);

            System.out.println("Contenido inicial del fichero:");
            System.out.println(new String(contenido));

            // Obtener contenido actual
            String texto = new String(contenido);

            // Añadir "abc" al principio y "hij" al final
            texto = "abc" + texto + "hij";

            // Sustituir vocales por "*"
            texto = texto.replaceAll("[aeiouAEIOU]", "*");

            // Borrar contenido anterior
            raf.setLength(0);

            // Escribir nuevo contenido
            raf.writeBytes(texto);

            // Mostrar contenido final
            raf.seek(0);

            byte[] contenidoFinal = new byte[(int) raf.length()];
            raf.read(contenidoFinal);

            System.out.println("Contenido final del fichero:");
            System.out.println(new String(contenidoFinal));

            // Cerrar fichero
            raf.close();

        } catch (IOException e) {

            System.out.println("Se produjo un error al trabajar con el archivo.");
            e.printStackTrace();

        }
    }
}