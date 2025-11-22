import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {

        // Create a frame
        JFrame frame = new JFrame("Swing Example");

        // Create a button
        JButton button = new JButton("Click Me");

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // Add button to frame
        frame.add(button);

        // Set frame size
        frame.setSize(300, 200);

        // Set close action
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make window visible
        frame.setVisible(true);
    }
}
