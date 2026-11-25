import javax.swing.*;
import java.awt.*;

public class ListTableDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 18 | JList JTable JScrollPane"
        );

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(1, 2));

        // JList
        String subjects[] = {
            "Java",
            "DBMS",
            "Networking",
            "Operating System",
            "Web Technology"
        };

        JList<String> list = new JList<>(subjects);

        JScrollPane listScroll =
            new JScrollPane(list);

        // JTable
        String columns[] = {
            "ID", "Name", "Marks"
        };

        String data[][] = {
            {"1", "Anil", "80"},
            {"2", "Ram", "75"},
            {"3", "Sita", "85"},
            {"4", "Hari", "70"}
        };

        JTable table = new JTable(data, columns);

        JScrollPane tableScroll =
            new JScrollPane(table);

        frame.add(listScroll);
        frame.add(tableScroll);

        frame.setVisible(true);
    }
}
