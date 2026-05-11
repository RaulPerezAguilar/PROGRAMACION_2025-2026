package EJ2;
import java.io.FileWriter;

public class EJ2 {
    public static void main(String[] args) throws Exception {

        // Creamos un FileWriter para escribir en el archivo prueba.txt
        FileWriter escritor = new FileWriter("prueba.txt");

        // Escribimos un texto en memoria (buffer)
        // Todavía puede que NO esté guardado realmente en el archivo
        escritor.write("¿Dónde está mi texto?");

        // flush() fuerza a que el contenido del buffer
        // se escriba inmediatamente en el archivo
        escritor.flush();

        System.out.println("El texto ya se ha guardado en prueba.txt");

        // Espera 10 segundos
        Thread.sleep(5000);

        // close() cierra el archivo correctamente
        // Además, también guarda lo que quede pendiente
        escritor.close();
    }
}