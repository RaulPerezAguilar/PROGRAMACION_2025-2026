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
public class EJ24_Edad_Maxima_Y_Minima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 150;
        int edad = 0;
        while (edad != -1) {
        System.out.println("Introduce una edad (-1 para salir): ");
        edad = sc.nextInt();

        if (edad > max) {
            max = edad;
        } if (edad < min) {
            min = edad;
        }
        System.out.println("Contenido actual");
        System.out.println("Edad minima: " + min);
        System.out.println("Edad maxima: " + max);
        // TODO code application logic here
    }
    
}
}