package Experiment5;
class Person {
 String name;
 int age;
 String address;

 public Person(String name, int age, String address) {
     this.name = name;
     this.age = age;
     this.address = address;
 }

 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
 }
}


class Staff extends Person {
 int staffId;
 String department;

 public Staff(String name, int age, String address, int staffId, String department) {
     super(name, age, address);
     this.staffId = staffId;
     this.department = department;
 }

 public void displayInfo() {
     super.displayInfo();
     System.out.println("Staff ID: " + staffId + ", Department: " + department);
 }
}

class Professor extends Staff {
 String specialization;

 public Professor(String name, int age, String address, int staffId, String department, String specialization) {
     super(name, age, address, staffId, department);
     this.specialization = specialization;
 }

 public void displayInfo() { 
     super.displayInfo();
     System.out.println("Specialization: " + specialization);
 }

 public void conductLecture() {
     System.out.println(name + " is conducting a lecture on " + specialization);
 }
}

class Student extends Person {
 int studentId;
 String course;

 public Student(String name, int age, String address, int studentId, String course) {
     super(name, age, address);
     this.studentId = studentId;
     this.course = course;
 }

 public void displayInfo() { 
     super.displayInfo();
     System.out.println("Student ID: " + studentId + ", Course: " + course);
 }
}

class GraduateStudent extends Student {
 String researchTopic;

 public GraduateStudent(String name, int age, String address, int studentId, String course, String researchTopic) {
     super(name, age, address, studentId, course);
     this.researchTopic = researchTopic;
 }

 public void displayInfo() { 
     super.displayInfo();
     System.out.println("Research Topic: " + researchTopic);
 }


 public void submitThesis() {
     System.out.println(name + " is submitting a thesis on " + researchTopic);
 }
}

public class universityclass {
 public static void main(String[] args) {
     Person[] people = new Person[4];

     people[0] = new Professor("Dr. Smith", 50, "123 Main St", 1001, "Computer Science", "Artificial Intelligence");
     people[1] = new GraduateStudent("Alice", 25, "456 Oak Ave", 2001, "Computer Science", "Deep Learning");
     people[2] = new Staff("Bob", 40, "789 Pine Ln", 3001, "Admin");
     people[3] = new Student("Charlie", 20, "101 Elm St", 4001, "Biology");


    
     for (Person p : people) {
         p.displayInfo(); 
         System.out.println("--------------------"); 

         if (p instanceof Professor) {
             Professor prof = (Professor) p; 
             prof.conductLecture();
         } else if (p instanceof GraduateStudent) {
             GraduateStudent gradStudent = (GraduateStudent) p;
         }
     }
 }
}