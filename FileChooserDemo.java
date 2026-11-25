import javax.swing.*;

public class FileChooserDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 19 | JFileChooser"
        );

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Choose File");

        frame.add(button);

        button.addActionListener(e -> {

            JFileChooser chooser =
                new JFileChooser();

            int result = chooser.showOpenDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Selected File: " +
                    chooser.getSelectedFile().getName()
                );
            }
        });

        frame.setVisible(true);
    }
}
