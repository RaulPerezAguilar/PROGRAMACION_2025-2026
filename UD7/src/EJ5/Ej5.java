/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ5;

import java.util.Scanner;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        try {
        introduceEnteros();
        } catch (NumeroRepetido e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FIN");
        }
    }
    
    private static void introduceEnteros() throws IllegalArgumentException{
            int[] lista = new int[5];
            lista[0] = 0;
            lista[1] = 12;
            lista[2] = 2;
            lista[3] = 3;
            lista[4] = 4;
            
            Scanner sc =new Scanner(System.in);
            int num = sc.nextInt();
            
            lista[2] = 12;
            if (estaEnLista(lista, num))
               throw new NumeroRepetido("Numero repetido");
                
            for (int e: lista) {
                System.out.println(e);
            }
           }
    private static boolean estaEnLista(int[] lista, int num) {
        boolean esta = false;
        for (int e: lista) {
            if (e == num)
                esta = true;
        }
        return esta;
    }
    
}
