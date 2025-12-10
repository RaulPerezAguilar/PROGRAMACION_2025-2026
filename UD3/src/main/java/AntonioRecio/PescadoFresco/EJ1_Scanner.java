package AntonioRecio.PescadoFresco;

import java.util.Scanner;

public class EJ1_Scanner {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        System.out.println("Número: " + numero);
    }
    
}