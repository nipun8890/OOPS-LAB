package Balance;

public class balance {
    private double balance;

    public balance(double balance) {
        this.balance = balance;
    }

    public void Display_Balance() {
        System.out.println("Current Account Balance: $" + balance);
    }
}