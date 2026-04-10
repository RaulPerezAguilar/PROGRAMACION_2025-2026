/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String brand, int year, FuelType fuelType, boolean hasSidecar) {
        super(licensePlate, brand, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateSpeed() {
        // Ejemplo: velocidad depende de si tiene sidecar
        return hasSidecar ? 90 : 140;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "licensePlate='" + getLicensePlate() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", year=" + getYear() +
                ", fuelType=" + getFuelType() +
                ", hasSidecar=" + hasSidecar +
                '}';
    }

    // Getter y Setter
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}