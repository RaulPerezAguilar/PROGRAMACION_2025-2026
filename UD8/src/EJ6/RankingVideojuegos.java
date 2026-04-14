package EJ6;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RankingVideojuegos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> juegos = new TreeSet<>();

        System.out.println("Introduce 5 nombres de videojuegos:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Juego: ");
            String juego = sc.nextLine();
            juegos.add(juego);
        }

        System.out.println("Juegos ordenados automáticamente:");
        System.out.println(juegos);
    }
}