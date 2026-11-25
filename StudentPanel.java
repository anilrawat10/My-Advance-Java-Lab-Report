import javax.swing.*;
import java.awt.*;

public class StudentPanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 02 | JPanel Student Form"
        );

        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel personalPanel = new JPanel();
        personalPanel.setBorder(
            BorderFactory.createTitledBorder("Personal Information")
        );

        personalPanel.add(new JLabel("Name:"));
        personalPanel.add(new JTextField(15));

        JPanel academicPanel = new JPanel();
        academicPanel.setBorder(
            BorderFactory.createTitledBorder("Academic Information")
        );

        academicPanel.add(new JLabel("Course:"));
        academicPanel.add(new JTextField(15));

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(new JButton("Submit"));
        buttonPanel.add(new JButton("Clear"));

        frame.add(personalPanel, BorderLayout.NORTH);
        frame.add(academicPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}