package InterfataGrafica;

import javax.swing.*;
import java.awt.*;

public class StudentGUI extends JFrame {

    private Student student = new Student();

    public StudentGUI() {
        setTitle("Student Manager");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // INPUT FIELDS
        JTextField absField = new JTextField(10);
        JTextField labField = new JTextField(10);
        JTextField examField = new JTextField(10);

        // OUTPUT AREA
        JTextArea outputArea = new JTextArea(12, 25);
        outputArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(outputArea);

        // BUTTONS
        JButton addAbsButton = new JButton("Add Absences");
        JButton setLabButton = new JButton("Set Lab Grade");
        JButton setExamButton = new JButton("Set Exam Grade");
        JButton showStatusButton = new JButton("Show Status");
        JButton specialStatusButton = new JButton("Special Status");

        // ACTIONS
        addAbsButton.addActionListener(e -> {
            try {
                int nr = Integer.parseInt(absField.getText());
                student.addAbsences(nr);
                outputArea.setText("Absences updated!");
            } catch (Exception ex) {
                outputArea.setText("Invalid number!");
            }
        });

        setLabButton.addActionListener(e -> {
            try {
                double g = Double.parseDouble(labField.getText());
                student.setLabGrade(g);
                outputArea.setText("Lab grade updated!");
            } catch (Exception ex) {
                outputArea.setText("Invalid grade!");
            }
        });

        setExamButton.addActionListener(e -> {
            try {
                double g = Double.parseDouble(examField.getText());
                student.setExamGrade(g);
                outputArea.setText("Exam grade updated!");
            } catch (Exception ex) {
                outputArea.setText("Invalid grade!");
            }
        });

        showStatusButton.addActionListener(e ->
                outputArea.setText(student.getStatus())
        );

        specialStatusButton.addActionListener(e ->
                outputArea.setText(student.getSpecialStatus())
        );

        // ADD COMPONENTS TO WINDOW
        add(new JLabel("Absences:"));
        add(absField);

        add(new JLabel("Lab grade:"));
        add(labField);

        add(new JLabel("Exam grade:"));
        add(examField);

        add(addAbsButton);
        add(setLabButton);
        add(setExamButton);
        add(showStatusButton);
        add(specialStatusButton);

        add(scroll);

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentGUI();
    }
}

