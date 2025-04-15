package Experiment10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopwatch {

    private JFrame frame;
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedTime; 
    public Stopwatch() {
       
        frame = new JFrame("Stopwatch");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 150);
        frame.setLocationRelativeTo(null); 

       
        timeLabel = new JLabel("0");
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

       
        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

      
        elapsedTime = 0;

      
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime++; 
                timeLabel.setText(String.valueOf(elapsedTime));
            }
        });

        // Button actions
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start(); 
                startButton.setEnabled(false); 
                stopButton.setEnabled(true); 
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop(); // Stop the timer
                startButton.setEnabled(true);
                stopButton.setEnabled(false); 
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop(); 
                elapsedTime = 0; 
                timeLabel.setText("0");
                startButton.setEnabled(true); 
                stopButton.setEnabled(false); 
            }
        });

       
        stopButton.setEnabled(false);

       
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Stopwatch(); 
            }
        });
    }
}
