package Experiment8;

public class passwordvalidation {

}
class WeakPasswordException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public WeakPasswordException(String message) {
        super(message);
    }
}

class PasswordValidator {
    public void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Password too short! Must be at least 8 characters long.");
        }
        if (!password.matches(".*[a-zA-Z].*") || !password.matches(".*[0-9].*")) {
            throw new WeakPasswordException("Password must contain both letters and numbers.");
        }
        System.out.println("Password is strong.");
    }

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String[] testPasswords = {"12345", "password", "pass123", "StrongPass1"};

        for (String password : testPasswords) {
            try {
                validator.validatePassword(password);
            } catch (WeakPasswordException e) {
                System.out.println("Weak password: " + e.getMessage());
            }
        }
    }
}
