import javax.swing.*;
import java.awt.*;

public class NestedLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 10 | Nested Layouts"
        );

        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel(
            "Student Management System",
            JLabel.CENTER
        );

        frame.add(title, BorderLayout.NORTH);

        // Inner JPanel using GridLayout
        JPanel panel = new JPanel(new GridLayout(2, 2));

        panel.add(new JLabel("Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Roll No:"));
        panel.add(new JTextField());

        frame.add(panel, BorderLayout.CENTER);

        JButton submit = new JButton("Submit");
        frame.add(submit, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}