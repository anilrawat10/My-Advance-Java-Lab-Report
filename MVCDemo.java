import javax.swing.*;
import java.awt.*;

// Model
class Student {
    String name;
    String rollNo;

    Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

// View
class StudentView extends JFrame {

    JTextField nameField;
    JTextField rollField;
    JButton button;
    JLabel result;

    StudentView() {

        setTitle(
            "Anil | 25 | MVC Architecture"
        );

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Roll No:"));
        rollField = new JTextField();
        add(rollField);

        button = new JButton("Display");
        add(button);

        result = new JLabel("");
        add(result);

        setVisible(true);
    }
}

// Controller
class StudentController {

    Student model;
    StudentView view;

    StudentController(Student model, StudentView view) {

        this.model = model;
        this.view = view;

        view.button.addActionListener(e -> {

            model.name =
                view.nameField.getText();

            model.rollNo =
                view.rollField.getText();

            view.result.setText(
                model.name + " - " + model.rollNo
            );
        });
    }
}

// Main
public class MVCDemo {

    public static void main(String[] args) {

        Student model =
            new Student("", "");

        StudentView view =
            new StudentView();

        new StudentController(model, view);
    }
}
