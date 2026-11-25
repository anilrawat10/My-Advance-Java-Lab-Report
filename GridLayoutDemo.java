import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 05 | GridLayout"
        );

        frame.setSize(500, 350);
        frame.setLayout(new GridLayout(3, 4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 1; i <= 12; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setVisible(true);
    }
}
