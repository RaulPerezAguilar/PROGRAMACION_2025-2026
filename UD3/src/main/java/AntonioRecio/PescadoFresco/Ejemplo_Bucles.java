/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Ejemplo_Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bucle normal con for
        for (int i = 0; i <= 3; i++) {
            System.out.print(i);
        }
        //Bucle for anidado
        int i,j;
        for (i = 1; i <=3; i++) {
            j = 1;
            while (j <= i) {
                System.out.print(j + i);
                j++;
        }
    }
        // TODO code application logic here
    }
    
}
