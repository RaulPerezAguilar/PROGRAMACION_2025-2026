package EJ6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ControlAduanas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> paises = new HashSet<>();

        System.out.println("Introduce 5 países:");

        for (int i = 0; i < 5; i++) {
            System.out.print("País: ");
            String pais = sc.nextLine();

            if (!paises.add(pais)) {
                System.out.println("¡Ese ya pasó por la frontera!");
            }
        }

        System.out.println("Número de países únicos: " + paises.size());
    }
}