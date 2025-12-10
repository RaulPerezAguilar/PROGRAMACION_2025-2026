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
public class EJ17_Diferenciar_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        int n2 = sc.nextInt();
        boolean iguales = n1 == n2;
        int mayor = n1 > n2 ? n1 : n2;
        System.out.println("Son iguales?: " + iguales);
        System.out.println("El mayor es: "+ mayor);
        // TODO code application logic here
    }
    
}
