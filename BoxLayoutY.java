import javax.swing.*;

public class BoxLayoutY {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 07 | BoxLayout Y_AXIS"
        );

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JButton("Add"));
        panel.add(new JButton("Update"));
        panel.add(new JButton("Delete"));
        panel.add(new JButton("Exit"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
