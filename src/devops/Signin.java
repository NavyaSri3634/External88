
package devops;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signin {

    public static void main(String[] args) {
        // Create the frame for the sign-in window
        JFrame frame = new JFrame("Sign In");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Create components for username, password, and buttons
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField();
        
        JButton signInButton = new JButton("Sign In");
        JButton resetButton = new JButton("Reset");

        // Add components to the panel
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(signInButton);
        panel.add(resetButton);

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);
        
        // Create action for Sign In button
        signInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if (username.equals("user") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Sign-In Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Create action for Reset button
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passwordText.setText("");
            }
        });

        // Display the window
        frame.setVisible(true);
    }
}