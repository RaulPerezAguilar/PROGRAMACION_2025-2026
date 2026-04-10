/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("ABC123", "Toyota", 2020, FuelType.GASOLINE, 4);
        Motorcycle moto1 = new Motorcycle("XYZ789", "Yamaha", 2022, FuelType.ELECTRIC, false);

        System.out.println(car1);
        System.out.println("Velocidad: " + car1.calculateSpeed());
        System.out.println("Mantenimiento: " + car1.nextMaintenanceDate());

        System.out.println();

        System.out.println(moto1);
        System.out.println("Velocidad: " + moto1.calculateSpeed());
        System.out.println("Mantenimiento: " + moto1.nextMaintenanceDate());

        System.out.println();

        System.out.println("Total vehículos: " + Vehicle.getTotalVehicles());
    }
}
