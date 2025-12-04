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
public class EJ21_Dias_Del_Mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime de que mes quieres saber cuantos dias tiene: ");
        int mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.print("El mes numero " + mes + "(Enero) tiene 31 dias");
                break;
            case 2:
                System.out.print("El mes numero " + mes + "(Febrero) tiene 28 dias");
                break;
            case 3:
                System.out.print("El mes numero " + mes + "(Marzo) tiene 31 dias");
                break;
            case 4:
                System.out.print("El mes numero " + mes + "(Abril) tiene 30 dias");
                break;
            case 5:
                System.out.print("El mes numero " + mes + "(Mayo) tiene 31 dias");
                break;
            case 6:
                System.out.print("El mes numero " + mes + "(Junio) tiene 30 dias");
                break;
            case 7:
                System.out.print("El mes numero " + mes + "(Julio) tiene 31 dias");
                break;
            case 8:
                System.out.print("El mes numero " + mes + "(Agosto) tiene 31 dias");
                break;
            case 9:
                System.out.print("El mes numero " + mes + "(Septiembre) tiene 30 dias");
                break;
            case 10:
                System.out.print("El mes numero " + mes + "(Octubre) tiene 31 dias");
                break;
            case 11:
                System.out.print("El mes numero " + mes + "(Noviembre) tiene 30 dias");
                break;
            case 12:
                System.out.print("El mes numero " + mes + "(Diciembre) tiene 31 dias");
                break;
        }
        // TODO code application logic here
    }
    
}
