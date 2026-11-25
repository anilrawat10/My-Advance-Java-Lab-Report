import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 17 | Adapter Class"
        );

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(
            "Click inside the window",
            JLabel.CENTER
        );

        frame.add(label);

        frame.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked!");
            }
        });

        frame.setVisible(true);
    }
}
