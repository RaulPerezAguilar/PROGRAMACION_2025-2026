/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AntonioRecio.PescadoFresco.Examen;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Vehiculo {
    private String matricula = "8649JPO";
    private String marca = "Audi"; // Creo los atributos con valores por defecto
    private int anioFabricacion = 1990;
    private double precioDia = 5.600;
    private TipoVehiculo vehiculo = TipoVehiculo.COCHE;
    
    public Vehiculo (String matricula, String marca, int anioFabricacion, double precioDia, TipoVehiculo vehiculo) {
        this.matricula = matricula;
        this.marca = marca; // Los inicializo con un constructor ussando this
        this.anioFabricacion = anioFabricacion;
        this.precioDia = precioDia;
        this.vehiculo = vehiculo;
    }
    
    void mostrarDatos() {
        System.out.println("-------------------------------------");
        System.out.println("Matricula del vehiculo: " + matricula); //Muestra todos los datos de los vehiculos
        System.out.println("Marca del vehiculo: " + marca);
        System.out.println("Año de fabricacion del vehiculo: " + anioFabricacion);
        System.out.println("Precio del vehiculo " + precioDia);
        System.out.println("TIpo de vehiculo: " + vehiculo);
        System.out.println("-------------------------------------");
    }
    
    boolean esAntiguo() {
        int fecha = 2026;   // Comprueba la edad del vehiculo y comprueba si es antiguo o no
        int edad = fecha - anioFabricacion; 
        return edad >= 10;
    }
    
    void cambioPrecio() {
        precioDia = 15000; // Modifica el precio del coche a uno fijo, esto se puede colocar un Scanner para poner uno personalizado
    }
    
    
}
