package  Experiment7;
abstract class Shape {
  
    abstract void calculateArea();
}
class Rectangle extends Shape {
    private double length, width;

  
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

 
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        rectangle.calculateArea();
        circle.calculateArea();
    }
}
