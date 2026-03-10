/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AntonioRecio.PescadoFresco.Actividad7;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    
    Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    Vehiculo(){}
    
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
    }
    
    public void mover () {
    
    }
    
    public String getMarca(String marca) {
        return marca;
    }
    
    public String getModelo(String modelo) {
        return modelo;
    }
    
    public int getAnio(int anio) {
        return anio;
    }
}
