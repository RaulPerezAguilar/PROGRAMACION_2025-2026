/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author 01_1DAW_Alum
 */
public class EJ6_Radio_Y_Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio de tu circulo: ");
        double radio = sc.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud es de: " + longitud);
        System.out.println("El area es de: " + area);
        // TODO code application logic here
    }
    
}
