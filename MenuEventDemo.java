import javax.swing.*;

public class MenuEventDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 23 | Menu Event Handling"
        );

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

        newItem.addActionListener(e ->
            JOptionPane.showMessageDialog(
                frame,
                "New selected"
            )
        );

        openItem.addActionListener(e ->
            JOptionPane.showMessageDialog(
                frame,
                "Open selected"
            )
        );

        exitItem.addActionListener(e ->
            System.exit(0)
        );

        frame.setVisible(true);
    }
}
