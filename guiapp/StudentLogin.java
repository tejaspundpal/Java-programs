package guiapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentLogin extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    String text="";
    private JTextArea textArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentLogin frame = new StudentLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public StudentLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        textField.setBounds(162, 11, 149, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        textField_1.setColumns(10);
        textField_1.setBounds(162, 59, 149, 20);
        contentPane.add(textField_1);

        JLabel lblNewLabel = new JLabel("student_id");
        lblNewLabel.setBounds(43, 14, 157, 14);
        contentPane.add(lblNewLabel);

        textField_2 = new JTextField();
        textField_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        textField_2.setColumns(10);
        textField_2.setBounds(162, 105, 149, 20);
        contentPane.add(textField_2);

        JLabel lblNewLabel_1 = new JLabel("Name");
        lblNewLabel_1.setBounds(43, 62, 46, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("mobile_no.");
        lblNewLabel_2.setBounds(43, 108, 93, 14);
        contentPane.add(lblNewLabel_2);


        JButton btnNewButton = new JButton("submit");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text+= textField.getText()+"\n"+textField_1.getText()+"\n"+textField_2.getText();
                textArea.setText(text);

            }
        });
        btnNewButton.setBounds(335, 58, 89, 39);
        contentPane.add(btnNewButton);

        textArea = new JTextArea();
        textArea.setBounds(43, 146, 381, 104);
        contentPane.add(textArea);
    }
}
