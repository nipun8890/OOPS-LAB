package Experiment10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");

       
        frame.setLayout(new GridLayout(3, 2));

       
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel(""); 

    
        frame.add(usernameLabel);
        frame.add(usernameField);

        frame.add(passwordLabel);
        frame.add(passwordField);

        frame.add(loginButton);
        frame.add(messageLabel);

       
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);

      
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();

            
                if (username.equals("admin") && new String(password).equals("password")) {
                    messageLabel.setText("Login Successful");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Invalid credentials");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });
    }
}
