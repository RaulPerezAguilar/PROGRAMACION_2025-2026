package EJ14;

import java.io.*;
import java.util.ArrayList;

/*
 * EJERCICIO 14
 *
 * PASOS:
 * 1. Creamos una lista de objetos Item.
 * 2. Guardamos la lista en un archivo binario usando ObjectOutputStream.
 * 3. Leemos el archivo usando ObjectInputStream.
 * 4. Calculamos el valor total de todos los items.
 */

public class EJ14 {

    public static void main(String[] args) {

        // Nombre del archivo binario
        String archivo = "mochila.bin";

        // Lista donde guardaremos los items
        ArrayList<Item> mochila = new ArrayList<>();

        // Añadimos 5 objetos Item
        mochila.add(new Item("Espada", 4.5, 150));
        mochila.add(new Item("Escudo", 6.0, 120));
        mochila.add(new Item("Poción", 0.5, 50));
        mochila.add(new Item("Armadura", 10.0, 300));
        mochila.add(new Item("Mapa", 0.2, 20));

        /*
         * PARTE 1: GUARDAR OBJETOS EN ARCHIVO
         */
        try {

            // Flujo para escribir objetos en un archivo binario
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(archivo));

            // Guardamos la lista completa
            oos.writeObject(mochila);

            // Cerramos el flujo
            oos.close();

            System.out.println("Lista guardada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
            e.printStackTrace();
        }

        /*
         * PARTE 2: LEER OBJETOS DEL ARCHIVO
         */
        try {

            // Flujo para leer objetos desde archivo
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(archivo));

            // Recuperamos la lista
            ArrayList<Item> mochilaLeida =
                    (ArrayList<Item>) ois.readObject();

            // Cerramos el flujo
            ois.close();

            // Variable para sumar el valor total
            double valorTotal = 0;

            // Recorremos la lista
            for (Item item : mochilaLeida) {

                // Mostramos cada objeto
                System.out.println(item);

                // Sumamos el valor
                valorTotal += item.getValor();
            }

            // Mostramos resultado final
            System.out.println("Valor total de la mochila: " + valorTotal);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada.");
            e.printStackTrace();
        }
    }
}