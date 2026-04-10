/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author 01_1DAW_Alum
 */
abstract class AnimalBase implements Animal {

   protected String nombre;

   public AnimalBase(String nombre) {

       this.nombre = nombre;

   }

   public void mostrarNombre() {

       System.out.println("Nombre: " + nombre);

   }

}
