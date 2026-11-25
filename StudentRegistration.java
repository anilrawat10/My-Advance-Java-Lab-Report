import javax.swing.*;

public class StudentRegistration {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 01 | Student Registration Form"
        );

        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Student Registration Form");
        title.setBounds(150, 20, 250, 30);

        JLabel name = new JLabel("Name:");
        name.setBounds(50, 70, 100, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 70, 250, 30);

        JLabel address = new JLabel("Address:");
        address.setBounds(50, 120, 100, 30);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 120, 250, 60);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(50, 200, 100, 30);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 200, 80, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(240, 200, 100, 30);

        JLabel course = new JLabel("Course:");
        course.setBounds(50, 250, 100, 30);

        String courses[] = {"BCA", "BBA", "BIT", "BIM"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 250, 150, 30);

        JCheckBox terms = new JCheckBox("I agree to the terms");
        terms.setBounds(150, 300, 200, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(150, 350, 100, 35);

        frame.add(title);
        frame.add(name);
        frame.add(nameField);
        frame.add(address);
        frame.add(addressArea);
        frame.add(gender);
        frame.add(male);
        frame.add(female);
        frame.add(course);
        frame.add(courseBox);
        frame.add(terms);
        frame.add(submit);

        frame.setVisible(true);
    }
}