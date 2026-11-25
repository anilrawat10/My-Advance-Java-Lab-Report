import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 03 | FlowLayout"
        );

        frame.setSize(500, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton add = new JButton("Add");
        JButton update = new JButton("Update");
        JButton delete = new JButton("Delete");
        JButton exit = new JButton("Exit");

        frame.add(add);
        frame.add(update);
        frame.add(delete);
        frame.add(exit);

        frame.setVisible(true);
    }
}