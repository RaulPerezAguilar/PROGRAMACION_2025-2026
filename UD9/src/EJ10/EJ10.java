package EJ10;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EJ10 {

    public static void main(String[] args) {

        File miFichero = new File("C:\\Users\\01_1DAW_Alum\\eclipse-workspace\\UD9\\src\\EJ10\\LENTEJAS.txt");

        try {
            // 1. Añadir contenido al final del fichero
            FileWriter fw = new FileWriter(miFichero, true); // true = append
            fw.write("\nLENTEJAS CON MAYONESA");
            fw.close();

            // 2. Leer y mostrar contenido
            FileReader fr = new FileReader(miFichero);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}