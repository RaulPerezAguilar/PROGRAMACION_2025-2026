/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco.Examen;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo Audi = new Vehiculo ("2846JUK","Audi",2020,20000.00,TipoVehiculo.COCHE);  // Creacion de tres vehiculos base ademas de uno con referencia del primero
        Vehiculo Mercedes = new Vehiculo ("0749HYF","Mercedes",2020,20000.00,TipoVehiculo.COCHE);
        Vehiculo BMW = new Vehiculo ("940KFT","BMW",2010,4000.00,TipoVehiculo.MOTO);
        Vehiculo Audi2 = Audi; // Este apunta al primer Audi
        
        Audi.mostrarDatos();
        Audi2.mostrarDatos();
        Audi2.cambioPrecio(); // Muestro los datos y despues los modifico de Audi2 para que se vea que se modifican en Audi tambien
        Audi.mostrarDatos();
        Audi2.mostrarDatos();
        
        Mercedes.mostrarDatos(); // Mostrar los datos de los otros coche
        BMW.mostrarDatos();
        
        System.out.println("-------------------------------------"); // Comprobar si es antiguo el vehiculo
        System.out.println("¿El coche es antiguo?");
        System.out.println(Audi.esAntiguo());
        System.out.println("-------------------------------------");
        
    }
    
}
