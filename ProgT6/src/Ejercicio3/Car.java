package Ejercicio3;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
        super(licensePlate, brand, year, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateSpeed() {
        // Ejemplo: velocidad basada en número de puertas
        return 120 + (numberOfDoors * 5);
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + getLicensePlate() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", year=" + getYear() +
                ", fuelType=" + getFuelType() +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    // Getter y Setter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}