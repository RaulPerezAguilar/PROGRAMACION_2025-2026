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
public class EJ11_Mayor_De_Dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int n2 = sc.nextInt();
        int mayor = n1 > n2 ? n1 : n2;
        System.out.print("El numero mas grande es: " + mayor);
        // TODO code application logic here
    }
    
}
