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
public class EJ15_Redondeo_Proximo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Introduce el numero que quieras redondear (Con decimales a poder ser): ");
        float n1 = sc.nextFloat();
        int n2 = Math.round(n1);
        System.out.print("El numero " + n1 + " redondeado es: " + n2);
    }
    
}
