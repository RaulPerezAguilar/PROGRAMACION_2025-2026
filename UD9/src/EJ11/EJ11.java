package EJ11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class EJ11 {

    public static void main(String[] args) {

        // Objeto para trabajar con el archivo
        File archivo = new File("record.txt");

        // Scanner para leer lo que escribe el usuario
        Scanner sc = new Scanner(System.in);

        try {

            // Si el archivo no existe, se crea
            if (!archivo.exists()) {

                archivo.createNewFile();

                // Escribimos el contenido inicial
                RandomAccessFile raf = new RandomAccessFile(archivo, "rw");
                raf.writeBytes("Nivel:001");
                raf.close();

                System.out.println("Archivo creado con Nivel:001");
            }

            // Preguntar al usuario qué nivel quiere poner
            System.out.print("Introduce el nuevo nivel: ");
            int nivel = sc.nextInt();

            // Convertir el número a formato de 3 cifras
            // Ejemplo: 5 -> 005
            String nivelTexto = String.format("%03d", nivel);

            // Abrir el archivo en modo lectura y escritura
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");

            // Saltar directamente después de "Nivel:"
            // N=0 i=1 v=2 e=3 l=4 :=5
            // El número empieza en la posición 6
            raf.seek(6);

            // Sobrescribir solo el número
            raf.writeBytes(nivelTexto);

            // Volver al inicio para leer el resultado
            raf.seek(0);

            // Leer toda la línea
            String contenido = raf.readLine();

            System.out.println("Contenido actualizado: " + contenido);

            // Cerrar archivo
            raf.close();

        } catch (IOException e) {

            System.out.println("Error al trabajar con el archivo.");
            e.printStackTrace();

        }

        // Cerrar scanner
        sc.close();
    }
}