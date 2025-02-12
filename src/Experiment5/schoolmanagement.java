package Experiment5;
abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void performDuty();

    @Override
    public String toString() {
        return "Name: " + name;
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is studying.");
    }
}

class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is teaching.");
    }

    public static void main(String[] args) {
        Person[] people = new Person[4]; 
        people[0] = new Student("Alice");
        people[1] = new Teacher("Mr. Smith");
        people[2] = new Student("Bob");
        people[3] = new Teacher("Ms. Johnson");

        for (Person person : people) {
            System.out.println(person); 
            person.performDuty();      
            System.out.println("--------------------");
        }
    }
}