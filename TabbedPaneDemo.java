import javax.swing.*;
import java.awt.*;

public class TabbedPaneDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 20 | JTabbedPane"
        );

        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();

        // Personal Information
        JPanel personal = new JPanel(
            new GridLayout(3, 2, 5, 5)
        );

        personal.add(new JLabel("Name:"));
        personal.add(new JTextField());

        personal.add(new JLabel("Address:"));
        personal.add(new JTextField());

        personal.add(new JLabel("Phone:"));
        personal.add(new JTextField());

        // Academic Information
        JPanel academic = new JPanel(
            new GridLayout(3, 2, 5, 5)
        );

        academic.add(new JLabel("College:"));
        academic.add(new JTextField());

        academic.add(new JLabel("Program:"));
        academic.add(new JTextField());

        academic.add(new JLabel("Roll No:"));
        academic.add(new JTextField());

        tabs.addTab(
            "Personal Information",
            personal
        );

        tabs.addTab(
            "Academic Information",
            academic
        );

        frame.add(tabs);
        frame.setVisible(true);
    }
}
