/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author 01_1DAW_Alum
 */
public class EJ25_Juego_Matematico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("El juego conta de sumas, deberias de contestar correctamente a cada una de ellas");
        double respuesta;
        double suma;
        do {
            double max = 0;
            double min = 50;
            double n1 = Math.random() * (max - min) + min;
            double n2 = Math.random() * (max - min) + min;
            System.out.println("Suma = " + Math.round(n1) + " + " + Math.round(n2));
            System.out.print("Respuesta: ");
            respuesta = sc.nextInt();
            suma = Math.round(n1) + Math.round(n2);
        } while (respuesta == suma);
        System.out.println("Has fallado la suma");
        System.out.println("El resultado era: " + suma);
        // TODO code application logic here
    }
    
}
