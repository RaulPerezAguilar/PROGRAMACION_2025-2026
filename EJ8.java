package Pruebas;
/*
 * STRINGREADER
 * ----------------------------
 * Paquete:
 * java.io
 *
 * Jerarquía:
 * Object -> Reader -> StringReader
 *
 * StringReader sirve para leer un texto
 * carácter por carácter desde un String.
 */

import java.io.StringReader;

public class EJ8 {

    public static void main(String[] args) throws Exception {

        // Creamos el StringReader con el texto "HOLA"
        StringReader sr = new StringReader("HOLA");

        // read() lee una letra
        // Se convierte a char para mostrarla correctamente
        System.out.println((char) sr.read()); // H

        /*
         * mark()
         * ----------------
         * Guarda la posición actual.
         * En este momento estamos justo antes de la O.
         */
        sr.mark(10);

        // Lee la siguiente letra
        System.out.println((char) sr.read()); // O

        /*
         * reset()
         * ----------------
         * Vuelve a la posición guardada con mark().
         * Por eso volveremos antes de la O.
         */
        sr.reset();

        // Se vuelve a leer la O otra vez
        System.out.println((char) sr.read()); // O
    }
}