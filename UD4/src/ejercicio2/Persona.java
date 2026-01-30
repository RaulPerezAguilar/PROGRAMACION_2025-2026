/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Persona {
    String nombre;
    int edad;
    double altura;
    Sexo genero;
    
    void saludar() {
        System.out.println("Hola");
    }
    
    void cumplirAños() {
        edad = edad + 1;
    }
    
    void crecer(double crecimiento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto has crecido?");
        crecimiento = sc.nextDouble();
        altura = altura + crecimiento;
    }
}
