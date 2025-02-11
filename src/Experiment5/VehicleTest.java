package Experiment5;
//Abstract class Vehicle
abstract class Vehicle {
 private String make;
 private String model;

 public Vehicle(String make, String model) {
     this.make = make;
     this.model = model;
 }

 public abstract void startEngine();

 public abstract void stopEngine();

 public void serviceInfo() {
     System.out.println("Basic Servicing Instructions:");
     System.out.println("1. Check engine oil and coolant levels.");
     System.out.println("2. Inspect tires for wear and pressure.");
     System.out.println("3. Ensure all lights are working.");
 }


 public String getMake() {
     return make;
 }

 public String getModel() {
     return model;
 }
}


class Car extends Vehicle {
 public Car(String make, String model) {
     super(make, model);
 }

 @Override
 public void startEngine() {
     System.out.println("Starting the car engine...");
     System.out.println("Vroom! Vroom!");
 }

 @Override
 public void stopEngine() {
     System.out.println("Stopping the car engine...");
     System.out.println("Engine off.");
 }
}

public class VehicleTest {
 public static void main(String[] args) {
     Car myCar = new Car("Toyota", "Camry");

     System.out.println("Car Make: " + myCar.getMake());
     System.out.println("Car Model: " + myCar.getModel());

     myCar.startEngine();
     myCar.serviceInfo(); 
     myCar.stopEngine();

   
     Vehicle myVehicle = myCar; 
     myVehicle.startEngine(); 
     myVehicle.serviceInfo(); 
     myVehicle.stopEngine(); 

 }
}