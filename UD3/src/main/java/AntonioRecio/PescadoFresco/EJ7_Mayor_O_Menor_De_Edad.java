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
public class EJ7_Mayor_O_Menor_De_Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que edad tienes: ");
        int edad = sc.nextInt();
        boolean esmayor = edad >= 18;
        System.out.print("Con la edad de " + edad + " eres: " + esmayor);
        // TODO code application logic here
    }
    
}
