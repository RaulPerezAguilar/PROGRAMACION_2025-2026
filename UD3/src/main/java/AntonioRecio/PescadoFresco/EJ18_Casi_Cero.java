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
public class EJ18_Casi_Cero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero casi-cero: ");
        float n1 = sc.nextFloat();
        if (n1 < 1 && n1 > -1 && n1 != 0 ) {
        System.out.print("Es casi cero");
    } else {
        System.out.print("No es casi cero");
        }
        // TODO code application logic here
    }
    
}
