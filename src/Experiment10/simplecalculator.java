package Experiment10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simplecalculator {

    private JFrame frame;
    private JTextField textField;
    private StringBuilder input;

    public simplecalculator() {
        frame = new JFrame("Simple Calculator");
        textField = new JTextField();
        input = new StringBuilder();

      
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        
        textField.setFont(new Font("Arial", Font.PLAIN, 30));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        frame.add(textField, BorderLayout.NORTH);

       
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        
       
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };
        
     
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }
        
        frame.add(panel, BorderLayout.CENTER);

       
        frame.setVisible(true);
    }

    
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String command = source.getText();

            if (command.equals("=")) {
              
                try {
                    double result = evaluate(input.toString());
                    textField.setText(String.valueOf(result));
                    input.setLength(0); 
                    input.append(result); 
                } catch (Exception ex) {
                    textField.setText("Error");
                    input.setLength(0);
                }
            } else if (command.equals("C")) {
                
                input.setLength(0);
                textField.setText("");
            } else {
                
                input.append(command);
                textField.setText(input.toString());
            }
        }
    }

  
    private double evaluate(String expression) {
        
        String[] tokens = expression.split("(?=[-+*/])|(?<=[-+*/])");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double num = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    if (num != 0) {
                        result /= num;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(simplecalculator::new);
    }
}
