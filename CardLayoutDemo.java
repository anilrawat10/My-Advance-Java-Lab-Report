import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 09 | CardLayout"
        );

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        JPanel cards = new JPanel(cardLayout);

        // Login Panel
        JPanel loginPanel = new JPanel();

        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(new JTextField(10));

        JButton login = new JButton("Login");
        loginPanel.add(login);

        JButton welcomeButton = new JButton("Go to Welcome");
        loginPanel.add(welcomeButton);

        // Welcome Panel
        JPanel welcomePanel = new JPanel();

        welcomePanel.add(new JLabel("Welcome to Student System"));

        JButton backButton = new JButton("Back to Login");
        welcomePanel.add(backButton);

        cards.add(loginPanel, "login");
        cards.add(welcomePanel, "welcome");

        welcomeButton.addActionListener(e ->
            cardLayout.show(cards, "welcome")
        );

        backButton.addActionListener(e ->
            cardLayout.show(cards, "login")
        );

        frame.add(cards);
        frame.setVisible(true);
    }
}
