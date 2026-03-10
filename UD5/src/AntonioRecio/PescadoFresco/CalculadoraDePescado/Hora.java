/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AntonioRecio.PescadoFresco.CalculadoraDePescado;
import java.util.Scanner;
/**
 *
 * @author 01_1DAW_Alum
 */
public class Hora {
    int hora;
    int minuto;
    int segundo;
    Scanner PESCADITO = new Scanner(System.in);
    void Lolipop() {
        System.out.print("Que hora es: ");
        hora = PESCADITO.nextInt();
        System.out.print("Que minuto es: ");
        minuto = PESCADITO.nextInt();
        System.out.print("Que segundo es: ");
        segundo = PESCADITO.nextInt();
    }
    
    void proximos(){
        int n = 0;
     while (n != 3) {
         if (segundo == 59) {
             segundo = 0;
             minuto = minuto + 1;
             if (minuto == 60) {
                 minuto = 0;
                 hora = hora + 1;
             } else {
                 if (minuto == 60) {
                 minuto = 0;
                 hora = hora + 1;
             } else {
                 }
             }
         }
            segundo = segundo + 1;
           n = n +1;  
         System.out.println(hora + ":" + minuto + ":" + segundo);
         
     }
    }
    
    void mostrarHora(){
    System.out.println(hora + ":" + minuto);
}
}
