/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Perro extends AnimalBase implements Animal {
    

    public void hacerSonido() {
        System.out.println("El perro ladra: GUAU");
    }
    
    public Perro(String nombre) {
        super(nombre);
    }
}
