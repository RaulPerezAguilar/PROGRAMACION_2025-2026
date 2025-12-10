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
public class EJ12_Valor_Absoluto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        int absoluto = Math.abs(n1);
        System.out.print("El valor absoluto de " + n1 + " es: " + absoluto);
        // TODO code application logic here
    }
    
}
