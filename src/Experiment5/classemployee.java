package Experiment5;
//Employee class
class classemployee {
 String name;
 int empid;
 double salary;

 // Default constructor
 public classemployee() {
     this.name = "Unknown";
     this.empid = 0;
     this.salary = 0.0;
 }

 // Parameterized constructor
 public classemployee(String name, int empid, double salary) {
     this.name = name;
     this.empid = empid;
     this.salary = salary;
 }

 // Method to return employee's name
 public String getName() {
     return name;
 }

 // Method to return employee's salary
 public double getSalary() {
     return salary;
 }

 // Method to increase salary by a specified percentage
 public void increaseSalary(double percentage) {
     this.salary += this.salary * (percentage / 100);
 }

 @Override
 public String toString() {  //Overriding toString for better output
     return "Name: " + name + ", EmpID: " + empid + ", Salary: " + salary;
 }
}

//Manager class (subclass of Employee)
class Manager extends classemployee {
 String department;

 // Constructor for Manager
 public Manager(String name, int empid, double salary, String department) {
     super(name, empid, salary); // Call the superclass constructor
     this.department = department;
 }

 //Getter for department
 public String getDepartment() {
     return department;
 }

 @Override
 public String toString() { //Overriding toString for better output
     return super.toString() + ", Department: " + department;
 }

 public static <Employee> void main(String[] args) {
     // Create an Employee object using the default constructor
     Employee emp1 = new Employee();
     System.out.println("Employee 1 (Default): " + emp1);


     // Create an Employee object using the parameterized constructor
     Employee emp2 = new Employee("John Doe", 12345, 50000);
     System.out.println("Employee 2: " + emp2);

     // Increase the salary of emp2 by 10%
     ((classemployee) emp2).increaseSalary(10);
     System.out.println("Employee 2 (After salary increase): " + emp2);

     // Create a Manager object
     Manager manager1 = new Manager("Jane Smith", 67890, 80000, "Sales");
     System.out.println("Manager 1: " + manager1);


     // Accessing Manager's department
     System.out.println("Manager's Department: " + manager1.getDepartment());

     //Increase manager's salary
     manager1.increaseSalary(15);
     System.out.println("Manager 1 (After salary increase): " + manager1);


 }
}
