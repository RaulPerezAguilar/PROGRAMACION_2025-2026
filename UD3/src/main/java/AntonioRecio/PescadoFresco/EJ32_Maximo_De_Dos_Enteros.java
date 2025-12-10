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
public class EJ32_Maximo_De_Dos_Enteros {
    public static int maximo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        int n2 = sc.nextInt();
        int resultado = Math.max(n1, n2);
        System.out.print("El numero maximo es: " + resultado);
        return resultado;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        maximo();

        // TODO code application logic here
    }
    
}
