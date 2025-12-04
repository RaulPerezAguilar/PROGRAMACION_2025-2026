/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 01_1DAW_Alum
 */
public class EJ16_Acertar_Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num = random.nextInt(5);
        System.out.print("Intoduce un numero hasta hacertar el aleatorio: ");
        int n = sc.nextInt();
        while (n != num) {
            System.out.println("Numero incorrecto");
            System.out.print("Introduce otro numero: ");
                    n = sc.nextInt();
                   
        }
        System.out.println("Acertaste el numero");
        
    }
    
}
