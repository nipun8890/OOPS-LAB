package Experiment4;

public class bookclass {


 private String title;
 private String author;
 private int publicationYear;


 public bookclass() {
     this.title = "Untitled";
     this.author = "Unknown Author";
     this.publicationYear = 0; 
 }


 public bookclass(String title, String author) {
     this.title = title;
     this.author = author;
     this.publicationYear = 0; 
 }


 public bookclass(String title, String author, int publicationYear) {
     this.title = title;
     this.author = author;
     this.publicationYear = publicationYear;
 }

  public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     if (publicationYear != 0) {
         System.out.println("Publication Year: " + publicationYear);
     } else {
         System.out.println("Publication Year: Not specified");
     }
     System.out.println(); 
 }
 public static <Book> void main(String[] args) {
     bookclass book1 = new bookclass ();
     System.out.println("Book 1 (Default Constructor):");
     ((bookclass) book1).displayDetails();
      bookclass book2 = new bookclass("The Great Gatsby", "F. Scott Fitzgerald");
     System.out.println("Book 2 (Parameterized Constructor - Title and Author):");
     ((bookclass) book2).displayDetails();
     bookclass book3 = new bookclass("1984", "George Orwell", 1949);
     System.out.println("Book 3 (Parameterized Constructor - Title, Author, and Year):");
     book3.displayDetails();
 }
}