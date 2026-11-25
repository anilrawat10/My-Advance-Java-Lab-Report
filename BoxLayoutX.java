import javax.swing.*;

public class BoxLayoutX {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 06 | BoxLayout X_AXIS"
        );

        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JButton("Add"));
        panel.add(new JButton("Update"));
        panel.add(new JButton("Delete"));
        panel.add(new JButton("Exit"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
