package EJ1;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce 4 caracteres: ");
        String texto = teclado.nextLine();

        // 1. write
        System.out.write(texto.charAt(0));
        System.out.println();

        // 2. print
        System.out.print(texto.charAt(1));
        System.out.println();

        // 3. println
        System.out.println(texto.charAt(2));

        // 4. printf
        System.out.printf("%c", texto.charAt(3));
	}

}
