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
public class EJ31_Funcion_3_Holas {
    public static int hola3veces() { // 'a' y 'b' son parámetros
        for (int i = 1;i <= 3; i++) {
            System.out.println("Hola");
        }
        return 0;
    }
    public static int hola() {
        System.out.print("Introduce cuantos hola quieres: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n; i++) {
            System.out.println("hola");
        }   
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hola3veces();
        hola();

    }
    
}
