package Experiment4;

public class productclass<staticfinal> {


 private String productId;
 private String productName;
 private String category;
 private double price;

 
 private static int totalProducts = 0;

 public productclass() {
     this.productId = "P001";
     this.productName = "Default Product";
     this.category = "General";
     this.price = 0.0;
     totalProducts++; 
 }

 
 public productclass(String productId, String productName, String category, double price) {
     this.productId = productId;
     this.productName = productName;
     this.category = category;
     this.price = price;
     totalProducts++; 
 }
 
 public double getPrice() {
     return price;
 }

 
 public void displayProductInfo() {
     System.out.println("Product ID: " + productId);
     System.out.println("Product Name: " + productName);
     System.out.println("Category: " + category);
     System.out.println("Price: $" + price);
 }


 public static void displayTotalProducts() {
     System.out.println("Total Products: " + totalProducts);
 }

 
 public double calculateStockValue(int quantity) {
     return price * quantity;
 }

 
 public double calculateStockValue(int quantity, double discountRate) {
     double totalValue = price * quantity;
     return totalValue - (totalValue * discountRate / 100);
 }
 public static void main(String[] args) {
    
    productclass product1 = new productclass();
     productclass product2 = new productclass("P002", "Laptop", "Electronics", 1200.0); 
     productclass product3 = new productclass("P003", "Smartphone", "Electronics", 800.0); 

   
    productclass.displayTotalProducts();

  
     System.out.println("\nProduct 1 Details:");
     product1.displayProductInfo();
     System.out.println("Stock Value (Quantity: 10): $" + product1.calculateStockValue(10));

     System.out.println("\nProduct 2 Details:");
     product2.displayProductInfo();
     System.out.println("Stock Value (Quantity: 5): $" + product2.calculateStockValue(5));
     System.out.println("Stock Value (Quantity: 5, Discount: 10%): $" + product2.calculateStockValue(5, 10));

     System.out.println("\nProduct 3 Details:");
     product3.displayProductInfo();
     System.out.println("Stock Value (Quantity: 8): $" + product3.calculateStockValue(8));
     System.out.println("Stock Value (Quantity: 8, Discount: 15%): $" + product3.calculateStockValue(8, 15));
 }
}