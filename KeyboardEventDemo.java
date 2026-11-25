import javax.swing.*;
import java.awt.event.*;

public class KeyboardEventDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 16 | Keyboard Event Handling"
        );

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(
            "Press any key",
            JLabel.CENTER
        );

        frame.add(label);

        frame.addKeyListener(new KeyListener() {

            public void keyPressed(KeyEvent e) {
                label.setText(
                    "Key Pressed: " + e.getKeyChar()
                );
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyTyped(KeyEvent e) {
            }
        });

        frame.setFocusable(true);
        frame.setVisible(true);
        frame.requestFocus();
    }
}