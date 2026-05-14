package EJ13;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EJ13 {
    public static void main(String[] args) {

        // Crear objeto Persona
        Persona persona = new Persona("Paco Johns");

        // Serializar objeto y guardarlo en un fichero
        try {
            FileOutputStream fichero = new FileOutputStream("persona.dat");
            ObjectOutputStream salida = new ObjectOutputStream(fichero);

            salida.writeObject(persona);

            salida.close();
            fichero.close();

            System.out.println("Objeto serializado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al serializar el objeto.");
        }
    }
}