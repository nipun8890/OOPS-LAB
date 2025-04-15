package Experiment8;

public class orderprocessing {

}
class InvalidOrderAmountException extends Exception {
   
	private static final long serialVersionUID = 1L;

	public InvalidOrderAmountException(String message) {
        super(message);
    }
}

class OrderProcessor {
    public void processOrder(double amount) throws InvalidOrderAmountException {
        if (amount <= 0) {
            throw new InvalidOrderAmountException("Invalid order amount: " + amount + ". Amount must be positive.");
        }
        System.out.println("Order processed successfully for amount: " + amount);
    }

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        double[] orderAmounts = {100.50, -20.00, 0, 250.75};
        for (double amount : orderAmounts) {
            try {
                processor.processOrder(amount);
            } catch (InvalidOrderAmountException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
