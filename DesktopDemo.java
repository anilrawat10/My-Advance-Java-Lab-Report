import javax.swing.*;

public class DesktopDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 24 | JDesktopPane and JInternalFrame"
        );

        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktop = new JDesktopPane();

        JInternalFrame window1 =
            new JInternalFrame(
                "Student Window",
                true,
                true,
                true,
                true
            );

        window1.setSize(300, 200);
        window1.setLocation(50, 50);
        window1.add(
            new JLabel("Student Information")
        );
        window1.setVisible(true);

        JInternalFrame window2 =
            new JInternalFrame(
                "Course Window",
                true,
                true,
                true,
                true
            );

        window2.setSize(300, 200);
        window2.setLocation(350, 150);
        window2.add(
            new JLabel("Course Information")
        );
        window2.setVisible(true);

        desktop.add(window1);
        desktop.add(window2);

        frame.add(desktop);
        frame.setVisible(true);
    }
}
