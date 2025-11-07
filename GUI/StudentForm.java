import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// A simple Student class (represents data)
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}

// GUI class (represents behavior and user interaction)
public class StudentForm extends JFrame implements ActionListener {
    private JTextField nameField, ageField;
    private JTextArea outputArea;
    private JButton addButton;

    public StudentForm() {
        setTitle("Student Info Form");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        nameField = new JTextField(15);
        add(nameField);

        JFrame frame = new JFrame("Line Break Example");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("<html>This is the first line.<br>This is the second line.<br>And this is the third line.</html>");
        frame.add(label);

        add(new JLabel("Age:"));
        ageField = new JTextField(5);
        add(ageField);

        addButton = new JButton("Add Student");
        addButton.addActionListener(this); // Interface method
        add(addButton);

        outputArea = new JTextArea(5, 25);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    // Event-handling method (from ActionListener interface)
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());

        // Create an object of Student
        Student s = new Student(name, age);
        outputArea.append(s.getInfo() + "\n");

        // Clear fields
        nameField.setText("");
        ageField.setText("");
    }

    public static void main(String[] args) {
      new StudentForm();
    }
}
