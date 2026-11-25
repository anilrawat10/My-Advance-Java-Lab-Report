import javax.swing.*;
import java.awt.event.*;

public class ButtonEventDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 14 | Button Event Handling"
        );

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");

        button.setBounds(130, 80, 120, 40);

        frame.setLayout(null);
        frame.add(button);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    frame,
                    "Button Clicked!"
                );
            }
        });

        frame.setVisible(true);
    }
}
