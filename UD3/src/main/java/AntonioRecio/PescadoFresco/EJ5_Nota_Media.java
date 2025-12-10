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
public class EJ5_Nota_Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime la primera nota: ");
            int nota1 = sc.nextInt();
            System.out.print("Dime la segunda nota: ");
            int nota2 = sc.nextInt();
            double nota_final = (nota1 + nota2) /2F;
            System.out.print("La nota media es:" + nota_final );
        // TODO code application logic here
    }
    
}
