import javax.swing.*;

public class ImageDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 13 | Displaying an Image"
        );

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("student.jpg");

        JLabel label = new JLabel(image);

        frame.add(label);

        frame.setVisible(true);
    }
}
