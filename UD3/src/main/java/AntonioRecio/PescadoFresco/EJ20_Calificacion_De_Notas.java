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
public class EJ20_Calificacion_De_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cual a sido tu nota: ");
    int num = sc.nextInt();
        if (num >= 0 && num <= 10) {
            switch (num) {
            case 1,2,3,4:
                System.out.print("Tu nota es insuficiente");
                break;
            case 5 :
                System.out.print("Tu nota es suficiente");
                break;
            case 6 :
                System.out.print("Tu nota es bien");
                break;
            case 7,8 :
                System.out.print("Tu nota es notable");
                break;
            case 9,10 :
                System.out.print("Tu nota es sobresaliente");
                break;
            }

        } else {
        System.out.print("Nota no valida");
        }
                // TODO code application logic here
    }
    
}
