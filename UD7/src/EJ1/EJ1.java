/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ1;

/**
 *
 * @author 01_1DAW_Alum
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("COMIENZO PROGAMA DIVISION");
        int dividendo = 5;
        int divisor = 0;
        try {
            System.out.println("Resultado: " + dividendo / divisor);
        } catch(ArithmeticException e) {
            System.out.println("Imposible dividir por 0");
            System.out.println();
        }
        System.out.println();
    }
    
}
