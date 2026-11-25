import javax.swing.*;
import java.awt.*;

public class ColorFontDemo extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Red rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 120, 70);

        // Blue oval
        g.setColor(Color.BLUE);
        g.fillOval(220, 50, 120, 70);

        // Green text
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Java Swing", 130, 180);

        // Black text
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.ITALIC, 20));
        g.drawString("Colors and Fonts", 130, 220);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 12 | Colors and Fonts"
        );

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new ColorFontDemo());
        frame.setVisible(true);
    }
}
