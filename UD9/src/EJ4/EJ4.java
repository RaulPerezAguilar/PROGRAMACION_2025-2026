package EJ4;

import java.io.IOException;

public class EJ4 {

	public static void main(String args[]) {

		// Se crea un array de 5 bytes.
		// Cada posición almacenará un carácter introducido por teclado.
		byte b[] = new byte[5];

		try {

			// Lee hasta 5 bytes desde la entrada estándar (teclado)
			// y los guarda dentro del array 'b'.
			// Ejemplo: si escribimos "Hola!"
			// cada letra ocupará una posición del array.
			System.in.read(b);

		} catch (IOException ioe) {

			// Captura posibles errores de entrada/salida.
			System.out.println(ioe);
		}

		// Convierte el array de bytes en un objeto String.
		String s = new String(b);

		// Muestra por pantalla el contenido leído.
		System.out.println(s);
	}
}