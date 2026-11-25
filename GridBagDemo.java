import javax.swing.*;
import java.awt.*;

public class GridBagDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 08 | GridBagLayout"
        );

        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Student Name:"), gbc);

        gbc.gridx = 1;
        panel.add(new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Student ID:"), gbc);

        gbc.gridx = 1;
        panel.add(new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Address:"), gbc);

        gbc.gridx = 1;
        panel.add(new JTextField(15), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Department:"), gbc);

        gbc.gridx = 1;
        panel.add(new JTextField(15), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(new JButton("Submit"), gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
