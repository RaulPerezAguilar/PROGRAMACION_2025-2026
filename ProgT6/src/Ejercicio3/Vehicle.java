package Ejercicio3;

import java.time.LocalDate;

public abstract class Vehicle implements Maintenance {

    private String licensePlate;
    private String brand;
    private int year;
    private FuelType fuelType;

    private static int vehicleCount = 0;

    // Constructor
    public Vehicle(String licensePlate, String brand, int year, FuelType fuelType) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
        vehicleCount++;
    }

    // Método abstracto
    public abstract double calculateSpeed();

    // Implementación de la interfaz
    @Override
    public String nextMaintenanceDate() {
        // Ejemplo: mantenimiento en 6 meses
        return LocalDate.now().plusMonths(6).toString();
    }

    // Método con lógica básica
    public double getFuelEfficiency() {
        switch (fuelType) {
            case ELECTRIC:
                return 100.0;
            case HYBRID:
                return 70.0;
            case DIESEL:
                return 50.0;
            case GASOLINE:
            default:
                return 40.0;
        }
    }

    public static int getTotalVehicles() {
        return vehicleCount;
    }

    // Getters y Setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return licensePlate.equals(other.licensePlate);
    }

    // toString
    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", fuelType=" + fuelType +
                '}';
    }
}