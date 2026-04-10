/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author 01_1DAW_Alum
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Crear un ArrayList de tipo Animal
        ArrayList<Animal> animales = new ArrayList<>();
        
        // Añadir distintos animales

        animales.add(new Gato());
        animales.add(new Vaca());

        // Recorrer la colección y ejecutar hacerSonido()
        for (Animal animal : animales) {
            animal.hacerSonido(); // Polimorfismo en acción
        }
    }
}
