/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;

/**
 *
 * @author 01_1DAW_Alum
 */
public class EJ27_Multiplos_De_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; 100 >= n; i++) {
            int multi = 7 * i;
            if (multi < 100) {
                System.out.println(multi);
            }
            n = i * 7;
        }
        // TODO code application logic here
    }
    
}
