import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 15 | Mouse Event Handling"
        );

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(
            "Click anywhere inside the window",
            JLabel.CENTER
        );

        frame.add(label);

        frame.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked!");
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        frame.setVisible(true);
    }
}
