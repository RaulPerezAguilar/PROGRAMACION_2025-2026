/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Ciudad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Juan = new Persona();
        Juan.nombre = "Juan";
        Juan.edad = 34;
        Juan.altura = 170;
        Persona Pepe = new Persona();
        Pepe.nombre = "Pepe";
        Pepe.edad = 75;
        Pepe.altura = 175;
        Persona Manolo = new Persona();
        Manolo.nombre = "Manolo";
        Manolo.edad = 18;
        Manolo.altura = 180;
        
        System.out.println(Juan.nombre + Juan.edad + Juan.altura);
    }
    
}
