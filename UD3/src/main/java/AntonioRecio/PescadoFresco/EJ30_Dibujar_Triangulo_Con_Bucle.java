/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;
import java.util.Scanner;
/**
 *
 * @author 01_1DAW_Alum
 */
public class EJ30_Dibujar_Triangulo_Con_Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println();
            for (int j = n; 0 <= j; j--){
                System.out.print("*");
            }
        }
        // TODO code application logic here
    }
    
}
