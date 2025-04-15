package Experiment9;
import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

   
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

   
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

    public static void main(String[] args) {
       
        ArrayList<Employee> employees = new ArrayList<>();

        
        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 55000));
        employees.add(new Employee("Charlie", 103, 60000));

     
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 58000;
                break;
            }
        }

  
        employees.removeIf(emp -> emp.id == 103);

        
        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
