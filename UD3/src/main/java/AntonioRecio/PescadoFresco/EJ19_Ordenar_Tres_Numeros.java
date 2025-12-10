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
public class EJ19_Ordenar_Tres_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero a ordenar: ");
        int n1 = sc.nextInt();
        System.out.print("Dame el primer segundo a ordenar: ");
        int n2 = sc.nextInt();
        System.out.print("Dame el primer tercer a ordenar: ");
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + n2 + n3);
        } if (n1 > n3 && n3 > n2 && n1 > n2) {
            System.out.println(n1 + n3 + n2);
        } if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n2 + n1 + n3);
        } if (n2 > n1 && n2 > n3 && n3 > n1) {
            System.out.println(n2 + n3 + n1);
        } if (n3 > n1 && n3 > n2 && n2 > n1) {
            System.out.println(n3 + n2 + n1);
        } if (n3 > n1 && n3 > n2 && n2 > n1) {
            System.out.println(n3 + n2 + n1);
        }
        // TODO code application logic here
    }
    
}
