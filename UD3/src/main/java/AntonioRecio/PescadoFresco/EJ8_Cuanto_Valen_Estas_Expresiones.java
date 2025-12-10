/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;

/**
 *
 * @author 01_1DAW_Alum
 */
public class EJ8_Cuanto_Valen_Estas_Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean comprobacion1 = 3<=5 && 2==2;
        boolean comprobacion2 = 3<=5 && 2>10;
        boolean comprobacion3 = 1 != 2 || 5<3;
        boolean comprobacion4 = !(1<2);
        System.out.println("La primera comprobacion da: " + comprobacion1);
        System.out.println("La segunda comprobacion da: " + comprobacion2);
        System.out.println("La tercera comprobacion da: " + comprobacion3);
        System.out.println("La cuarta comprobacion da: " + comprobacion4);
        // TODO code application logic here
    }
    
}
