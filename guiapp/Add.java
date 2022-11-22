package guiapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Add frame = new Add();
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
    public Add() {
        setTitle("CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Enter 1st Number");
        lblNewLabel.setBounds(10, 11, 119, 38);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        textField.setBounds(111, 20, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Enter 2nd Number");
        lblNewLabel_1.setBounds(200, 18, 119, 25);
        contentPane.add(lblNewLabel_1);

        textField_1 = new JTextField();
        textField_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        textField_1.setBounds(306, 20, 86, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Result:");
        lblNewLabel_2.setBounds(143, 99, 79, 25);
        contentPane.add(lblNewLabel_2);

        textField_2 = new JTextField();
        textField_2.setBounds(196, 101, 86, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JButton btnNewButton = new JButton("SUM");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String first, sec, sres;
                int num1, num2, sum;
                first = textField.getText();
                sec = textField_1.getText();
                num1 = Integer.parseInt(first);
                num2 = Integer.parseInt(sec);
                sum = num1 + num2;
                sres = String.valueOf(sum);
                textField_2.setText(sres);

            }
        });
        btnNewButton.setBounds(67, 173, 89, 23);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("SUB");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String first, sec, mres;
                int num1, num2, sub;
                first = textField.getText();
                sec = textField_1.getText();
                num1 = Integer.parseInt(first);
                num2 = Integer.parseInt(sec);
                sub = num1 - num2;
                mres = String.valueOf(sub);
                textField_2.setText(mres);
            }
        });
        btnNewButton_1.setBounds(273, 173, 89, 23);
        contentPane.add(btnNewButton_1);
    }
}
