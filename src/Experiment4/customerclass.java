package Experiment4;

public class customerclass {
   private double balance;
 public customerclass(double initialBalance) {
        this.balance = initialBalance;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " to balance.");
        } else {
            System.out.println("Invalid amount. Cannot add to balance.");
        }
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " to balance.");
        } else {
            System.out.println("Invalid amount. Cannot add to balance.");
        }
    }

    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Deducted " + amount + " from balance.");
        } else {
            System.out.println("Invalid deduction. Check balance or amount.");
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        customerclass customer = new customerclass(1000.0);

 
        customer.addBalance(500.5);  
        customer.addBalance(200); 
        customer.showBalance();

        customer.deductBalance(300);
        customer.showBalance();
    }
}
