package Experiment4;

public class clubclass {


 static String clubName = "Global Coding Club";
 String memberName;
 public clubclass(String memberName) {
     this.memberName = memberName;
 }


 public static void displayClubName() {
     System.out.println("Club Name: " + clubName);
 }

 // Method to display member details
 public void displayMemberDetails() {
     System.out.println("Member Name: " + memberName);
     System.out.println();
 }
 public static void main(String[] args) {
     clubclass.displayClubName();
     clubclass member1 = new clubclass("Alice");
     clubclass member2 = new clubclass ("Bob");
     clubclass  member3 = new clubclass ("Charlie");

     System.out.println("Member 1 Details:");
     member1.displayMemberDetails();

     System.out.println("Member 2 Details:");
     member2.displayMemberDetails();

     System.out.println("Member 3 Details:");
     member3.displayMemberDetails();
     System.out.println("Changing Club Name to 'Elite Coders Club'...");
     clubclass .clubName = "Elite Coders Club"; 
     System.out.println("\nUpdated Club Name:");
     clubclass.displayClubName();

     System.out.println("Updated Member 1 Details:");
     member1.displayMemberDetails();

     System.out.println("Updated Member 2 Details:");
     member2.displayMemberDetails();

     System.out.println("Updated Member 3 Details:");
     member3.displayMemberDetails();
 }
}