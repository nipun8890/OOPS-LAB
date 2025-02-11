package Experiment5;

class Superclass  {

 private String privateMember = "I am a private member of Superclass";

 public String getPrivateMember() {
     return privateMember;
 }
}

class Subclass extends Superclass {
 public void display() {
     System.out.println("Accessing private member through a public method: " + getPrivateMember());
 }
}

public class privatenumber {
 public static void main(String[] args) {
     Subclass subclass = new Subclass();
     subclass.display();
 }
}