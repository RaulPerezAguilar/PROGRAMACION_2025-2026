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
public class EJ28_Calcular_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De que numero quieres el factorial: ");
        int n = sc.nextInt();
        int multi = 1;
        for (int i = n;i <= 0; i--) {
            multi = i * multi;
            System.out.print(multi);
        }
        // TODO code application logic here
    }
    
}
