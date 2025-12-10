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
public class EJ22_Comprobacion_De_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = 1;
            while (n != 0) {
            System.out.println("-----Dame un numero para comprobar si es par/positivo y darte su cuadrado----- ");
            System.out.print("Numero (Coloque 0 para salir): ");
            n = sc.nextInt();
            //Comprobar par
            boolean par = n % 2 == 0;
            boolean positivo = n >= 0;
            double cuadrado = Math.pow(n, 2);
            System.out.println("---------Resultados--------------");
            System.out.println("-----¿Es par ?" + par + "---------------");
            System.out.println("-----¿Es positivo? " + positivo + "----------");
            System.out.println("-----El cuadrado de " + n + " es " + cuadrado + " -");
            System.out.println("---------------------------------");
                    
                    }
        // TODO code application logic here
    }
    
}
