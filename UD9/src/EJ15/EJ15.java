package EJ15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * EJERCICIO 15
 *
 * PASOS:
 * 1. Creamos una lista de personas.
 * 2. Generamos manualmente un archivo XML.
 * 3. Guardamos los datos dentro del XML.
 * 4. El archivo podrá compartirse con otros compañeros.
 */

public class EJ15 {

    public static void main(String[] args) {

        // Lista de contactos
        ArrayList<Persona> contactos = new ArrayList<>();

        // Añadimos personas
        contactos.add(new Persona("Juan", "Calle Sol 12", "600111222"));
        contactos.add(new Persona("Ana", "Avenida Luna 8", "611222333"));
        contactos.add(new Persona("Carlos", "Plaza Mayor 4", "622333444"));

        // Nombre del archivo XML
        String archivo = "contactos.xml";

        try {

            // Writer para escribir texto en el archivo
            FileWriter writer = new FileWriter(archivo);

            /*
             * ESTRUCTURA XML
             * Creamos las etiquetas principales.
             */

            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<contactos>\n");

            // Recorremos la lista
            for (Persona p : contactos) {

                writer.write("   <persona>\n");

                writer.write("      <nombre>"
                        + p.getNombre()
                        + "</nombre>\n");

                writer.write("      <direccion>"
                        + p.getDireccion()
                        + "</direccion>\n");

                writer.write("      <telefono>"
                        + p.getTelefono()
                        + "</telefono>\n");

                writer.write("   </persona>\n");
            }

            // Cerramos etiqueta principal
            writer.write("</contactos>");

            // Cerramos flujo
            writer.close();

            System.out.println("Archivo XML creado correctamente.");

        } catch (IOException e) {

            System.out.println("Error al escribir el XML.");
            e.printStackTrace();
        }
    }
}