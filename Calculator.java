import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    static double num1 = 0;
    static double num2 = 0;
    static String operator = "";
    static boolean newNumber = true;

    public static void main(String[] args) {

        // Main Frame
        JFrame frame = new JFrame("Modern Calculator");
        frame.setSize(380, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // Main Panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBackground(new Color(30, 30, 30));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Display
        JTextField display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 32));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(new Color(45, 45, 45));
        display.setForeground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        mainPanel.add(display, BorderLayout.NORTH);

        // Button Panel
        JPanel panel = new JPanel(new GridLayout(5, 4, 10, 10));
        panel.setBackground(new Color(30, 30, 30));

        // Buttons
        JButton clear = createButton("AC", new Color(220, 70, 70));
        JButton backspace = createButton("⌫", new Color(100, 100, 100));
        JButton divide = createButton("/", new Color(255, 140, 0));
        JButton multiply = createButton("*", new Color(255, 140, 0));

        JButton seven = createButton("7", new Color(60, 60, 60));
        JButton eight = createButton("8", new Color(60, 60, 60));
        JButton nine = createButton("9", new Color(60, 60, 60));
        JButton minus = createButton("-", new Color(255, 140, 0));

        JButton four = createButton("4", new Color(60, 60, 60));
        JButton five = createButton("5", new Color(60, 60, 60));
        JButton six = createButton("6", new Color(60, 60, 60));
        JButton plus = createButton("+", new Color(255, 140, 0));

        JButton one = createButton("1", new Color(60, 60, 60));
        JButton two = createButton("2", new Color(60, 60, 60));
        JButton three = createButton("3", new Color(60, 60, 60));
        JButton equals = createButton("=", new Color(50, 150, 80));

        JButton zero = createButton("0", new Color(60, 60, 60));
        JButton decimal = createButton(".", new Color(60, 60, 60));
        JButton accept = createButton("Accept", new Color(50, 120, 200));

        // Add buttons
        panel.add(clear);
        panel.add(backspace);
        panel.add(divide);
        panel.add(multiply);

        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(minus);

        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(plus);

        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(equals);

        panel.add(zero);
        panel.add(decimal);
        panel.add(accept);

        mainPanel.add(panel, BorderLayout.CENTER);

        // Number buttons
        JButton[] numberButtons = {
            zero, one, two, three, four,
            five, six, seven, eight, nine
        };

        for (JButton button : numberButtons) {

            button.addActionListener(e -> {

                String value = button.getText();

                if (newNumber || display.getText().equals("0")) {
                    display.setText(value);
                    newNumber = false;
                } else {
                    display.setText(display.getText() + value);
                }
            });
        }

        // Decimal
        decimal.addActionListener(e -> {

            if (newNumber) {
                display.setText("0.");
                newNumber = false;
            }
            else if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        });

        // Operators
        plus.addActionListener(e -> setOperator(display, "+"));
        minus.addActionListener(e -> setOperator(display, "-"));
        multiply.addActionListener(e -> setOperator(display, "*"));
        divide.addActionListener(e -> setOperator(display, "/"));

        // Equals
        equals.addActionListener(e -> calculate(display));

        // Clear
        clear.addActionListener(e -> {

            display.setText("0");
            num1 = 0;
            num2 = 0;
            operator = "";
            newNumber = true;
        });

        // Backspace
        backspace.addActionListener(e -> {

            String text = display.getText();

            if (text.length() > 1) {
                display.setText(text.substring(0, text.length() - 1));
            } else {
                display.setText("0");
                newNumber = true;
            }
        });

        // Accept Button
        accept.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    frame,
                    "Calculation Accepted!\nResult: " + display.getText(),
                    "Accepted",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // Add to frame
        frame.add(mainPanel);

        frame.setVisible(true);
    }

    // Create Operator
    static void setOperator(JTextField display, String op) {

        if (!display.getText().equals("")) {

            num1 = Double.parseDouble(display.getText());
            operator = op;
            newNumber = true;
        }
    }

    // Calculate Result
    static void calculate(JTextField display) {

        if (operator.equals("") || newNumber) {
            return;
        }

        num2 = Double.parseDouble(display.getText());

        double result = 0;

        switch (operator) {

            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":

                if (num2 == 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Cannot divide by zero!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                    display.setText("0");
                    return;
                }

                result = num1 / num2;
                break;
        }

        // Remove unnecessary .0
        if (result == (long) result) {
            display.setText(String.valueOf((long) result));
        } else {
            display.setText(String.valueOf(result));
        }

        newNumber = true;
        operator = "";
    }

    // Button Design
    static JButton createButton(String text, Color color) {

        JButton button = new JButton(text);

        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setForeground(Color.WHITE);
        button.setBackground(color);

        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);

        // Hover Effect
        button.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(color.brighter());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(color);
            }
        });

        return button;
    }
}