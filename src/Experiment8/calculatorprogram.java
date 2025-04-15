package Experiment8;

public class calculatorprogram {

}
class DivisionByZeroException extends ArithmeticException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisionByZeroException(String message) {
        super(message);
    }
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Error: Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int[][] testCases = {{10, 2}, {15, 3}, {8, 0}, {20, 5}};

        for (int[] testCase : testCases) {
            try {
                int result = divide(testCase[0], testCase[1]);
                System.out.println("Result: " + result);
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
