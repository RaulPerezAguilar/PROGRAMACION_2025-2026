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
public class EJ9_Comprobacion_De_Factores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Has terminado las tareas? (True o False): ");
        boolean tarea = sc.nextBoolean();
        System.out.print("¿Esta lloviendo? (True o False): ");
        boolean llueve = sc.nextBoolean();
        
        if (tarea && !llueve) {
            System.out.print("Puedes salir a la calle a disfrutar la vida");
        } else {
            System.out.print("¿ecesitas ir a la biblioteca? (True o False):");
            boolean biblio = sc.nextBoolean();
            if (biblio) {
                System.out.print("Pues puedes salir pero unicamente a la biblioteca, pilla el paraguas si llueve");
            } else {
                System.out.print("No puedes salir de casa, haz tus deberes primero");
            }
        }

        // TODO code application logic here
    }
    
}
