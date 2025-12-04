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
public class EJ10_Frutero_Beneficios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos Kg de Manzanas a vendio?: ");
        int manzanas = sc.nextInt();
        System.out.print("¿Cuantos Kg de Peras a vendio?: ");
        int peras = sc.nextInt();
        double dineromanzanas = manzanas * 2.35;
        double dineroperas = peras * 1.95;
        double dinerototal = dineromanzanas + dineroperas;
        System.out.println("El dinero toal genreado por manzanas y peras es de " + dinerototal);
        System.out.println("El dinero generado por manzanas es de "+ dineromanzanas);
        System.out.println("El dinero generado por peras es de " + dineroperas);
    }
    
}
