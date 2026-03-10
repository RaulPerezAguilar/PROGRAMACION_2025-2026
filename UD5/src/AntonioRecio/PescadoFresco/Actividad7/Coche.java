/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AntonioRecio.PescadoFresco.Actividad7;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Coche extends Vehiculo{
    private int numPuertas;
    
        Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }
    
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numPuertas);
        
    }
    
    public void mover () {
    
    }
    
    public int getnumPuertas(int numPuertas) {
        return numPuertas;
    }
}
