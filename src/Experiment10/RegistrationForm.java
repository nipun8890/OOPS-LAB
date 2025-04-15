package Experiment10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {

    private JFrame frame;
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JLabel nameErrorLabel, emailErrorLabel, passwordErrorLabel, confirmPasswordErrorLabel, successLabel;

    public RegistrationForm() {
        frame = new JFrame("Registration Form");

        frame.setLayout(new GridLayout(6, 2, 10, 10));

     
        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();

     
        nameErrorLabel = new JLabel("");
        emailErrorLabel = new JLabel("");
        passwordErrorLabel = new JLabel("");
        confirmPasswordErrorLabel = new JLabel("");
        successLabel = new JLabel("");

    
        JButton registerButton = new JButton("Register");

        // Add components to the frame
        frame.add(new JLabel("Name:"));
        frame.add(nameField);
        frame.add(nameErrorLabel);

        frame.add(new JLabel("Email:"));
        frame.add(emailField);
        frame.add(emailErrorLabel);

        frame.add(new JLabel("Password:"));
        frame.add(passwordField);
        frame.add(passwordErrorLabel);

        frame.add(new JLabel("Confirm Password:"));
        frame.add(confirmPasswordField);
        frame.add(confirmPasswordErrorLabel);

        frame.add(registerButton);
        frame.add(successLabel);

    
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);

    
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                nameErrorLabel.setText("");
                emailErrorLabel.setText("");
                passwordErrorLabel.setText("");
                confirmPasswordErrorLabel.setText("");
                successLabel.setText("");

        
                boolean valid = true;

             
                if (nameField.getText().trim().isEmpty()) {
                    nameErrorLabel.setText("Name is required");
                    valid = false;
                }

              
                String email = emailField.getText().trim();
                if (email.isEmpty()) {
                    emailErrorLabel.setText("Email is required");
                    valid = false;
                } else if (!isValidEmail(email)) {
                    emailErrorLabel.setText("Invalid email format");
                    valid = false;
                }

              
                char[] password = passwordField.getPassword();
                if (password.length == 0) {
                    passwordErrorLabel.setText("Password is required");
                    valid = false;
                }

             
                char[] confirmPassword = confirmPasswordField.getPassword();
                if (confirmPassword.length == 0) {
                    confirmPasswordErrorLabel.setText("Confirm password is required");
                    valid = false;
                } else if (!new String(password).equals(new String(confirmPassword))) {
                    confirmPasswordErrorLabel.setText("Passwords do not match");
                    valid = false;
                }

                if (valid) {
                    successLabel.setText("Registration Successful!");
                    successLabel.setForeground(Color.GREEN);
                }
            }
        });
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}
