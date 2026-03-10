package AntonioRecio.PescadoFresco;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 01_1DAW_Alum
 */
public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    
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
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double gerAltura() {
        return altura;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
