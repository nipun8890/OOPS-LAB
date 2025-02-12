package Experiment5;

public class vechiclemanufacturing {

}
class Vehicle {
    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price); // Calling Vehicle constructor
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling Vehicle's displayDetails
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    double batteryCapacity;
    double chargingTime;

    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, double batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType); // Calling Car constructor
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling Car's displayDetails
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
    }
}

class Motorcycle extends Vehicle {
    double engineCapacity;
    String type; // e.g., "Sport", "Cruiser"

    public Motorcycle(String brand, String model, double price, double engineCapacity, String type) {
        super(brand, model, price); // Calling Vehicle constructor
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling Vehicle's displayDetails
        System.out.println("Engine Capacity: " + engineCapacity + " cc, Type: " + type);
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 90000, 5, "Electric", 100, 8);
        Motorcycle harley = new Motorcycle("Harley-Davidson", "Sportster", 12000, 1200, "Cruiser");
        Car toyota = new Car("Toyota", "Camry", 25000, 5, "Petrol");

        tesla.displayDetails();
        System.out.println("--------------------");
        harley.displayDetails();
        System.out.println("--------------------");
        toyota.displayDetails();
    }
}