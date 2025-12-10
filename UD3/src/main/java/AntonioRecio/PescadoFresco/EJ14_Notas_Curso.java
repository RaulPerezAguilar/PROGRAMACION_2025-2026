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
public class EJ14_Notas_Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la nota del primer trimestre: ");
        int n1 = sc.nextInt();
        
        System.out.print("Dime la nota del segundo trimestre: ");
        int n2 = sc.nextInt();
        
        System.out.print("Dime la nota del tercer trimestre: ");
        int n3 = sc.nextInt();
        
        int notaMedia = (n1 + n2 + n3) / 3;
        
        System.out.print("La nota media es de: " + notaMedia);
        // TODO code application logic here
    }
    
}
