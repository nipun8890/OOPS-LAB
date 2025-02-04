package Experiment4;

public class carclass {


 private String make;
 private String model;
 private int year;

 public carclass(String make, String model, int year) {
     this.make = make;  
     this.model = model; 
     this.year = year;   
 }

 public void displayDetails() {
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
 }


 public static void main(String[] args) {
     carclass myCar = new carclass("Tesla", "Model 3", 2025);
     System.out.println("Car Details:");
     myCar.displayDetails();
 }
}