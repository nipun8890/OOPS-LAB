package Experiment2;

public class ques3 {

public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    
    public double calculateArea(double side) {
        return side * side;
    }

    
    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    
    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        ques3 calculator = new ques3();

       
        System.out.println("Area of Rectangle (length=5, breadth=4): " + calculator.calculateArea(5, 4));

   
        System.out.println("Area of Square (side=6): " + calculator.calculateArea(6));

        // Circle area
        System.out.println("Area of Circle (radius=3): " + calculator.calculateArea(3, true));

        // Triangle area
        System.out.println("Area of Triangle (base=8, height=5): " + calculator.calculateArea(8, 5, true));
    }
}


