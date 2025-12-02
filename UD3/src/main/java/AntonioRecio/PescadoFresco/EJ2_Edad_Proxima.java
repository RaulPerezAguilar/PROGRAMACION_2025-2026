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
public class EJ2_Edad_Proxima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        int nueva_edad = ++edad;
        System.out.print("El año que viene tendras: " + nueva_edad + " Años");
        // TODO code application logic here
    }
    
}
